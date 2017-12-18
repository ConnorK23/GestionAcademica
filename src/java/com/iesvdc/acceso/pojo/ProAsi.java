/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jesus & Juan Isaac
 */
@XmlRootElement(name = "proasi")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProAsi {

    @XmlElement
    String profesor;
    @XmlElement
    String asignatura;

    public ProAsi() {
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "ProAsi{" + "profesor=" + profesor + ", asignatura=" + asignatura + '}';
    }
    
}
