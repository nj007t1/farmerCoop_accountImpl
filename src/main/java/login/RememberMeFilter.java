package login;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/login.jsp")
public class RememberMeFilter implements Filter {

	String requestURI;

	public RememberMeFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession();

		String cookieName = "";
		String user = "";
		String password = "";
		String rememberMe = "false";

		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookieName = cookies[i].getName();
				if (cookieName.equals("user")) {
					user = cookies[i].getValue();
				} else if (cookieName.equals("password")) {
					String tmp = cookies[i].getValue();	
					Timestamp applyDate = (Timestamp) session.getAttribute("ApplyDate");
					if(applyDate!=null){					
//						System.out.println(applyDate);
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
						String key = sdf.format(applyDate);
						password = SecurityUtils.decryptString(key, tmp);					
					}			
					
					
				} else if (cookieName.equals("rm")) {
					rememberMe = cookies[i].getValue();
				}
			}
		} else {
			;
		}
		session.setAttribute("rememberMe", rememberMe);
		session.setAttribute("user", user);
		session.setAttribute("password", password);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
