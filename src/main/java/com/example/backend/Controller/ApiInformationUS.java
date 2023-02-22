package com.example.backend.Controller;

import com.example.backend.Entity.InformationUS;
import com.example.backend.Service.ServiceUSInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/sageminformationus")
public class ApiInformationUS {
    @Autowired
    private ServiceUSInformation informationUS ;

    @GetMapping("/allInformationUS")
    public List<InformationUS> getAllInformationUS ()
    {
        return informationUS.getAllInformationUS();
    }

    @GetMapping("/informationUS/{id}")
        public ResponseEntity<InformationUS> getInformationByID
            (@PathVariable("id") Long id) {
        Optional<InformationUS> InformationUS = informationUS.getOne(id);

        if (InformationUS.isPresent()) {
            return new ResponseEntity<>(InformationUS.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/createInformationus")
        public InformationUS postInformationUS(@RequestBody InformationUS informationus)
        {
            return informationUS.saveInformationUS(informationus) ;
        }
        @PutMapping("/update")
        public InformationUS updateinformationUS(@RequestBody InformationUS informationus) {
            return informationUS.updateInformationUS(informationus);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<HttpStatus> deleteInformationUS(@PathVariable("id") long id) {
            try {
                informationUS.DeleteInformationUS(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }


