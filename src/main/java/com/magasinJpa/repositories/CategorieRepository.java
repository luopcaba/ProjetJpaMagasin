package com.magasinJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasinJpa.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
