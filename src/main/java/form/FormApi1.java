package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormApi1
 */
@WebServlet("/api/form/1")
public class FormApi1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("get요청옴!!!");
	System.out.println(request.getParameter("name"));
	System.out.println(request.getParameter("phone"));
	System.out.println(request.getParameter("email"));
	System.out.println(request.getParameter("address"));
	System.out.println(request.getParameter("pw"));
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post 요청옴!!!");
		request.setCharacterEncoding("UTF-8");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pw"));
		
		String test = request.getParameter("test");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/plain; charset=utf8");
	/*	
		response.getWriter().print("name : " + test );	줄바꿈 없음
		response.getWriter().print("phone : " + phone);	
		response.getWriter().print("email : " + email);	
		response.getWriter().print("address : " + address);	
		*/
		
		PrintWriter out = response.getWriter();
		out.println("name" + request.getParameter("name"));
		out.println("phone" + request.getParameter("phone"));
		out.println("email" + request.getParameter("email"));
		out.println("address" + request.getParameter("address"));
	

	}

}
