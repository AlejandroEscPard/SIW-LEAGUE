package it.uniroma3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import it.uniroma3.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	protected UserRepository userRepository;
	
	@Transactional
	public it.uniroma3.model.User getUser(Long id) {
		Optional<it.uniroma3.model.User> result = this.userRepository.findById(id);
		return result.orElse(null);
	}
	
	
	@Transactional
	public User saveUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	@Transactional
	public List<User> getAllUsers(){
		List<User> resultado = new ArrayList<>();
		Iterable<it.uniroma3.model.User> iterable = this.userRepository.findAll();	
		for (User user: iterable ) {
			resultado.add(user);
		}
		return resultado;
	}
}
