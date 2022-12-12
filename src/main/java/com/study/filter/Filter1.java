package com.study.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/*")
public class Filter1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Filter1() {
        super();
    
    }
	@Override
	public void destroy() {

	}
	   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	    {
		   System.out.println("필터1 실행됨!!!");
		   request.setAttribute("name", "peng");
	        chain.doFilter(request, response); 
	    }
	
	@Override
	public void init() throws ServletException {
		
	}

}
