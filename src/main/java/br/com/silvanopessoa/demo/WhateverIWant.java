package br.com.silvanopessoa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.silvanopessoa.demo.dao.TeamDao;
import br.com.silvanopessoa.demo.domain.Team;

@RestController
public class WhateverIWant {

	@Autowired
	TeamDao teamDao;
	
	@RequestMapping("/teams/{name}")
	public Team hiThere(@PathVariable String name){
		return teamDao.findByName(name);
	}

}
