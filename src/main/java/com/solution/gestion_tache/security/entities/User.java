package com.solution.gestion_tache.security.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String id;
    @Column(unique = true)
    private String nom;
    private String password;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles= new ArrayList<>();
}
