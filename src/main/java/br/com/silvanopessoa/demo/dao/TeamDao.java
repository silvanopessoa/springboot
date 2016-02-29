package br.com.silvanopessoa.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.silvanopessoa.demo.domain.Team;

@RestResource(path="teams",rel="teams")
public interface TeamDao extends CrudRepository<Team, Long>{
	
	List<Team> findAll();
	
	Team findByName(String name);

}
