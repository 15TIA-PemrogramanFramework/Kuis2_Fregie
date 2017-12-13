/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OoAirlines.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "pilot")
public class Pilot implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_pilot;
    @Column(length = 255, nullable = true)
    private String alamat_pilot;
    @Column(length = 255, nullable = true)
    private String no_hp_pilot;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nama_pilot
     */
    public String getNama_pilot() {
        return nama_pilot;
    }

    /**
     * @param nama_pilot the nama_pilot to set
     */
    public void setNama_pilot(String nama_pilot) {
        this.nama_pilot = nama_pilot;
    }

    /**
     * @return the alamat_pilot
     */
    public String getAlamat_pilot() {
        return alamat_pilot;
    }

    /**
     * @param alamat_pilot the alamat_pilot to set
     */
    public void setAlamat_pilot(String alamat_pilot) {
        this.alamat_pilot = alamat_pilot;
    }

    /**
     * @return the no_hp_pilot
     */
    public String getNo_hp_pilot() {
        return no_hp_pilot;
    }

    /**
     * @param no_hp_pilot the no_hp_pilot to set
     */
    public void setNo_hp_pilot(String no_hp_pilot) {
        this.no_hp_pilot = no_hp_pilot;
    }

    }