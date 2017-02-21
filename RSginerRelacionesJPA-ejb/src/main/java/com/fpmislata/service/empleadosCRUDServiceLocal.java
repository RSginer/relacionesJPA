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
    
}
