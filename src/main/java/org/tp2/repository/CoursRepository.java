package org.tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp2.modele.Cours;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer> {
    public List<Cours> findByModuleId(Integer moduleId);
}
