package login;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateFarmer
 */
@WebServlet("/updateFarmer.do")
public class UpdateFarmer extends HttpServlet {
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
		String farmerLastName = request.getParameter("farmerLastName");
		if (farmerLastName == null || farmerLastName.trim().length() == 0) {
			errorMessage.put("farmerLastName", "姓氏欄位不可空白");
		}
		String farmerFirstName = request.getParameter("farmerFirstName");
		if (farmerFirstName == null || farmerFirstName.trim().length() == 0) {
			errorMessage.put("farmerFirstName", "名字欄位不可空白");
		}
		String farmerAddress = request.getParameter("farmerAddress");
		if (farmerAddress == null || farmerAddress.trim().length() == 0) {
			errorMessage.put("farmerAddress", "聯絡地址欄位不可空白");
		}
		String farmerMobile = request.getParameter("farmerMobile");
		if (farmerMobile == null || farmerMobile.trim().length() == 0) {
			errorMessage.put("farmerMobile", "手機欄位不可空白");
		}
		String farmerTel = request.getParameter("farmerTel");
		if (farmerTel == null || farmerTel.trim().length() == 0) {
			errorMessage.put("farmerTel", "電話欄位不可空白");
		}
		
		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/manage/updateFarmer.jsp");
			rd.forward(request, response);
			return;
		}


		
		String farmerTelExt = request.getParameter("farmerTelExt");
		String zipCode = request.getParameter("zipCode");
		MemberBean memberBean = (MemberBean) session.getAttribute("LoginOK");
		memberBean.setuserLastName(farmerLastName);
		memberBean.setUserFirstName(farmerFirstName);
		memberBean.setFarmerZipCode(zipCode);
		memberBean.setFarmerAddress(farmerAddress);
		memberBean.setFarmerMobile(farmerMobile);
		memberBean.setFarmerTel(farmerTel);
		memberBean.setFarmerTelExt(farmerTelExt);
		MemberDAO dao = new MemberDAO();
		dao.update(memberBean);
		
		

		RequestDispatcher rd = request.getRequestDispatcher("/manage/updateFarmerSuccess.jsp");
		rd.forward(request, response);
		return;

	}

}
