/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.controller;

import com.OoAirlines.entity.Pilot;
import com.OoAirlines.service.PilotService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/pilot")
public class PilotController {

    @Autowired
    private PilotService pilotService;

    @RequestMapping(method = RequestMethod.POST)
    public Pilot insert(@RequestBody Pilot pilot) {
        return pilotService.insert(pilot);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Pilot update(@RequestBody Pilot pilot) {
        return pilotService.update(pilot);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return pilotService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Pilot getById(@PathVariable("id") Long id){
        return pilotService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Pilot> getAll(){
        return pilotService.getAll();
    }
}
