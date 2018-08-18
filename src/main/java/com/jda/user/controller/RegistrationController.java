package com.jda.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jda.user.model.User;
import com.jda.user.service.UserService;
import com.jda.user.validator.UserValidation;
@Controller
public class RegistrationController {
	@Autowired
	  public UserService userService;
	@Autowired
	private UserValidation userValidation;
	  @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("user", new User());
	    return mav;
	  }
	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("user") User user,BindingResult bindingResult) {
		  userValidation.validate(user, bindingResult);
		  if(bindingResult.hasErrors())
		  {
			  return new ModelAndView("register");
		  }
	  userService.register(user);
	  return new ModelAndView("redirect:/welcome", "firstname", user.getFirstname());
	  }
}
