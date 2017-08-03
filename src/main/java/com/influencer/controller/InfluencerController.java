package com.influencer.controller;

import com.influencer.service.CategoryService;
import com.influencer.service.twitter.TwitterRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import twitter4j.TwitterException;

@Controller
public class InfluencerController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	TwitterRestClient twitterRestClient;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

	@RequestMapping(value = "/list/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) throws TwitterException {

		twitterRestClient.fetchUserInfo(name);

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("name", "Done");

		return model;
	}

}