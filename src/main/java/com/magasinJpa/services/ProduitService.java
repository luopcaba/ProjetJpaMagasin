package com.magasinJpa.services;

import java.util.List;

import com.magasinJpa.models.Produit;

public interface ProduitService {
	public List<Produit> getAll();
	public Produit save(Produit produit);
	public Produit getById(Long idProduit);
	public Produit update(Produit produit);
	public void delete( Long idProduit);

}
