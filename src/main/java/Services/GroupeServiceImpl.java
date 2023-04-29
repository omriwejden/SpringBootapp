package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.spring.Enseignant;
import tn.spring.Etudiant;
import tn.spring.Groupe;
import Repository.groupeRepository;

public class GroupeServiceImpl implements GroupeService {
	@Autowired
    private groupeRepository groupeRepository;
    
    public List<Etudiant> getEtudiantsByGroupe(Integer idGroupe) {
        Groupe groupe = groupeRepository.findById(idGroupe).orElse(null);
        if (groupe != null) {
            return groupe.getEtudiants();
        } else {
            return null;
        }
    }
    
    public List<Enseignant> getEnseignantsByEtudiantId(Integer idEtudiant) {
        Groupe groupe = groupeRepository.findByEtudiantId(idEtudiant);
        if (groupe != null) {
            return groupe.getEnseignants();
        } else {
            return null;
        }
    }
}

