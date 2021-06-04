package com.magasinJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasinJpa.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
