package org.tp2.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Module {
    @Id
    private int id;
    private String nom;
    private String description;

}
