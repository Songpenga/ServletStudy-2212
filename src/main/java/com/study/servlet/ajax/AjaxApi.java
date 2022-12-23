package com.study.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.util.DTO;


@WebServlet("/api/ajax1")
public class AjaxApi extends HttpServlet {
	  
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println(DTO.getParams(request));
			
			System.out.println("Ajax로 get요청 옴!!!");
			
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println(DTO.getParams(request));
			
			System.out.println("Ajax로 post요청 옴!!!");
			
			response.setContentType("text/plain; charset=utf8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.print("응답 데이터 전송");
		}
	}

