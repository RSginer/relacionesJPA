/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.repository;

import com.fpmislata.domain.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rubén
 */
@Stateless
public class EmpleadosDAO implements EmpleadosDAOLocal {

    @PersistenceContext(unitName = "RSginerRelacionesJPA")
    EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Empleado> getEmpleados() {
        return em.createNamedQuery("empleados.findAll").getResultList();
    }
    
    
}
