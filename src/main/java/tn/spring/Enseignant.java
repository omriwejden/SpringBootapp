package tn.spring;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEn;
    
    @Column(name = "enseignant_nom")
    private String nomEn;
    
    @Column(name = "enseignant_dateofbirth")
    private Date dateofbirth;
  @ManyToMany (mappedBy = "enseignants" )
  private List<Groupe>groupes;
  
  public List<Groupe> getGroupe() {
		return groupes;
	}
	public void setGroupe(List <Groupe> groupes) {
		this.groupes = groupes;
	} 
 
    public int getId() {
        return idEn;
    }

    public void setId(int id) {
        idEn = id;
    }

    public String getNom() {
        return nomEn;
    }
    
    public void setNom(String nom) {
        nomEn = nom;
    }
    
    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date date) {
        dateofbirth = date;
    }
    
    public Enseignant() {}

    public Enseignant(int id, String nom, Date date) {
        idEn = id;
        nomEn = nom;
        dateofbirth = date;
    }
}