package com.muli.java.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	@RequestMapping(value= {"/", "/index", "/Home"})
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to MVC ");
		mv.addObject("isHomePage", true);
		return mv;
	}
	
	@RequestMapping(value="/About")
	public ModelAndView aboutUs() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to MVC ");
		mv.addObject("isAboutPage", true);
		return mv;
	}
	
	
	@RequestMapping(value="/Contact")
	public ModelAndView contactUs() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to MVC ");
		mv.addObject("isContactPage", true);
		return mv;
	}
	
//	@RequestMapping(value="/Test/{name}/{age}")
//	public ModelAndView test(@PathVariable("name")String name, @PathVariable("age")int age) {
//		if(name== null) {
//			name = "Enter name please";
//		}
//		ModelAndView mv = new ModelAndView("home");
//		mv.addObject("name", name);
//		mv.addObject("age", age);
//		return mv;
//	}
//	
//	@RequestMapping(value="/Param")
//	public ModelAndView Param(@RequestParam(value="name") String name, @RequestParam(value="age")int age) {
//		ModelAndView mv = new ModelAndView("home");
//		mv.addObject("name", name);
//		mv.addObject("age", age);
//		return mv;
//	}
	
	
}
