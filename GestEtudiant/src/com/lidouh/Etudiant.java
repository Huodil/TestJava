package com.lidouh;

import java.util.Date;

public class Etudiant {
	private String Nom;
	private String Prenom;
	private String Email;
	private Date DateNaiss;
	private Civilite civilite;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, String email, Date dateNaiss) {
		super();
		Nom = nom;
		Prenom = prenom;
		Email = email;
		DateNaiss = dateNaiss;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getDateNaiss() {
		return DateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}
	
	

}
