/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.service;

import com.OoAirlines.entity.Identitas_1108;
import com.OoAirlines.repo.Identitas_1108Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("Identitas_1108Service")
@Transactional
public class Identitas_1108Service {

    @Autowired
    private Identitas_1108Repo repo;

    public Identitas_1108 insert(Identitas_1108 identitas) {
        return repo.save(identitas);
    }
    
    public Identitas_1108 update(Identitas_1108 identitas) {
        return repo.save(identitas);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas_1108 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas_1108> getAll(){
        return repo.findAllIdentitas();
    }
}
