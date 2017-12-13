/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.service;

import com.OoAirlines.entity.Ipk_1108;
import com.OoAirlines.repo.Ipk_1108Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("Ipk_1108Service")
@Transactional
public class Ipk_1108Service {

    @Autowired
    private Ipk_1108Repo repo;

    public Ipk_1108 insert(Ipk_1108 ipk) {
        return repo.save(ipk);
    }
    
    public Ipk_1108 update(Ipk_1108 ipk) {
        return repo.save(ipk);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Ipk_1108 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Ipk_1108> getAll(){
        return repo.findAllIpk();
    }
}
