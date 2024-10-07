package org.tp2.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cours {

    @Id
    private int id;
    private String nom;
    private String description;
    //add variable
    private String zoubeir;

    @ManyToOne
    private Module module;

}
