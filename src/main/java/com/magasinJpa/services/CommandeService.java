package com.magasinJpa.services;

import java.util.List;

import com.magasinJpa.models.Commande;

public interface CommandeService {
	public List<Commande> getAll();
	public Commande save(Commande commande);
	public Commande getById(Long idCommande);
	public Commande update(Commande commande);
	public void delete( Long idCommande);
	public List<Commande> findByClientId(Long id);
}
