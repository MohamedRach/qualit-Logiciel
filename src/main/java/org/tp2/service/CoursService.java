package org.tp2.service;

import org.springframework.stereotype.Service;
import org.tp2.modele.Cours;
import org.tp2.repository.CoursRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoursService {

    private CoursRepository coursRepository;

    public CoursService(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    public List<Cours> getAllCours(Integer moduleId) {
        List<Cours> cours=new ArrayList<>();
        coursRepository.findByModuleId(moduleId).forEach(cours::add);
        return cours;
    }
    public Optional<Cours> getCours(Integer id) {
        return coursRepository.findById(id);
    }
    public void ajouterCours(Cours cours) {
        coursRepository.save(cours); //la méthode save est implémentée dans CourseRepository
    }
    public void modifierCours(Cours cours) {
        coursRepository.save(cours); //ici save dans le rôle de la mise à jour
    }
    public void supprimerCours(Integer id) {
        coursRepository.deleteById(id);
    }
}
