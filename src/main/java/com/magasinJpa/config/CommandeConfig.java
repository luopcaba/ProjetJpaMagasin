package com.magasinJpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.magasinJpa.services.CommandeService;
import com.magasinJpa.servicesImpl.CommandeServiceImpl;

@Configuration
public class CommandeConfig {
	
	@Bean
	public CommandeService commandeServiceFactory(){
		return new CommandeServiceImpl();
	}

}
