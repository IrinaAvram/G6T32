package at.ac.tuwien.aic.group6.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
	
	@RequestMapping(method=RequestMethod.GET)
	public void getQuote(){
		System.out.println("blub");
	}
	
}
