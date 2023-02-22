package com.example.backend.Controller;

import com.example.backend.Entity.InformationUS;
import com.example.backend.Entity.LigneProduction;
import com.example.backend.Entity.Statut;
import com.example.backend.Service.ServiceStaut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/sagemStatut")
public class ApiStatut {

     @Autowired
    private ServiceStaut serviceStaut ;


    @GetMapping("/allStatut")
    public List<Statut> getAllStatut ()
    {
        return serviceStaut.getAllStatut();
    }
    @PostMapping("/createStatut")
    public Statut postStatut(@RequestBody Statut statut)
    {
        return serviceStaut.saveSatut(statut) ;
    }
    @PutMapping("/update")
    public Statut updateStatut(@RequestBody Statut statut) {
        return serviceStaut.updateStatut(statut);
    }


}
