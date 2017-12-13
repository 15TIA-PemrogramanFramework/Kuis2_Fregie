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
 * @author Mahsiswa 22
 */
@Entity
@Table(name = "ipk_1108")
public class Ipk_1108 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ipk;
    @Column(length = 100, nullable = false, unique = true)
    private String nilai;
    @Column(length = 255, nullable = true)
    private int batas_awal;
    @Column(length = 255, nullable = true)
    private int batas_akhir;

    /**
     * @return the id_ipk
     */
    public Long getId_ipk() {
        return id_ipk;
    }

    /**
     * @param id_ipk the id_ipk to set
     */
    public void setId_ipk(Long id_ipk) {
        this.id_ipk = id_ipk;
    }

    /**
     * @return the nilai
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the batas_awal
     */
    public int getBatas_awal() {
        return batas_awal;
    }

    /**
     * @param batas_awal the batas_awal to set
     */
    public void setBatas_awal(int batas_awal) {
        this.batas_awal = batas_awal;
    }

    /**
     * @return the batas_akhir
     */
    public int getBatas_akhir() {
        return batas_akhir;
    }

    /**
     * @param batas_akhir the batas_akhir to set
     */
    public void setBatas_akhir(int batas_akhir) {
        this.batas_akhir = batas_akhir;
    }
}
