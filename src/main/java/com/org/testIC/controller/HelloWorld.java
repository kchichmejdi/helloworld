package com.org.testIC.controller;

import java.text.ParseException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloWorld {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String helloWorld() throws ParseException {
		
		return "Hello World";
	}

}
