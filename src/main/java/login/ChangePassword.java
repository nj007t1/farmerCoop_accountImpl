package login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/changePassword.do")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDAO dao = new MemberDAO();
		MemberBean memberBean = (MemberBean) session.getAttribute("LoginOK");
		request.setCharacterEncoding("UTF-8");
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);

		String password = request.getParameter("password");

		String encrypt = SecurityUtils.getEncryptPassword(password, memberBean.getUserApplyDate());
		if (password == null || password.trim().length() == 0) {
			errorMessage.put("password", "必須輸入原本密碼");

		} else if (!encrypt.equals(memberBean.getUserPasswd())) {
			errorMessage.put("password", "與原本密碼不一致");

		}

		String newPassword = request.getParameter("newPassword");
		if (newPassword == null || newPassword.trim().length() == 0) {
			errorMessage.put("newPassword", "必須輸入新密碼");
		} else if ((newPassword.length() > 20) || (newPassword.length() < 8)) {
			errorMessage.put("newPassword", "密碼長度需8-20個字元");
		} else if (!newPassword.matches("^(?=.*\\d)(?=.*[a-zA-Z]).{8,20}$")) {
			errorMessage.put("newPassword", "密碼須包含英文、數字");
		}

		String checkPassword = request.getParameter("checkPassword");
		if (checkPassword == null || checkPassword.trim().length() == 0) {
			errorMessage.put("checkPassword", "必須再次輸入新密碼");
		}

		if (!newPassword.equals(checkPassword)) {
			errorMessage.put("checkPassword", "兩次密碼不一致");
		}

		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/changePassword.jsp");
			rd.forward(request, response);
			return;
		}

		// 密碼加密
		
		String newencrypt = SecurityUtils.getEncryptPassword(newPassword, memberBean.getUserApplyDate());
		memberBean.setUserPasswd(newencrypt);
		dao.update(memberBean);

		RequestDispatcher rd = request.getRequestDispatcher("/changePasswordSuccess.jsp");
		rd.forward(request, response);
		return;

	}

}
