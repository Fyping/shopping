package cn.com.fangself.filter;

import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Servlet Filter implementation class VisitorRecord
 */
@WebFilter("/VisitorRecord")
public class VisitorRecord extends OncePerRequestFilter implements Filter {

    /**
     * Default constructor. 
     */
    public VisitorRecord() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("visitor-----------------------------------------------");
		HttpServletRequest req = (HttpServletRequest) request;
		String remoteUser = req.getRemoteUser();
		String remoteHost = req.getRemoteHost();
		Principal principal = req.getUserPrincipal();
		String requestSessionId = req.getRequestedSessionId();
		Enumeration<String> headerNames = req.getHeaderNames();
		HttpSession session = req.getSession();
		String sessionid = session.getId();
		
		System.out.println("remoteUser :"+remoteUser+
				"     remoteHost:" + remoteHost+
				"     requestSessionId:"+requestSessionId+
				"     sessionid:"+sessionid
				);
		
		chain.doFilter(request, response);

	}

}
