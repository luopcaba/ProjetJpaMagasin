package com.magasinJpa.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasinJpa.models.Commande;
import com.magasinJpa.repositories.CommandeRepository;
import com.magasinJpa.services.CommandeService;

public class CommandeServiceImpl implements CommandeService{
	@Autowired
	private CommandeRepository commandeRepository;
	
	@Override
	public List<Commande> getAll() {
		return this.commandeRepository.findAll();
	}

	@Override
	public Commande save(Commande commande) {
		return this.commandeRepository.save(commande);
	}

	@Override
	public Commande getById(Long idCommande) {
		return this.commandeRepository.findById(idCommande).get();
	}

	@Override
	public Commande update(Commande commande) {
		return this.commandeRepository.save(commande);
		
	}

	@Override
	public void delete(Long idCommande) {
		this.commandeRepository.deleteById(idCommande);

    }
	
	@Override
	public List<Commande> findByClientId(Long id){
		return this.commandeRepository.findByClientId(id);
		
	}

}
