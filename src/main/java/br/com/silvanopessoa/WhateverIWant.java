package br.com.silvanopessoa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WhateverIWant {
	
	@RequestMapping("/hi")
	public @ResponseBody String hiThere(){
		return "hello world!";
	}

}
