package com.magasinJpa.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasinJpa.models.Client;
import com.magasinJpa.repositories.ClientRepository;
import com.magasinJpa.services.ClientService;

public class ClientServiceImpl implements ClientService{
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> getAll() {
		return this.clientRepository.findAll();
	}

	@Override
	public Client save(Client client) {
		return this.clientRepository.save(client);
	}

	@Override
	public Client getById(Long idClient) {
		return this.clientRepository.findById(idClient).get();
	}

	@Override
	public Client update(Client client) {
		return this.clientRepository.save(client);
		
	}

	@Override
	public void delete(Long idClient) {
		this.clientRepository.deleteById(idClient);

    }

}
