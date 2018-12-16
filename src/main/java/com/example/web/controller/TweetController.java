package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.business.domain.Tweet;
import com.example.business.repository.TweetRepository;

@Controller
public class TweetController {
	
	@Autowired
	private TweetRepository tweetRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
    	Tweet tweet = tweetRepository.findOne(1L);
    	mav.addObject("tweet", tweet);
        mav.setViewName("tweet/index");
        return mav;
    }

}