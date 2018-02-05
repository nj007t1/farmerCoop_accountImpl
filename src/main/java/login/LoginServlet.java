package login;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Map<String, String> errorMsgMap = new HashMap<String, String>();
		request.setAttribute("errorMasgKey", errorMsgMap);
		String userMail = request.getParameter("userMail");
		String userPassword = request.getParameter("userPassword");

		System.out.println("servlet: 進入servlet");

		if (userMail == null || userMail.trim().length() == 0) {
			System.out.println("servlet: empty email");
			errorMsgMap.put("mailEmptyError", "請輸入E-Mail");

		}

		if (userPassword == null || userPassword.trim().length() == 0) {
			errorMsgMap.put("passwordEmptyError", "請輸入密碼");
			System.out.println("servlet: empty password");
		}

		LoginService ls = new LoginService();
		MemberBean mb = ls.checkLoginInfo(userMail, userPassword);

		if (mb != null) {
			Timestamp userLastLoginTime = new Timestamp(new Date().getTime());
			mb.setUserLastLoginTime(userLastLoginTime);
			MemberDAO dao = new MemberDAO();
			dao.update(mb);

			session.setAttribute("LoginOK", mb);
			System.out.println("servlet: login OK");
		} else {
			errorMsgMap.put("loginError", "帳號不存在或密碼不正確");
			System.out.println("servlet: login FAILED~");
		}
		if (errorMsgMap.isEmpty()) {
			String contextPath = getServletContext().getContextPath();
			String target = (String) session.getAttribute("target");
			if (target != null) {
				session.removeAttribute("target");
				response.sendRedirect(contextPath + target);
			} else {
				response.sendRedirect(contextPath + "/home.jsp");
				System.out.println("回首頁");
			}
			return;
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
			return;
		}
	}
}
