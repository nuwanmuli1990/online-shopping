package com.muli.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	@RequestMapping(value= {"/", "/index", "/home"})
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("greeting", "Welcome to MVC ");
		return mv;
	}
}
