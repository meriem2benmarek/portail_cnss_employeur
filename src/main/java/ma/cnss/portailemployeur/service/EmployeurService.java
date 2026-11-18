package ma.cnss.portailemployeur.service;

import ma.cnss.portailemployeur.dao.EmployeurDao;
import ma.cnss.portailemployeur.entity.Employeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeurService {

    @Autowired
    private EmployeurDao dao;


    public Employeur ajouter(Employeur e)
    {
        return dao.save(e);
    }


    public List<Employeur> afficher()
    {
        return dao.findAll();
    }


    public Employeur rechercher(Long id)
    {
        return dao.findById(id).orElse(null);
    }


    public Employeur modifier(Employeur e)
    {
        return dao.save(e);
    }


    public void supprimer(Long id)
    {
        dao.deleteById(id);
    }

}
