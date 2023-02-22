package com.example.backend.Service;

import com.example.backend.Entity.LigneProduction;
import com.example.backend.Entity.Statut;
import com.example.backend.Repository.RepStatut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStaut {

    @Autowired
    private RepStatut repesorityStatut ;

    public List<Statut> getAllStatut()
    {
        return repesorityStatut.findAll();
    }
    public Statut saveSatut(Statut statut)
    {
        return repesorityStatut.save(statut);
    }
    public Statut updateStatut(Statut statut)
    {
        return repesorityStatut.save(statut);
    }
}
