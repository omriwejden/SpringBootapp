package Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.spring.Enseignant;
import tn.spring.Groupe;

public interface groupeRepository extends CrudRepository<Groupe, Integer> {
	 @Query("select g from Groupe g join g.etudiants e where e.idEt = :idEtudiant")
	   Groupe findByEtudiantId(@Param("idEtudiant") Integer idEtudiant);
}
