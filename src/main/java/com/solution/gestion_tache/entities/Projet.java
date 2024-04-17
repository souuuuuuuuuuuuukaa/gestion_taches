package com.solution.gestion_tache.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nom;
    private String description;
    private Date Date_debut;
    private Date Date_fin;
    @OneToMany (mappedBy = "projet",fetch = FetchType.LAZY)
    private List<Tache>taches=new ArrayList<>();
    @ManyToOne
    private chefProjet chef;

}
