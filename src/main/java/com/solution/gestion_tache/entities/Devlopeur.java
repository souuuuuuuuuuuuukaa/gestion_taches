package com.solution.gestion_tache.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Devlopeur extends Utilisateur {

    private int id;

}
