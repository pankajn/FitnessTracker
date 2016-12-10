/**
 * 
 */
package com.pankaj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pankaj.model.Activity;
import com.pankaj.model.Exercise;

/**
 * Test static resource eg. using http://localhost:8081/FitnessTracker/pdfs/Spring%20Interview%20QA.pdf
 * 
 * @author Pankaj
 *
 */
@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());
		return "addMinutes";
		// Without .html, the page will break, as it servers only req with *.html
		// forward will bypass our view resolver
//		return "forward:addMoreMinutes.html";
//		return "redirect:addMoreMinutes.html";
	}
	
	// Example to show chaining with forward/redirect
	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercising: " + exercise.getMinutes());
		return "addMinutes";
	}
	
	
	@RequestMapping(value = "/activities", method= RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	
}
