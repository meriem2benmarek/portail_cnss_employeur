
package ma.cnss.portailemployeur.dao;

import ma.cnss.portailemployeur.entity.Employeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeurDao extends JpaRepository<Employeur, Long> {

    Employeur findByCode(String code);

    int deleteByCode(String code);

    List<Employeur> findByLibelle(String libelle);

    @Query("SELECT e FROM Employeur e WHERE e.dernierePeriodeDeclarationCotisation = :periode")
    List<Employeur> findByPeriode(@Param("periode") String periode);

}
