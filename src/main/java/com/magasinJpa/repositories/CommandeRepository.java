package com.magasinJpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasinJpa.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
	public List<Commande> findByClientId(Long id);


}
