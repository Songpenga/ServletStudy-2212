package com.study.servlet.account;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.domain.User;
import com.study.domain.User.UserBuilder;
import com.study.repository.UserRepository;
import com.study.service.AccountService;
import com.study.util.DTO;

@WebServlet("/auth/register")
public class RegisterApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> registerParams = DTO.getParams(request);
		AccountService accountService = AccountService.getInstance();
		
		if(accountService.isDuplicateUsername(registerParams.get("username"))) {
			System.out.println("아이디가 중복되었습니다.");
			request.getRequestDispatcher("/WEB-INF/account/error_username.html").forward(request, response);
			return;
		}else {
			System.out.println("가입 가능한 아이디 입니다.");
			User user = User.builder()
					.username(registerParams.get("username"))
					.password(registerParams.get("password"))
					.name(registerParams.get("name"))
					.email(registerParams.get("email"))
					.roles("ROLE_USER, ROLE_ADMIN") // 권한부여
					.build();
			
			//UserRepository.getInstance().saveUser(user);
			accountService.register(user);
			
			UserRepository.getInstance().showUserAll(); // 가입한 회원 정보 콘솔에서 확인

			response.sendRedirect("/login");
		}
		
	
	}

}
