package com.magasinJpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.magasinJpa.services.ProduitService;
import com.magasinJpa.servicesImpl.ProduitServiceImpl;

@Configuration
public class ProduitConfig {
	
	@Bean
	public ProduitService produitServiceFactory(){
		return new ProduitServiceImpl();
	}

}