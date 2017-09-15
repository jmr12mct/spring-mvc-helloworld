package com.mano.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	String message = "Welcome to Spring MVC!";
	
	@RequestMapping("/hello")
	public ModelAndView showMessages(@RequestParam(value="name", required=false,
										defaultValue="World") String name) {
		System.out.println("Inside Controller");
		
		ModelAndView mv = new ModelAndView("helloWorld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
