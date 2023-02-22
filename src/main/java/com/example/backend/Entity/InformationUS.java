package com.example.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationUS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numUS ;
    // code produit
    private int quantité  ;
    private String STOCKSPECIAL ;
    private String FOURNISSEUR ;
    private String SAPMAG ;
    private String EMPLACEMENT ;
    private String REFLOTFRS ;
    private String DATECODESAG ;
    private String AVISARRIVAGE;
    private String FABRICANT ;
    private String CODEPART ;
    private String REFFABRICANT ;
    private String CODECOUTSTOCK;
    private int num_piece_fab ;
    //id status
}
