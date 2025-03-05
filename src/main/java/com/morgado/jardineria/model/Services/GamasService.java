package com.morgado.jardineria.model.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgado.jardineria.model.Entity.Gamas;
import com.morgado.jardineria.model.Repository.GamasRepository;

@Service
public class GamasService {
    @Autowired
    GamasRepository gamasRep;

    public List<Gamas> getAll() {
        return this.gamasRep.findAll();
    }

    public void create(Gamas gama){
        this.gamasRep.save(gama);
    }


    public void delete (String id){
        this.gamasRep.deleteById(id);
    }

    public Gamas getId(String id){
        return this.gamasRep.findById(id).get();
    }

    
}
