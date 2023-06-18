package it.uniroma3.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.model.Imagen;
@Repository
public interface ImagenRepository extends CrudRepository<Imagen, Long>{


}
