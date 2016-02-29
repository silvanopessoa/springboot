package br.com.silvanopessoa.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.silvanopessoa.demo.domain.Player;

@RestResource(path="players",rel="players")
public interface PlayerDao extends CrudRepository<Player, Long>{

}
