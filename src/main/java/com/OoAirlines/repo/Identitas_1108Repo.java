/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.repo;

import com.OoAirlines.entity.Identitas_1108;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Identitas_1108Repo extends CrudRepository<Identitas_1108, Long> {

    @Query("select pi from Identitas_1108 pi")
    public List<Identitas_1108> findAllIdentitas();
}
