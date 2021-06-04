package com.magasinJpa.models;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	@ManyToMany
	@JoinTable(
			name = "commande_has_produit",
			joinColumns= @JoinColumn( name = "commande_id"),
			inverseJoinColumns = @JoinColumn( name = "produit_id")
			)
	private Collection<Produit> produit;
	
	public Commande(Long id, Client client, Collection<Produit> produit) {
		super();
		this.id = id;
		this.client = client;
		this.produit = produit;
	}
	
	

}
