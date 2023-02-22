package com.example.backend.Service;

import com.example.backend.Entity.InformationUS;
import com.example.backend.Repository.RepInformationUS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceUSInformation {

    @Autowired
    private RepInformationUS repInformationUS ;
    public List<InformationUS> getAllInformationUS()
    {
        return repInformationUS.findAll();
    }

    public Optional<InformationUS> getOne(Long id)
    {
        return repInformationUS.findById(id);
    }
    public InformationUS findByid(Long id)
    {
        return repInformationUS.findById(id).get();
    }

    public InformationUS saveInformationUS(InformationUS InformationUS)
    {
        return repInformationUS.save(InformationUS);
    }
    public InformationUS updateInformationUS(InformationUS InformationUS)
    {
        return repInformationUS.save(InformationUS);
    }

    public boolean exsitById(Long id )
    {
        return repInformationUS.existsById(id);
    }
    public void DeleteInformationUS(Long id)
    {
        InformationUS InformationUS = findByid(id);
        repInformationUS.delete(InformationUS);
    }


}
