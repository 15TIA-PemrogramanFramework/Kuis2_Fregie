/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.controller;
import com.OoAirlines.entity.Identitas_1108;
import com.OoAirlines.service.Identitas_1108Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Mahsiswa 22
 */
@RestController
@RequestMapping("/identitas_1108")
public class Identitas_1108Controller {
    @Autowired
    private Identitas_1108Service identitasService;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas_1108 insert(@RequestBody Identitas_1108 identitas) {
        return identitasService.insert(identitas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas_1108 update(@RequestBody Identitas_1108 identitas) {
        return identitasService.update(identitas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitasService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas_1108 getById(@PathVariable("id") Long id){
        return identitasService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas_1108> getAll(){
        return identitasService.getAll();
    }
}
