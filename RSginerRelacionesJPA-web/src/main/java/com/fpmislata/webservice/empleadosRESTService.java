/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.webservice;

import com.fpmislata.domain.Empleado;
import com.fpmislata.service.empleadosCRUDServiceLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

    @GET
    @Produces("application/json; charset=UTF-8")
    public List<Empleado> getTodos() {
        return this.empleadosCRUDService.getTodos();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json; charset=UTF-8")
    @Consumes("application/json;charset=UTF-8")
    public Empleado getEmpleadoById(@PathParam("id") int id) {
        return this.empleadosCRUDService.getEmpleadoById(id);
    }

    @GET
    @Path("/departamento/{id}")
    @Produces("application/json; charset=UTF-8")
    @Consumes("application/json;charset=UTF-8")
    public List<Empleado> getEmpleadoByIdDepartamento(@PathParam("id") int id) {
        return this.empleadosCRUDService.getEmpleadosByIdDepartamento(id);
    }

}
