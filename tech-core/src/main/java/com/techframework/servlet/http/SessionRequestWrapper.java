package com.techframework.servlet.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

public class SessionRequestWrapper extends HttpServletRequestWrapper{

	public SessionRequestWrapper(HttpServletRequest request) {
		super(request);
	}
	
	public HttpSession getSession(boolean create){
		return ((HttpServletRequest) this.getRequest()).getSession(create);
	}

	public HttpSession getSession(){
		return ((HttpServletRequest) this.getRequest()).getSession();
	}
}
