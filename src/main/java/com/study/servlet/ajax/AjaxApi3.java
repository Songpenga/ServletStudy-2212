package com.study.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.study.util.DTO;

import lombok.Builder;
import lombok.Data;

@WebServlet("/api/ajax3")
public class AjaxApi3 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String jsonData) throws ServletException, IOException {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String data = request.getParameter("data");
		Map<String, Object> dataMap = gson.fromJson(jsonData, Map.class);	
//		List<String> phoneNumbers = new ArrayList<>();
//		
//		dataMap.forEach((key, value) -> {
//			if(value.getClass() == String.class) {
//				phoneNumbers.add((String)value);
//			}
//			
//		});
		response.setContentType("text/plain; charset=utf8");
		response.setCharacterEncoding(StandardCharsets.UTF_8.name());
		PrintWriter out = response.getWriter();
		
		StringBuilder stringBuilder = new StringBuilder();
		
		dataMap.forEach((key, value) -> {
			stringBuilder.append(value);
			stringBuilder.append("-");
		});
		
		stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("responseData", stringBuilder.toString());
		
		out.print(stringBuilder.toString());
		//stringBuilder 문자열을 합친다
	}
	}


