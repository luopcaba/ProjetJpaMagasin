package com.magasinJpa.services;

import java.util.List;

import com.magasinJpa.models.Categorie;

public interface CategorieService {
	public List<Categorie> getAll();
	public Categorie save(Categorie categorie);
	public Categorie getById(Long idCategorie);
	public Categorie update(Categorie categorie);
	public void delete( Long idCategorie);

}
