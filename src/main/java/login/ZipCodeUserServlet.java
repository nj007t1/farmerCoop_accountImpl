package login;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ZipCodeUserServlet
 */
@WebServlet("/zipCodeUserServlet.do")
public class ZipCodeUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ZipCodeDAO zcdao = new ZipCodeDAO();
		List<ZipCodeBean> list = zcdao.zipCodeList();
		request.setAttribute("zipList", list);
		
		Set<String> cities = new LinkedHashSet<>();//重複的刪掉,照順序排列
		for(ZipCodeBean zip:list){
			cities.add(zip.getZipCountyName());
		}
		request.setAttribute("cities", cities);
		
		RequestDispatcher rd = request.getRequestDispatcher("/manage/updateConsumer.jsp");
		rd.forward(request, response);
		return;
		
	}

}
