package it.uniroma3.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.uniroma3.model.*;

@Repository
public interface LicenciaRepository extends CrudRepository<Licencia, Long>{
	
	public List<Licencia> findByTipo(String tipo);

}
