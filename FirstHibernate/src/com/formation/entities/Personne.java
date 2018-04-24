package com.formation.entities;

// Generated 4 mars 2018 09:17:11 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Personne generated by hbm2java
 */
@Entity
@Table(name = "personne", catalog = "formation_db")
public class Personne implements java.io.Serializable {

	private String cin;
	private String nom;
	private String prenom;
	private String EMail;
	private String telephone;
	private Set<Compte> comptes = new HashSet<Compte>(0);

	public Personne() {
	}

	public Personne(String cin, String nom, String prenom, String EMail,
			String telephone) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.EMail = EMail;
		this.telephone = telephone;
	}

	public Personne(String cin, String nom, String prenom, String EMail,
			String telephone, Set<Compte> comptes) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.EMail = EMail;
		this.telephone = telephone;
		this.comptes = comptes;
	}

	@Id
	@Column(name = "cin", unique = true, nullable = false, length = 8)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "nom", nullable = false, length = 20)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 20)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "e_mail", nullable = false, length = 20)
	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	@Column(name = "telephone", nullable = false, length = 15)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Compte> getComptes() {
		return this.comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

}