package com.solution.gestion_tache.reposirories;

import com.solution.gestion_tache.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*Repository indique à Spring que cette interface est un bean de type repository*/
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}

/*ette interface hérite des fonctionnalités fournies par JpaRepository,
qui est une interfacefournie par Spring Data JPA pour
interagir avec la base de données.*/
/*Long est le type de l'identifiant de l'entité Utilisateur*/
