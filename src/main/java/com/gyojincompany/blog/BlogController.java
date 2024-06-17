package com.gyojincompany.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		return "sample1";
	}
	
	@RequestMapping(value = "/member")
	public String member() {
		return "user/member";//특정 폴더 내의 jsp파일 실행
	}
	
	@RequestMapping(value = "/test2")
	public String test2() {
		return "sample2";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("memberid");//tiger
		String mpw = request.getParameter("memberpw");//12345
		
		model.addAttribute("loginid", mid);
		model.addAttribute("loginpw", mpw);
		model.addAttribute("user", "홍길동");
		
		return "loginOk";
	}
	
	
	
	
}
