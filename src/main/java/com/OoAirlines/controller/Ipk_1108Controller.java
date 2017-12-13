/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.controller;
import com.OoAirlines.entity.Ipk_1108;
import com.OoAirlines.service.Ipk_1108Service;
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
@RequestMapping("/ipk_1108")
public class Ipk_1108Controller {
    @Autowired
    private Ipk_1108Service ipkService;

    @RequestMapping(method = RequestMethod.POST)
    public Ipk_1108 insert(@RequestBody Ipk_1108 ipk) {
        return ipkService.insert(ipk);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ipk_1108 update(@RequestBody Ipk_1108 ipk) {
        return ipkService.update(ipk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipkService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Ipk_1108 getById(@PathVariable("id") Long id){
        return ipkService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk_1108> getAll(){
        return ipkService.getAll();
    }
}
