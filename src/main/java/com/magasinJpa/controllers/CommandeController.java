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

import com.magasinJpa.models.Commande;
import com.magasinJpa.services.CommandeService;


@RestController
@RequestMapping("commandes")
public class CommandeController {
	
	@Autowired
	private CommandeService commandeService;
	
	@GetMapping()
	public List<Commande> getAllTicket(){
		return this.commandeService.getAll();
	}
	
	@PostMapping()
	public Commande saveTicket(@RequestBody Commande commande ) {
		return this.commandeService.save(commande);
		
	}
	
	@GetMapping("{idCommande}")
	public Commande getCommandeById(@PathVariable Long idCommande) {
		return this.commandeService.getById(idCommande);
	}

	@PatchMapping("")
	public Commande update(@RequestBody Commande commande) {
		return this.commandeService.update(commande);
	}
	
	@DeleteMapping("{idCommande}")
	public void delete(@PathVariable Long idCommande) {
		this.commandeService.delete(idCommande);
	}
	
	@GetMapping("commandesClient/{id}")
	public List<Commande> findByIdClient(@PathVariable Long id) {
		return this.commandeService.findByClientId(id);
	}

}
