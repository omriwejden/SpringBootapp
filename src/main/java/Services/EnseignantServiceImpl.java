package Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import Repository.EnseignantRepository;
import tn.spring.Enseignant;
import tn.spring.Groupe;
import tn.spring.Etudiant;
import Repository.groupeRepository;
public class EnseignantServiceImpl implements EnseignantService {
	  @Autowired
	    private EnseignantRepository repo;
	  
	    public List<Enseignant> retrieveAllEnseignants() {
	        return (List<Enseignant>)repo.findAll();
	    }

	  
	    public Enseignant addEnseignant(Enseignant enseignant) {
	        return repo.save(enseignant);
	    }
	    public Long countEnseignants() {
	        return repo.countEnseignants();
	    }

	    public List<Enseignant> findEnseignantsByDateOfBirthBetween() {
			return repo.findEnseignantsByDateOfBirthBetween();
		}
	

	  
	    public void deleteEnseignant(Integer id) {
	        repo.deleteById(id);
	    }

	    public Enseignant updateEnseignant(Enseignant enseignant) {
	        return repo.save(enseignant);
	    }

	    
	    public Enseignant retrieveEnseignant(Integer id) {
	        return repo.findById(id).orElse(null);
	    }
	    
	}

