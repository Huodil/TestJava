package com.lidouh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImpEtudiant implements IEtudiant,FactoryInsert {
		private List<Etudiant> etudiants;

	
		public Etudiant insertEtudiant() throws IOException, ParseException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy"); 
			 String Nom;
			 String Prenom;
			 String Email;
			 Date DateNaiss;
			 Etudiant etudiant=new Etudiant();
			 	
			 	System.out.println("Entrer la civilite: ");
			 	String civlt = reader.readLine();
			 	if(civlt.equals(Civilite.Madame)) {
			 		etudiant.setCivilite(Civilite.Madame);
			 	}else {
			 		etudiant.setCivilite(Civilite.Monsieur);
			 	}
			 	System.out.print("Entrer le nom: ");
				etudiant.setNom(reader.readLine());
		        System.out.print("Entrer le prenom: ");
		        etudiant.setPrenom(reader.readLine());
		        System.out.printf("Entrer l'email: ");
		        etudiant.setEmail(reader.readLine());
		        System.out.print("Entrer la date (mm/dd/yyyy ): ");
		        String dateString = reader.readLine();
		        etudiant.setDateNaiss(df.parse(dateString));
		        
		       
		    return etudiant;
		}
		
	public ImpEtudiant() {
			this.etudiants=new ArrayList<>();
		}

	@Override
	public Etudiant CreerEtudiant() throws IOException, ParseException {
		return insertEtudiant();
	}

	@Override
	public void AfficherEtudiant() {
		for(Etudiant etud : etudiants) {
            System.out.println("Civilite: "+etud.getCivilite()+ "Nom: "+etud.getNom() + "Prenom: "+etud.getPrenom()
            + "Email: "+etud.getEmail() + "Date de Naissance: "+etud.getDateNaiss());
        }
	}

	@Override
	public void SupprimerEtudiant(String nom) {
		this.etudiants = this.etudiants.stream().filter(et -> !et.getNom()
				.equals(nom)).collect(Collectors.toList());
		
		
	}

	@Override
	public List<Etudiant> TrierEtudiantAsc() {
		this.etudiants=this.etudiants.stream().sorted(Comparator.comparing(Etudiant::getNom)).collect(Collectors.toList());
		return this.etudiants;
	}

	@Override
	public List<Etudiant> TrieEtudiantDesc() {
		this.etudiants=this.etudiants.stream().sorted(Comparator.comparing(Etudiant::getDateNaiss).reversed()).collect(Collectors.toList());
		return this.etudiants;
	}
	

}
