package com.magasinJpa.services;

import java.util.List;

import com.magasinJpa.models.Client;

public interface ClientService {
	public List<Client> getAll();
	public Client save(Client client);
	public Client getById(Long idClient);
	public Client update(Client client);
	public void delete( Long idClient);

}
