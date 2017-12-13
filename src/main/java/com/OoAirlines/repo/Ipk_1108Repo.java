/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.repo;

import com.OoAirlines.entity.Ipk_1108;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Ipk_1108Repo extends CrudRepository<Ipk_1108, Long> {

    @Query("select pi from Ipk_1108 pi")
    public List<Ipk_1108> findAllIpk();
}
