package com.magasinJpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasinJpa.models.Client;
import com.magasinJpa.services.ClientService;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping()
	public List<Client> getAllTicket(){
		return this.clientService.getAll();
	}
	
	@PostMapping()
	public Client saveTicket(@RequestBody Client client ) {
		return this.clientService.save(client);
		
	}
	
	@GetMapping("{idClient}")
	public Client getClientById(@PathVariable Long idClient) {
		return this.clientService.getById(idClient);
	}

	@PatchMapping("")
	public Client update(@RequestBody Client client) {
		return this.clientService.update(client);
	}
	
	@DeleteMapping("{idClient}")
	public void delete(@PathVariable Long idClient) {
		this.clientService.delete(idClient);
	}

}
