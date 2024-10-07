package org.tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tp2.modele.Module;

@Repository
public interface ModuleRepository extends CrudRepository<Module, Integer> {
}
