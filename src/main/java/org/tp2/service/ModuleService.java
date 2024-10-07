package org.tp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tp2.modele.Module;
import org.tp2.repository.ModuleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;


    public List<Module> findAll() {
        List<Module> modules = new ArrayList<Module>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }

    public Module findById(int id) {
        return moduleRepository.findById(id).orElse(null);
    }

    public void ajouterModule(Module module) {
        moduleRepository.save(module);
    }

    public void modifierModule(Module module) {
        moduleRepository.save(module);
    }

    public void supprimerModule(Module module) {
        moduleRepository.delete(module);
    }
}
