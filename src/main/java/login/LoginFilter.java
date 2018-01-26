package login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


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
		chain.doFilter(request, response);
			
	}
	private boolean mustLogin(String servletPath){
		boolean login = false;
		for(String sURL : url){
			if(sURL.endsWith("*")){
				sURL = sURL.substring(0,sURL.length()-1);
				
			}
		}
		return login;
	}

	public void init(FilterConfig fConfig) throws ServletException {
		Enumeration<String> e = fConfig.getInitParameterNames();
		while(e.hasMoreElements()){
			String name = e.nextElement();
			url.add(fConfig.getInitParameter(name));
		}
	}

}
