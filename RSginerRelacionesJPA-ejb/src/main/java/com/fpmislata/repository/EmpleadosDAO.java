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
import javax.persistence.TypedQuery;

/**
 *
 * @author Rubén
 */
@Stateless
public class EmpleadosDAO implements EmpleadosDAOLocal {

    @PersistenceContext(unitName = "RSginerRelacionesJPA")
    EntityManager em;

    @Override
    public List<Empleado> getEmpleados() {
        return em.createNamedQuery("empleados.findAll").getResultList();
    }

    @Override
    public Empleado getEmpleadoById(int id) {
        return em.find(Empleado.class, id);
    }
    
    @Override
    public List<Empleado> getEmpleadosByIdDepartamento(int id){
        return em.createQuery("SELECT e FROM Empleado e WHERE e.departamento.id = :id")
        .setParameter("id", id)
        .getResultList();
    }

}
