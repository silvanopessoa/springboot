package br.com.silvanopessoa.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import br.com.silvanopessoa.demo.dao.TeamDao;
import br.com.silvanopessoa.demo.domain.Player;
import br.com.silvanopessoa.demo.domain.Team;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer{

	@Autowired
	TeamDao teamDao;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}
	
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown","pitcher"));
		players.add(new Player("Snoopy","shortstop"));
		Team team = new Team("California","Peanuts",players);
		teamDao.save(team);
	}
}
