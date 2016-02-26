package br.com.silvanopessoa.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.silvanopessoa.demo.domain.Team;

public interface TeamDao extends CrudRepository<Team, Long>{
	
	List<Team> findAll();
	
	Team findByName(String name);

}
