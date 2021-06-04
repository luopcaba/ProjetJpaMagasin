package com.magasinJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasinJpa.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
