package com.solution.gestion_tache.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Statut;
    private String Titre;
    private String description;
    private Date Date_debut;
    private Date Date_fin;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Projet projet;
}
