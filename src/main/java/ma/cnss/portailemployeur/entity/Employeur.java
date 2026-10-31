package ma.cnss.portailemployeur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employeur {
    @Id @GeneratedValue
    private Long id;
    private String code;
    private String libelle;
    private String dernierePeriodeDeclarationCotisation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDernierePeriodeDeclarationCotisation() {
        return dernierePeriodeDeclarationCotisation;
    }

    public void setDernierePeriodeDeclarationCotisation(String dernierePeriodeDeclarationCotisation) {
        this.dernierePeriodeDeclarationCotisation = dernierePeriodeDeclarationCotisation;
    }
}
