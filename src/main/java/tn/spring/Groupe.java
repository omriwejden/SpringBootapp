
package tn.spring;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity

public class Groupe implements Serializable  {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	    private int idG;
	    @Column(name = "group_nom")
	    private String nom;
	    @Column(name = "group_speciality")
	    private Speciality speciality;
	    @ManyToMany 
	    private List<Enseignant> enseignants;
	    public List<Enseignant> getEnseignants() {
	    	return enseignants;
	    }
	    public void setEnseignants(List<Enseignant> enseignants) {
	    	this.enseignants = enseignants;
	    }
	    
	    @OneToMany(mappedBy="group")
	    private List<Etudiant>etudiants;

	    public Groupe(int id, String nom, Speciality speciality) {
	        this.idG = id;
	        this.nom = nom;
	        this.speciality = speciality;
	    }
	    public List<Etudiant> getEtudiants() {
	    	return etudiants;
	    }
	    public void setEtudiants(List<Etudiant>etudiants) {
	    	this.etudiants= etudiants;}
	    
	    	 public Groupe() {

	    }

	    public int getId() {
	        return idG;
	    }

	    public void setId(int id) {
	        this.idG = id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public Speciality getSpeciality() {
	        return speciality;
	    }

	    public void setSpeciality(Speciality speciality) {
	        this.speciality = speciality;
	    }
	

}
