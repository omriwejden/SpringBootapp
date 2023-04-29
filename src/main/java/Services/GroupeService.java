package Services;

import java.util.List;
import tn.spring.Enseignant;
import tn.spring.Etudiant;

public interface GroupeService {
List<Etudiant> getEtudiantsByGroupe(Integer idGroupe);
    
 List<Enseignant> getEnseignantsByEtudiantId(Integer idEtudiant);
}
