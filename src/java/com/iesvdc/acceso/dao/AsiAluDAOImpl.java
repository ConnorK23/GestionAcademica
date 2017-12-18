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
public class AsiAluDAOImpl implements AsiAluDAO {

    @Override
    public List<Alumno> findByAlumno(String alumno) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asignatura> findByAsignatura(String asignatura) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
