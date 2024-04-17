package com.solution.gestion_tache.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Entity
//genirer les getters et les setters
@Data
//constucteur avec arguments
@AllArgsConstructor
//constucteur sans arguments
@NoArgsConstructor
//pour établir des enregestrement à l'intérieur du code pour enregistrer directement dans la base de donnée
@Builder
public class Equipe {
    @Id
    //genirer au sein de la base de donnée
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nom;
    @OneToMany
    private List<Utilisateur>utilisateur=new ArrayList<>();

}
