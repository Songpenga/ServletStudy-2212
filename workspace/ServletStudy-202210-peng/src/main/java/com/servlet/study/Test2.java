package com.servlet.study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2
 */
@WebServlet("/test/2")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
    	   System.out.println("Test2 클래스 service() 호출!!");
    	   resp.setContentType("text/plain; charset=utf8");
    	   
    	   resp.setCharacterEncoding("UTF-8");
    	   resp.getWriter().print("그냥 텍스트 응답");
    	   }
   
}
