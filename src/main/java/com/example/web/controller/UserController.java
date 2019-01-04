package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.business.domain.User;

@Controller
public class UserController {
	@RequestMapping(value = "/user/regisration", method = RequestMethod.GET)
	public ModelAndView registration(ModelAndView mav) {
		mav.addObject("user", new User());
		mav.setViewName("/user/registration");
		return mav;
	}
}
