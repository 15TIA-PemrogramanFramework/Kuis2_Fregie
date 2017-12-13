/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.repo;

import com.OoAirlines.entity.Pilot;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface PilotRepo extends CrudRepository<Pilot, Long> {

    @Query("select pi from Pilot pi")
    public List<Pilot> findAllPilot();
}
