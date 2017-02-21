/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Empleado;
import com.fpmislata.repository.EmpleadosDAOLocal;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author Rubén
 */
@Stateless
public class empleadosCRUDService implements empleadosCRUDServiceLocal {
  @EJB
    private EmpleadosDAOLocal empleadosDao;
    
    @Resource
    private SessionContext contexto;
    
    @Override
    public List getTodos() {
        return this.empleadosDao.getEmpleados();
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
