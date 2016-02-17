package br.com.silvanopessoa.demo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.silvanopessoa.demo.domain.Player;
import br.com.silvanopessoa.demo.domain.Team;

@RestController
public class WhateverIWant {

	private Team team;
	
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown","pitcher"));
		players.add(new Player("Snoopy","shortstop"));
		team = new Team("California","Peanuts",players);
	}

	@RequestMapping("/hi")
	public Team hiThere(){
		return team;
	}

}
