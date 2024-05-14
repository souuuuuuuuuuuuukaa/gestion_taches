package com.solution.gestion_tache.services;


import com.solution.gestion_tache.entities.Projet;
import com.solution.gestion_tache.entities.Tache;
import com.solution.gestion_tache.reposirories.TachesRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TacheServiceImpli implements TacheService{
    private TachesRepository tachesRepository;

    @Override
    public Tache saveTache(Tache tache) {
        return tachesRepository.save(tache);
    }

    @Override
    public Tache updateTache(Tache tache) {
        return tachesRepository.save(tache);
    }

    @Override
    public void deleteTacheById(Long id) {
        tachesRepository.deleteById(id);
    }

    @Override
    public void deleteTache() {
     tachesRepository.deleteAll();
    }

    @Override
    public Tache getTacheById(Long id) {
        return tachesRepository.findById(id).get();
    }

    @Override
    public List<Tache> getAllTache() {
        return tachesRepository.findAll();
    }




}
