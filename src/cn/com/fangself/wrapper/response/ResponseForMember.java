package cn.com.fangself.wrapper.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import cn.com.fangself.model.vo.MemberVo;

public class ResponseForMember extends HttpServletResponseWrapper {

	public MemberVo memberVo = null;
	
	public ResponseForMember(HttpServletResponse response) {
		super(response);
	}
	/**
	 * 
	 *  method just for test needs 
	 * */

	@Override
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		super.addCookie(cookie);
	}

	@Override
	public void addDateHeader(String name, long date) {
		// TODO Auto-generated method stub
		super.addDateHeader(name, date);
	}

	@Override
	public void addHeader(String name, String value) {
		// TODO Auto-generated method stub
		super.addHeader(name, value);
	}

	@Override
	public void addIntHeader(String name, int value) {
		// TODO Auto-generated method stub
		super.addIntHeader(name, value);
	}

	@Override
	public boolean containsHeader(String name) {
		// TODO Auto-generated method stub
		return super.containsHeader(name);
	}

	@Override
	public String encodeRedirectURL(String url) {
		// TODO Auto-generated method stub
		return super.encodeRedirectURL(url);
	}

	@Override
	public String encodeRedirectUrl(String url) {
		// TODO Auto-generated method stub
		return super.encodeRedirectUrl(url);
	}

	@Override
	public String encodeURL(String url) {
		// TODO Auto-generated method stub
		return super.encodeURL(url);
	}

	@Override
	public String encodeUrl(String url) {
		// TODO Auto-generated method stub
		return super.encodeUrl(url);
	}

	@Override
	public String getHeader(String name) {
		// TODO Auto-generated method stub
		return super.getHeader(name);
	}

	@Override
	public Collection<String> getHeaderNames() {
		// TODO Auto-generated method stub
		return super.getHeaderNames();
	}

	@Override
	public Collection<String> getHeaders(String name) {
		// TODO Auto-generated method stub
		return super.getHeaders(name);
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return super.getStatus();
	}

	@Override
	public void sendError(int sc, String msg) throws IOException {
		// TODO Auto-generated method stub
		super.sendError(sc, msg);
	}

	@Override
	public void sendError(int sc) throws IOException {
		// TODO Auto-generated method stub
		super.sendError(sc);
	}

	@Override
	public void sendRedirect(String location) throws IOException {
		// TODO Auto-generated method stub
		super.sendRedirect(location);
	}

	@Override
	public void setDateHeader(String name, long date) {
		// TODO Auto-generated method stub
		super.setDateHeader(name, date);
	}

	@Override
	public void setHeader(String name, String value) {
		// TODO Auto-generated method stub
		super.setHeader(name, value);
	}

	@Override
	public void setIntHeader(String name, int value) {
		// TODO Auto-generated method stub
		super.setIntHeader(name, value);
	}

	@Override
	public void setStatus(int sc, String sm) {
		// TODO Auto-generated method stub
		super.setStatus(sc, sm);
	}

	@Override
	public void setStatus(int sc) {
		// TODO Auto-generated method stub
		super.setStatus(sc);
	}

	@Override
	public void flushBuffer() throws IOException {
		// TODO Auto-generated method stub
		super.flushBuffer();
	}

	@Override
	public int getBufferSize() {
		// TODO Auto-generated method stub
		return super.getBufferSize();
	}

	@Override
	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		return super.getCharacterEncoding();
	}

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return super.getContentType();
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return super.getLocale();
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		// TODO Auto-generated method stub
		return super.getOutputStream();
	}

	@Override
	public ServletResponse getResponse() {
		// TODO Auto-generated method stub
		return super.getResponse();
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		// TODO Auto-generated method stub
		return super.getWriter();
	}

	@Override
	public boolean isCommitted() {
		// TODO Auto-generated method stub
		return super.isCommitted();
	}

	@Override
	public boolean isWrapperFor(ServletResponse wrapped) {
		// TODO Auto-generated method stub
		return super.isWrapperFor(wrapped);
	}

	@Override
	public boolean isWrapperFor(Class wrappedType) {
		// TODO Auto-generated method stub
		return super.isWrapperFor(wrappedType);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		super.reset();
	}

	@Override
	public void resetBuffer() {
		// TODO Auto-generated method stub
		super.resetBuffer();
	}

	@Override
	public void setBufferSize(int size) {
		// TODO Auto-generated method stub
		super.setBufferSize(size);
	}

	@Override
	public void setCharacterEncoding(String charset) {
		// TODO Auto-generated method stub
		super.setCharacterEncoding(charset);
	}

	@Override
	public void setContentLength(int len) {
		// TODO Auto-generated method stub
		super.setContentLength(len);
	}

	@Override
	public void setContentType(String type) {
		// TODO Auto-generated method stub
		super.setContentType(type);
	}

	@Override
	public void setLocale(Locale loc) {
		// TODO Auto-generated method stub
		super.setLocale(loc);
	}

	@Override
	public void setResponse(ServletResponse response) {
		// TODO Auto-generated method stub
		super.setResponse(response);
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
