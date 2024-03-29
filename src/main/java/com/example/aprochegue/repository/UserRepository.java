package com.example.aprochegue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aprochegue.model.Usuario;

public interface  UserRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	public Optional<Usuario> findByEmail(String email);
	
}
