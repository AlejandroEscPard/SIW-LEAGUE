package it.uniroma3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.model.Tecnico;
import it.uniroma3.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

	
}
