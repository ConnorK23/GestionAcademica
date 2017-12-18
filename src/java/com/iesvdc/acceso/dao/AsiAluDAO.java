/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.dao;

import com.iesvdc.acceso.pojo.Alumno;
import com.iesvdc.acceso.pojo.Asignatura;
import java.util.List;

/**
 *
 * @author Jesus & Juan Isaac
 */
public interface AsiAluDAO {
    public List<Alumno> findByAlumno(Integer alumno) throws DAOException;

    public List<Asignatura> findByAsignatura(Integer asignatura) throws DAOException;
}
