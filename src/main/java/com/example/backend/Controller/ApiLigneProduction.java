package com.example.backend.Controller;

import com.example.backend.Entity.InformationUS;
import com.example.backend.Entity.LigneProduction;
import com.example.backend.Service.ServiceLigneProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/sagem")
public class ApiLigneProduction {

    @Autowired
    private ServiceLigneProduction ligneProductionservice ;
    @GetMapping("/AllLigneProduction")
    public List<LigneProduction> getAllligneProduction ()
    {
        return ligneProductionservice.getAllLigneProduction();
    }

    @GetMapping("/LigneProduction/{id}")
    public ResponseEntity<LigneProduction> getligneProductionByID(@PathVariable("id") Long id) {
        Optional<LigneProduction> LigneProduction = ligneProductionservice.getOne(id);

        if (LigneProduction.isPresent()) {
            return new ResponseEntity<>(LigneProduction.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/createLigneProduction")
    public LigneProduction postligneProduction(@RequestBody LigneProduction ligneproduction)
    {
        return ligneProductionservice.saveLigneProduction(ligneproduction) ;
    }
    @PutMapping("/updateLigneProduction")
    public LigneProduction updateligneProduction(@RequestBody LigneProduction ligneproduction) {
        return ligneProductionservice.updateLigneProduction(ligneproduction);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteligneProduction(@PathVariable("id") long id) {
        try {
            ligneProductionservice.DeleteLigneProduction(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
