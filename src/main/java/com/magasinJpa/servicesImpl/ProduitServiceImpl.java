package com.magasinJpa.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasinJpa.models.Produit;
import com.magasinJpa.repositories.ProduitRepository;
import com.magasinJpa.services.ProduitService;

public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getAll() {
		return this.produitRepository.findAll();
	}

	@Override
	public Produit save(Produit produit) {
		return this.produitRepository.save(produit);
	}

	@Override
	public Produit getById(Long idProduit) {
		return this.produitRepository.findById(idProduit).get();
	}

	@Override
	public Produit update(Produit produit) {
		return this.produitRepository.save(produit);
		
	}

	@Override
	public void delete(Long idProduit) {
		this.produitRepository.deleteById(idProduit);

    }

}
