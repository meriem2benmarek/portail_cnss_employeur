package ma.cnss.portailemployeur.ws;
import ma.cnss.portailemployeur.entity.Employeur;
import ma.cnss.portailemployeur.service.EmployeurService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employeur")
public class EmployeurWs {

    private final EmployeurService service;

    public EmployeurWs(EmployeurService service) {
        this.service = service;
    }

    // Ajouter
    @PostMapping
    public Employeur ajouter(@RequestBody Employeur e) {
        return service.ajouter(e);
    }

    // Afficher tous
    @GetMapping
    public List<Employeur> afficher() {
        return service.afficher();
    }

    // Rechercher par ID
    @GetMapping("/{id}")
    public Employeur rechercher(@PathVariable Long id) {
        return service.rechercher(id);
    }

    // Modifier
    @PutMapping
    public Employeur modifier(@RequestBody Employeur e) {
        return service.modifier(e);
    }

    // Supprimer
    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
