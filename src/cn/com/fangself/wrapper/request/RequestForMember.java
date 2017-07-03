package cn.com.fangself.wrapper.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import cn.com.fangself.model.vo.MemberVo;

public class RequestForMember extends HttpServletRequestWrapper {

	public MemberVo memberVo = null;
	
	public HttpServletRequest  request= null;
	
	public RequestForMember(HttpServletRequest request) {
		super(request);
		this.request = (HttpServletRequest)super.getRequest();
		System.out.println("user name is "+ this.request.getParameter("username"));
		this.memberVo = getMemberVo();
		System.out.println("memberVo is " + this.memberVo);
		
	}
	public MemberVo getMemberVo(){
		
		MemberVo memberVoCp = new MemberVo();
		memberVoCp.setUsername(this.request.getParameter("username"));
		memberVoCp.setUserpwd(this.request.getParameter("userpwd"));
		memberVoCp.setEmail(this.request.getParameter("email"));
		memberVoCp.setAddress(this.request.getParameter("address"));
		memberVoCp.setMemberuuid(this.request.getParameter("memberuuid"));
		memberVoCp.setPhonenum(this.request.getParameter("phonenum"));
		memberVoCp.setPostcode(this.request.getParameter("postcode"));
		memberVoCp.setRealname(this.request.getParameter("realname"));
		try{
			Integer sex = Integer.parseInt(this.request.getParameter("sex"));
			memberVoCp.setSex(sex);
			Integer memberId = Integer.parseInt(this.request.getParameter("memberid"));
			memberVoCp.setMemberid(memberId);
		}catch(NumberFormatException nfe){
			
		}
		return memberVoCp;
	}
	@Override
	public String getParameter(String name) {
		String nameValue = super.getParameter(name);
		if(this.request.getMethod().equals("GET")){
			try {
				name = new String(nameValue.getBytes("ISO-8859-1"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return nameValue;
	}

	@Override
	public Enumeration<String> getParameterNames() {
		if(this.request.getMethod().equals("GET")){
			Enumeration<String> enumeration = getParameterNames();
			Vector<String> paramNames = new Vector<String>();
			while(enumeration.hasMoreElements()){
				String names = enumeration.nextElement();
				paramNames.add(names);
			}
			return  paramNames.elements();
		}else{
			return super.getParameterNames();
		}
	}

	@Override
	public String[] getParameterValues(String name) {
		if(this.request.getMethod().equals("GET")){
			String[] values = super.getParameterValues(name);
			for(int i=0;i<values.length;i++){
				try {
					values[i] = new String(values[i].getBytes("ISO-8859-1"),"UTF-8");
				} catch (UnsupportedEncodingException e) {
				}
			}
			return values;
		}else{
			return super.getParameterValues(name);	
		}
	}
	
	
	/**
	 * The following method is overrided bacause of test needs 
	 * */
	@Override
	public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		return super.authenticate(response);
	}
	@Override
	public String getAuthType() {
		// TODO Auto-generated method stub
		return super.getAuthType();
	}
	@Override
	public String getContextPath() {
		// TODO Auto-generated method stub
		return super.getContextPath();
	}
	@Override
	public Cookie[] getCookies() {
		// TODO Auto-generated method stub
		return super.getCookies();
	}
	@Override
	public long getDateHeader(String name) {
		// TODO Auto-generated method stub
		return super.getDateHeader(name);
	}
	@Override
	public String getHeader(String name) {
		// TODO Auto-generated method stub
		return super.getHeader(name);
	}
	@Override
	public Enumeration<String> getHeaderNames() {
		// TODO Auto-generated method stub
		return super.getHeaderNames();
	}
	@Override
	public Enumeration<String> getHeaders(String name) {
		// TODO Auto-generated method stub
		return super.getHeaders(name);
	}
	@Override
	public int getIntHeader(String name) {
		// TODO Auto-generated method stub
		return super.getIntHeader(name);
	}
	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return super.getMethod();
	}
	@Override
	public Part getPart(String name) throws IllegalStateException, IOException, ServletException {
		// TODO Auto-generated method stub
		return super.getPart(name);
	}
	@Override
	public Collection<Part> getParts() throws IllegalStateException, IOException, ServletException {
		// TODO Auto-generated method stub
		return super.getParts();
	}
	@Override
	public String getPathInfo() {
		// TODO Auto-generated method stub
		return super.getPathInfo();
	}
	@Override
	public String getPathTranslated() {
		// TODO Auto-generated method stub
		return super.getPathTranslated();
	}
	@Override
	public String getQueryString() {
		// TODO Auto-generated method stub
		return super.getQueryString();
	}
	@Override
	public String getRemoteUser() {
		// TODO Auto-generated method stub
		return super.getRemoteUser();
	}
	@Override
	public String getRequestURI() {
		// TODO Auto-generated method stub
		return super.getRequestURI();
	}
	@Override
	public StringBuffer getRequestURL() {
		// TODO Auto-generated method stub
		return super.getRequestURL();
	}
	@Override
	public String getRequestedSessionId() {
		// TODO Auto-generated method stub
		return super.getRequestedSessionId();
	}
	@Override
	public String getServletPath() {
		// TODO Auto-generated method stub
		return super.getServletPath();
	}
	@Override
	public HttpSession getSession() {
		// TODO Auto-generated method stub
		return super.getSession();
	}
	@Override
	public HttpSession getSession(boolean create) {
		// TODO Auto-generated method stub
		return super.getSession(create);
	}
	@Override
	public Principal getUserPrincipal() {
		// TODO Auto-generated method stub
		return super.getUserPrincipal();
	}
	@Override
	public boolean isRequestedSessionIdFromCookie() {
		// TODO Auto-generated method stub
		return super.isRequestedSessionIdFromCookie();
	}
	@Override
	public boolean isRequestedSessionIdFromURL() {
		// TODO Auto-generated method stub
		return super.isRequestedSessionIdFromURL();
	}
	@Override
	public boolean isRequestedSessionIdFromUrl() {
		// TODO Auto-generated method stub
		return super.isRequestedSessionIdFromUrl();
	}
	@Override
	public boolean isRequestedSessionIdValid() {
		// TODO Auto-generated method stub
		return super.isRequestedSessionIdValid();
	}
	@Override
	public boolean isUserInRole(String role) {
		// TODO Auto-generated method stub
		return super.isUserInRole(role);
	}
	@Override
	public void login(String username, String password) throws ServletException {
		// TODO Auto-generated method stub
		super.login(username, password);
	}
	@Override
	public void logout() throws ServletException {
		// TODO Auto-generated method stub
		super.logout();
	}
	@Override
	public AsyncContext getAsyncContext() {
		// TODO Auto-generated method stub
		return super.getAsyncContext();
	}
	@Override
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return super.getAttribute(name);
	}
	@Override
	public Enumeration<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return super.getAttributeNames();
	}
	@Override
	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		return super.getCharacterEncoding();
	}
	@Override
	public int getContentLength() {
		// TODO Auto-generated method stub
		return super.getContentLength();
	}
	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return super.getContentType();
	}
	@Override
	public DispatcherType getDispatcherType() {
		// TODO Auto-generated method stub
		return super.getDispatcherType();
	}
	@Override
	public ServletInputStream getInputStream() throws IOException {
		// TODO Auto-generated method stub
		return super.getInputStream();
	}
	@Override
	public String getLocalAddr() {
		// TODO Auto-generated method stub
		return super.getLocalAddr();
	}
	@Override
	public String getLocalName() {
		// TODO Auto-generated method stub
		return super.getLocalName();
	}
	@Override
	public int getLocalPort() {
		// TODO Auto-generated method stub
		return super.getLocalPort();
	}
	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return super.getLocale();
	}
	@Override
	public Enumeration<Locale> getLocales() {
		// TODO Auto-generated method stub
		return super.getLocales();
	}
	@Override
	public Map<String, String[]> getParameterMap() {
		// TODO Auto-generated method stub
		return super.getParameterMap();
	}
	@Override
	public String getProtocol() {
		// TODO Auto-generated method stub
		return super.getProtocol();
	}
	@Override
	public BufferedReader getReader() throws IOException {
		// TODO Auto-generated method stub
		return super.getReader();
	}
	@Override
	public String getRealPath(String path) {
		// TODO Auto-generated method stub
		return super.getRealPath(path);
	}
	@Override
	public String getRemoteAddr() {
		// TODO Auto-generated method stub
		return super.getRemoteAddr();
	}
	@Override
	public String getRemoteHost() {
		// TODO Auto-generated method stub
		return super.getRemoteHost();
	}
	@Override
	public int getRemotePort() {
		// TODO Auto-generated method stub
		return super.getRemotePort();
	}
	@Override
	public ServletRequest getRequest() {
		// TODO Auto-generated method stub
		return super.getRequest();
	}
	@Override
	public RequestDispatcher getRequestDispatcher(String path) {
		// TODO Auto-generated method stub
		return super.getRequestDispatcher(path);
	}
	@Override
	public String getScheme() {
		// TODO Auto-generated method stub
		return super.getScheme();
	}
	@Override
	public String getServerName() {
		// TODO Auto-generated method stub
		return super.getServerName();
	}
	@Override
	public int getServerPort() {
		// TODO Auto-generated method stub
		return super.getServerPort();
	}
	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return super.getServletContext();
	}
	@Override
	public boolean isAsyncStarted() {
		// TODO Auto-generated method stub
		return super.isAsyncStarted();
	}
	@Override
	public boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return super.isAsyncSupported();
	}
	@Override
	public boolean isSecure() {
		// TODO Auto-generated method stub
		return super.isSecure();
	}
	@Override
	public boolean isWrapperFor(ServletRequest wrapped) {
		// TODO Auto-generated method stub
		return super.isWrapperFor(wrapped);
	}
	@Override
	public boolean isWrapperFor(Class wrappedType) {
		// TODO Auto-generated method stub
		return super.isWrapperFor(wrappedType);
	}
	@Override
	public void removeAttribute(String name) {
		// TODO Auto-generated method stub
		super.removeAttribute(name);
	}
	@Override
	public void setAttribute(String name, Object o) {
		// TODO Auto-generated method stub
		super.setAttribute(name, o);
	}
	@Override
	public void setCharacterEncoding(String enc) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		super.setCharacterEncoding(enc);
	}
	@Override
	public void setRequest(ServletRequest request) {
		// TODO Auto-generated method stub
		super.setRequest(request);
	}
	@Override
	public AsyncContext startAsync() {
		// TODO Auto-generated method stub
		return super.startAsync();
	}
	@Override
	public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
			throws IllegalStateException {
		// TODO Auto-generated method stub
		return super.startAsync(servletRequest, servletResponse);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}
