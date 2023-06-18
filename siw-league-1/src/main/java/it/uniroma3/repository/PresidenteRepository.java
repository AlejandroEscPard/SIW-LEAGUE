package it.uniroma3.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.model.Presidente;
@Repository
public interface PresidenteRepository extends CrudRepository<Presidente, Long>{


}
