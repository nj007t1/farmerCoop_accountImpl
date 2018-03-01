package login;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

		String rememberMe = request.getParameter("rememberMe");
//		System.out.println("servlet: 進入servlet");

		
		
		System.out.println("servlet: 進入servlet");


		if (userMail == null || userMail.trim().length() == 0) {
//			System.out.println("servlet: empty email");
			errorMsgMap.put("mailEmptyError", "請輸入E-Mail");

		}

		if (userPassword == null || userPassword.trim().length() == 0) {
			errorMsgMap.put("passwordEmptyError", "請輸入密碼");
//			System.out.println("servlet: empty password");
		}

		LoginService ls = new LoginService();
		MemberBean mb = ls.checkLoginInfo(userMail, userPassword);

		if (mb != null) {
			Timestamp userLastLoginTime = new Timestamp(new Date().getTime());
			mb.setUserLastLoginTime(userLastLoginTime);
			MemberDAO dao = new MemberDAO();
			dao.update(mb);

			session.setAttribute("ApplyDate", mb.userApplyDate);

			dao.findByEmail(userMail);

			session.setAttribute("LoginOK", mb);
//			System.out.println("servlet: login OK");
		} else {
			errorMsgMap.put("loginError", "帳號不存在或密碼不正確");
//			System.out.println("servlet: login FAILED~");
		}

		// 記住密碼
		Cookie cookieUser = null;
		Cookie cookiePassword = null;
		Cookie cookieRememberMe = null;
		MemberBean memberBean = (MemberBean) session.getAttribute("LoginOK");
//		System.out.println(memberBean);
		if(memberBean != null){
			Timestamp ts = memberBean.getUserApplyDate();
//		System.out.println(ts);
		// 16字元的格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
		// //把16字元轉成字串
		String key = sdf.format(ts);
		if (rememberMe != null) {
			cookieUser = new Cookie("user", userMail);
			cookieUser.setMaxAge(30 * 60 * 60);
			cookieUser.setPath(request.getContextPath());
			String encodePasswoed = SecurityUtils.encryptString(key, userPassword);
			cookiePassword = new Cookie("password", encodePasswoed);
			cookiePassword.setMaxAge(30 * 60 * 60);
			cookiePassword.setPath(request.getContextPath());

			cookieRememberMe = new Cookie("rm", "true");
			cookieRememberMe.setMaxAge(30 * 60 * 60);
			cookieRememberMe.setPath(request.getContextPath());
		} else {
			cookieUser = new Cookie("user", userMail);
			cookieUser.setMaxAge(0);
			cookieUser.setPath(request.getContextPath());
			String encodePasswoed = SecurityUtils.encryptString(key, userPassword);
			cookiePassword = new Cookie("password", encodePasswoed);
			cookiePassword.setMaxAge(0);
			cookiePassword.setPath(request.getContextPath());

			cookieRememberMe = new Cookie("rm", "true");
			cookieRememberMe.setMaxAge(0);
			cookieRememberMe.setPath(request.getContextPath());
		}
		response.addCookie(cookieUser);
		response.addCookie(cookiePassword);
		response.addCookie(cookieRememberMe);
		}
		
		
		if (errorMsgMap.isEmpty()) {
			String contextPath = getServletContext().getContextPath();
			String target = (String) session.getAttribute("target");
			if (target != null) {
//				System.out.println("target不是空的");
				session.removeAttribute("target");
				response.sendRedirect(contextPath + target);

			} else {
				response.sendRedirect(contextPath + "/home.jsp");
//				System.out.println("回首頁");
			}
			return;
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
			return;
		}

	}

}
