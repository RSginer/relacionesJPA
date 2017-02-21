/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.webservice;

import com.fpmislata.service.empleadosCRUDServiceLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Rubén
 */
@Path("/empleados")
@Stateless
public class empleadosRESTService {

    @EJB
    private empleadosCRUDServiceLocal empleadosCRUDService;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    

    
}
