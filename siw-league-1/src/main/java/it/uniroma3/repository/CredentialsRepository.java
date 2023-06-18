package it.uniroma3.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.model.Credentials;
import it.uniroma3.model.Entrenador;
@Repository
public interface CredentialsRepository extends CrudRepository<Long, Long>{

	public Optional<Credentials> findByUsername(String nome);
}
