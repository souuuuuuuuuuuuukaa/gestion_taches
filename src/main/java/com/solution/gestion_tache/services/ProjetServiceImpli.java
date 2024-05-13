package com.solution.gestion_tache.services;

import com.solution.gestion_tache.entities.Projet;
import com.solution.gestion_tache.reposirories.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor //cette ligne
public class ProjetServiceImpli implements ProjetService{
    private ProjetRepository projetRepository; //et cette ligne
    /*remplacent @Autowired qui fait l'injection des dependances dans les beans automatiquement*/
    @Override
    public Projet saveProjet(Projet projet) {

        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {

        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjetById(Long id) {
        projetRepository.deleteById(id);

    }

    @Override
    public void deleteProjet() {

        projetRepository.deleteAll();
    }

    @Override
    public Projet getProjetById(Long id) {

        return projetRepository.findById(id).get();
    }

    @Override
    public List<Projet> getAllProjet() {

        return projetRepository.findAll();
    }
}
