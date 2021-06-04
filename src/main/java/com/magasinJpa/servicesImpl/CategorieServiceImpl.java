package com.magasinJpa.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasinJpa.models.Categorie;
import com.magasinJpa.repositories.CategorieRepository;
import com.magasinJpa.services.CategorieService;

public class CategorieServiceImpl implements CategorieService {
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Override
	public List<Categorie> getAll() {
		return this.categorieRepository.findAll();
	}

	@Override
	public Categorie save(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}

	@Override
	public Categorie getById(Long idCategorie) {
		return this.categorieRepository.findById(idCategorie).get();
	}

	@Override
	public Categorie update(Categorie categorie) {
		return this.categorieRepository.save(categorie);
		
	}

	@Override
	public void delete(Long idCategorie) {
		this.categorieRepository.deleteById(idCategorie);

    }

}
