package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Socket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_socket;
    private  Long port ;
    private String etat ;
    private String serveur ;
    private String client ;
   /* @ManyToMany(mappedBy ="id_LigneProduction")
    private List<LigneProduction> production = new ArrayList<>();*/
}
