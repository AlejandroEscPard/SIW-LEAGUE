package it.uniroma3.repository;
import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.model.Jugador;
@Repository
public interface JugadorRepository extends CrudRepository<Jugador, Long>{

	public List<Jugador> findAllByPosicion(String posicion);
	
	public List<Jugador> findAllByAñosExperiencia(int añosexperiencia);


}
