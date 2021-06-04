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

import com.magasinJpa.models.Produit;
import com.magasinJpa.services.ProduitService;


@RestController
@RequestMapping ("produits")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping()
	public List<Produit> getAllTicket(){
		return this.produitService.getAll();
	}
	
	@PostMapping()
	public Produit saveTicket(@RequestBody Produit produit ) {
		return this.produitService.save(produit);
		
	}
	
	@GetMapping("{idProduit}")
	public Produit getProduitById(@PathVariable Long idProduit) {
		return this.produitService.getById(idProduit);
	}

	@PatchMapping("")
	public Produit update(@RequestBody Produit produit) {
		return this.produitService.update(produit);
	}
	
	@DeleteMapping("{idProduit}")
	public void delete(@PathVariable Long idProduit) {
		this.produitService.delete(idProduit);
	}

}
