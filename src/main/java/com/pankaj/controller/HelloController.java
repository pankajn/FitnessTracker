/**
 * 
 */
package com.pankaj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pankaj
 *
 */
@Controller
public class HelloController {

	// http://localhost:8081/FitnessTracker/greeting.html
	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		
		model.addAttribute("greeting", "Hello World");
		return "hello";
	}
	
	// http://localhost:8081/FitnessTracker/hello.html
	@RequestMapping(value = "/hello")
	public ModelAndView hello(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Returning hello view.");
		return new ModelAndView("hello","greeting", "Hello World!");
	}
	
}
