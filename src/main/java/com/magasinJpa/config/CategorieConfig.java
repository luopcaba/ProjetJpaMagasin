package com.magasinJpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.magasinJpa.services.CategorieService;
import com.magasinJpa.servicesImpl.CategorieServiceImpl;

@Configuration
public class CategorieConfig {
	
	@Bean
	public CategorieService categorieServiceFactory(){
		return new CategorieServiceImpl();
	}

}
