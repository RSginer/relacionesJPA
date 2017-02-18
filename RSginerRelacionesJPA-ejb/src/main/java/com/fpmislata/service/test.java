/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Empleado;
import com.fpmislata.repository.EmpleadosDAOLocal;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;

/**
 *
 * @author Rubén
 */
@Stateless
@LocalBean
public class test {
  @EJB
    private EmpleadosDAOLocal empleadosDao;
    
    @Resource
    private SessionContext contexto;
    
    public void businessMethod() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String test() {
        return "Hola mundo desde el EJB";
    }

    public List<Empleado> getEmpleados() {
    return this.empleadosDao.getEmpleados();}

}
