package com.solution.gestion_tache.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class chefProjet extends Utilisateur{

    private int id;
/*    @OneToMany(mappedBy = "chef",fetch = FetchType.LAZY)
    private List<Projet>projet=new ArrayList<>();*/
}
