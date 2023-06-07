package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class coursescontroller {
	@RequestMapping("courses")
	public String couses(String cname ,HttpSession session)
	{
	
		System.out.println("Welcome to 5 Minutes Notes"+cname);
		
		session.setAttribute("cname",cname);
		return "course";
	}

}
