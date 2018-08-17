package com.jda.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jda.user.model.Login;
import com.jda.user.model.User;
import com.jda.user.service.UserService;
@Controller

public class LoginController 
{
	@Autowired
	 public  UserService userService;
	
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());
	    return mav;
	  }
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    User user = userService.validateUser(login);
	    if (null != user) {
	   	 HttpSession session=request.getSession();
	   	 session.setAttribute("user",user);
	   	 session.setMaxInactiveInterval(10);
	    mav = new ModelAndView("welcome");
	    mav.addObject("firstname", user.getFirstname());
	    } else {
	   	 
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
}
