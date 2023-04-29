package tn.spring;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEt;
	
	@Column(name = "etudiant_prenom")
	private String prenom;
	
	@Column(name = "etudiant_nom")
	private String nom;
	@ManyToOne
	private Groupe group;
	public int getId() {
		return idEt;
	}
	
	public void setId(int id) {
		idEt = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPreom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Etudiant() {}
	
	public Etudiant(int id, String nom, String prenom) {
		this.idEt = id;
		this.nom = nom;
		this.prenom = prenom;
	}
}
