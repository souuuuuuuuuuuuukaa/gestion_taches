package com.solution.gestion_tache.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity    // Cela signifie que les instances de cette classe peuvent être stockées dans une base de données
//pour ajouter l'héritage "SINGLE_TABLE" --> si en a pas beaucoup de classe si non en utilise "JOINED"
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//ajouter un nom a un column
//indique que toutes les classes de la hiérarchie seront mappées sur une seule table dans la base de données.
@DiscriminatorColumn(name = "utilisateur")
//@DiscriminatorColumn est utilisee avec stratégie SIGNLE TABLE pour ajouter une colonne discriminatrice à la table qui permet de distinguer les différentes sous-classes.
@Data    //pour getter et setters ..(par Lombok)
@AllArgsConstructor // constructeur avec arguments
@NoArgsConstructor   //cnstr sans arguments
@Builder
//de Lombok est utilisée pour générer un constructeur de type builder pour la classe .
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Erreur")
    private String nom;
    @NotBlank(message = "Erreur")
    private String prenom;
    @NotBlank(message = "Erreur")
    @Email
    private String email;
    @ManyToOne
    Equipe equipe;
    @OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    List<Tache> taches =new ArrayList<>();
}
