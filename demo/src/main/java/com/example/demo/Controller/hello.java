package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class hello {
	
	
		
	@ResponseBody
	@RequestMapping("hello")	
	public String hello() {
		
		return "hello pdddd";
	}
}
