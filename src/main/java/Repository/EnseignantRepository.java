package Repository;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.spring.Enseignant;
@Repository

public interface EnseignantRepository extends CrudRepository<Enseignant, Integer> {
	@Query("SELECT COUNT(e) FROM Enseignant e")
   public  Long countEnseignants();
	@Query("SELECT e FROM Enseignant e WHERE e.dateofbirth BETWEEN '1980-01-01' AND '1982-01-01'")
	List<Enseignant> findEnseignantsByDateOfBirthBetween();

}
