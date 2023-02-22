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
@AllArgsConstructor
@NoArgsConstructor
public class UsPicklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_US_Picklist;

    private Long numUS ;
    private  Long id_Pickliste ;
    private int quantité ;
    private Long id_status ;
    // code produit

    private String dateCreation ;
    private String  dateMaj  ;
    private String hostname ;
    private String source ;
    private String creation_par ;
    private String Maj_par ;
}
