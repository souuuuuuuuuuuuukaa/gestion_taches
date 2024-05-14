package com.solution.gestion_tache.entities;


import com.solution.gestion_tache.enums.StatusProjet;
import com.solution.gestion_tache.enums.StatusTache;
import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;



import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projet {
    @Id //clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //utilisé en conjonction avec @id pour generer automatiquement id
    private int id;
    @NotNull //valeur non nulle
    private String Nom;
    private String description;
    @Temporal(TemporalType.DATE) //indique a jpa de stocker seulement la date sans heur
    @DateTimeFormat(pattern = "yyyy-MM-dd") //la forme de la date
    private Date Date_debut;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Date_fin;
    private StatusProjet statusProjet = StatusProjet.A_faire;
    @OneToMany (mappedBy = "projet",fetch = FetchType.LAZY) //lazy :
    private List<Tache>taches=new ArrayList<>();

    /*@ManyToOne
    private chefProjet chef;*/

}
