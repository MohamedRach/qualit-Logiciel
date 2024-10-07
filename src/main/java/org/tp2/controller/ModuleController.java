package org.tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.tp2.modele.Module;
import org.tp2.service.ModuleService;

import java.util.List;

@RestController
public class ModuleController {

    private final ModuleService moduleService;

    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @RequestMapping("/modules")
    public List<Module> getModules() {
        return moduleService.findAll();
    }

    @RequestMapping("/modules/{id}")
    public Module getModule(@PathVariable int id) {
        return moduleService.findById(id);
    }

    @PostMapping("/modules")
    public void addModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }

    @PutMapping("/modules")
    public void updateModule(@RequestBody Module module) {
        moduleService.modifierModule(module);
    }

    @DeleteMapping("/modules")
    public void deleteModules(@RequestBody Module module) {
        moduleService.supprimerModule(module);
    }

}
