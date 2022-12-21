package cookie;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookies
 */
@WebServlet("/cookie/1")
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookie = new Cookie("data1", "쿠키저장!!");
		cookie.setMaxAge(60*60);
		
		Cookie cookie2 = new Cookie("data2", URLDecoder.decode("데이터 하나 더 추가!!", "utf-8"));
		
		response.addCookie(cookie);
		response.addCookie(cookie2);
		
	}


}

