package com.jda.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
@RequestMapping("/welcome")
	public ModelAndView welcomeDisplay(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session=request.getSession();
		String username=(String) session.getAttribute("username");
		return new ModelAndView("welcome","firstname",username);
		
	}
}
