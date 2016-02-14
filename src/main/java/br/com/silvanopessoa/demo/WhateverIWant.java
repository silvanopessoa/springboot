package br.com.silvanopessoa.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WhateverIWant {
	
	@RequestMapping("/hi")
	public String hiThere(Map model){
		return "hello";
	}

}
