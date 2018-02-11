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
 * Servlet implementation class updateConsumer
 */
@WebServlet("/updateConsumer.do")
public class UpdateConsumer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("errorMsg", errorMessage);
		String userLastName = request.getParameter("userLastName");
		if (userLastName == null || userLastName.trim().length() == 0) {
			errorMessage.put("userLastName", "姓氏欄位不可空白");
		}
		String userFirstName = request.getParameter("userFirstName");
		if (userFirstName == null || userFirstName.trim().length() == 0) {
			errorMessage.put("userFirstName", "名字欄位不可空白");
		}
		String userAddress = request.getParameter("userAddress");
		if (userAddress == null || userAddress.trim().length() == 0) {
			errorMessage.put("userAddress", "聯絡地址欄位不可空白");
		}
		String userMobile = request.getParameter("userMobile");
		if (userMobile == null || userMobile.trim().length() == 0) {
			errorMessage.put("userMobile", "手機欄位不可空白");
		}
		String userTel = request.getParameter("userTel");
		if (userTel == null || userTel.trim().length() == 0) {
			errorMessage.put("userTel", "電話欄位不可空白");
		}
		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/manage/updateConsumer.jsp");
			rd.forward(request, response);
			return;
		}
		String userTelExt = request.getParameter("userTelExt");
		MemberBean memberBean = (MemberBean) session.getAttribute("LoginOK");
		memberBean.setuserLastName(userLastName);
		memberBean.setUserFirstName(userFirstName);
		memberBean.setUserAddress(userAddress);
		memberBean.setUserMobile(userMobile);
		memberBean.setUserTel(userTel);
		memberBean.setUserTelExt(userTelExt);
		MemberDAO dao = new MemberDAO();
		dao.update(memberBean);
		RequestDispatcher rd = request.getRequestDispatcher("/manage/updateConsumerSuccess.jsp");
		rd.forward(request, response);
		return;
	}

}
