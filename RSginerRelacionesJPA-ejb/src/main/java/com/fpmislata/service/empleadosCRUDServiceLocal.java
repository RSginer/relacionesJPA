/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rubén
 */
@Local
public interface empleadosCRUDServiceLocal {

    List<Empleado> getTodos();

    Empleado getEmpleadoById(int id);

    List<Empleado> getEmpleadosByIdDepartamento(int id);

    Empleado addEmpleado(Empleado e);

    Empleado updateEmpleado(Empleado e);

    void deleteEmpleado(Empleado e);

}
