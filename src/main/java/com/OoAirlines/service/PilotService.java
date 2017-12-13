/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.service;

import com.OoAirlines.entity.Pilot;
import com.OoAirlines.repo.PilotRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("pilotService")
@Transactional
public class PilotService {

    @Autowired
    private PilotRepo repo;

    public Pilot insert(Pilot pilot) {
        return repo.save(pilot);
    }
    
    public Pilot update(Pilot pilot) {
        return repo.save(pilot);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Pilot getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Pilot> getAll(){
        return repo.findAllPilot();
    }
}
