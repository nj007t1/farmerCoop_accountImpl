package farmerProfile;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.Clob;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Blob;

import login.MemberBean;
import login.MemberDAO;

@WebServlet("/farmerProfileServlet.do")
public class FarmerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final char[] Clob = null;

	public FarmerProfileServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		MemberBean mb = (MemberBean) session.getAttribute("LoginOK");
		MemberDAO dao = new MemberDAO();
		
	
		if(mb!=null){
				//將String轉成Clob後再放入第二個建構子參數中
				//MemberBean FPBean = new MemberBean(mb.getUserEmail(),stringToClob(farmerProfile));
				String farmerProfile = request.getParameter("farmerProfile");
				
				MemberBean FPBean = new MemberBean(mb.getUserEmail(),farmerProfile);
				dao.updateFarmerProfile(FPBean);
				
		}
		
		
		
		
		response.sendRedirect("manage/farmerProfile.jsp");
		return;

	}
	//將String轉成Clob的方法
	public static Clob stringToClob(String str) {
	    if (null == str)
	        return null;
	    else {
	        try {
	            java.sql.Clob c = new javax.sql.rowset.serial.SerialClob(str.toCharArray());
	            return c;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	}
}
