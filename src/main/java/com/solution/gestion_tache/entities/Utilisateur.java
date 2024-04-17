package com.solution.gestion_tache.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
//pour ajouter l'héritage "SINGLE_TABLE" --> si en a pas beaucoup de classe si non en utilise "JOINED"
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//ajouter un nom a un column
@DiscriminatorColumn(name = "utilisateur")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    @ManyToOne
    Equipe equipe;
    @OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    List<Tache> taches =new ArrayList<>();
}
