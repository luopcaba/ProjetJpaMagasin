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

import com.magasinJpa.models.Categorie;
import com.magasinJpa.services.CategorieService;

@RestController
@RequestMapping ("categories")
public class CategorieController{
		
		
		@Autowired
		private CategorieService categorieService;
		
		@GetMapping()
		public List<Categorie> getAllTicket(){
			return this.categorieService.getAll();
		}
		
		@PostMapping()
		public Categorie saveTicket(@RequestBody Categorie categorie ) {
			return this.categorieService.save(categorie);
			
		}
		
		@GetMapping("{idCategorie}")
		public Categorie getCategorieById(@PathVariable Long idCategorie) {
			return this.categorieService.getById(idCategorie);
		}

		@PatchMapping("")
		public Categorie update(@RequestBody Categorie categorie) {
			return this.categorieService.update(categorie);
		}
		
		@DeleteMapping("{idCategorie}")
		public void delete(@PathVariable Long idCategorie) {
			this.categorieService.delete(idCategorie);
		}

}
