package com.lidouh;

import java.util.List;

public interface IEtudiant {
	public Etudiant CreerEtudiant() throws Exception;
	
	public void AfficherEtudiant();
	
	public void SupprimerEtudiant(String nom);
	
	public List<Etudiant> TrierEtudiantAsc(); 
	
	public List<Etudiant> TrieEtudiantDesc();
}
