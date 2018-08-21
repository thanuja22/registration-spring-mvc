package com.jda.user.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	      throws IOException, ServletException {
		// TODO Auto-generated method stub
		/*HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String url=req.getServletPath();
		
		System.out.println(url);
		if(!url.equals("/login.jsp"))
		{
			HttpSession session=req.getSession(false);
			if(session==null){
				res.sendRedirect("login.jsp");
				return;
			}
		}
		chain.doFilter(req, res);*/
	}

	
		
	

}
