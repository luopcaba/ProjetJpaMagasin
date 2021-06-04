package com.magasinJpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.magasinJpa.services.ClientService;
import com.magasinJpa.servicesImpl.ClientServiceImpl;

@Configuration
public class ClientConfig {
	
	@Bean
	public ClientService clientServiceFactory(){
		return new ClientServiceImpl();
	}

}
