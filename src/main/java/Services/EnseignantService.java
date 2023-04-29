package Services;
import tn.spring.Enseignant;
import java.util.List;

public interface EnseignantService {
    List<Enseignant> retrieveAllEnseignants();
    Enseignant addEnseignant(Enseignant enseignant);
    void deleteEnseignant(Integer id);
    Enseignant updateEnseignant(Enseignant enseignant);
    Enseignant retrieveEnseignant(Integer id);
}