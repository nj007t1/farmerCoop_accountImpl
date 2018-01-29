package login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter(
		urlPatterns = { "/*" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "/manage/*")
		})
public class LoginFilter implements Filter {
	Collection<String> url = new ArrayList<String>();
    
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		String servletPath = req.getServletPath();
		if(mustLogin(servletPath)){ //判斷是否必須登錄
			if(checkLogin(req)){//判斷是否已經登入
				System.out.println("filter:需要登入,已經登入狀態");
				chain.doFilter(request, response);
			}else{
				HttpSession session = req.getSession();
				session.setAttribute("target", req.getServletPath());
				System.out.println("filter:需要登入,還沒登入");
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.forward(req, resp);
			}
		}else{
			System.out.println("filter:不需要登入");
			chain.doFilter(request, response);
		}
		
			
	}
	private boolean mustLogin(String servletPath){
		boolean login = false;
		for(String sURL : url){
			if(sURL.endsWith("*")){
				System.out.println("filter: mustlogin 有session");
				sURL = sURL.substring(0,sURL.length()-1);
				if(servletPath.startsWith(sURL)){
				login = true;
				}else{
					login = false;
				}
			}
		}
		return login;
	}
	
	private boolean checkLogin(HttpServletRequest request){
		HttpSession session = request.getSession();
		System.out.println("filter:checkLogin getsession id = "+request.getSession().getId());
		MemberBean loginToken = (MemberBean) session.getAttribute("LoginOK");
		System.out.println("filter:是否抓到Login"+loginToken);
		if(loginToken == null){
			System.out.println("filter:checkLogin:不成功");
			return false;
		}else{
			System.out.println("filter:checkLogin:成功");
			return true;
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		Enumeration<String> e = fConfig.getInitParameterNames();
		while(e.hasMoreElements()){
			String name = e.nextElement();
			url.add(fConfig.getInitParameter(name));
		}
	}

}
