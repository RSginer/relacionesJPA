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
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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

    @DELETE
    @Path("/{id}")
    @Produces("application/json; charset=UTF-8")
    @Consumes("application/json; charset=UTF-8")
    public Response deleteEmpleadoById(@PathParam("id") int id) {
        try {
            Empleado e = empleadosCRUDService.getEmpleadoById(id);
            empleadosCRUDService.deleteEmpleado(e);
            return Response.ok().header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_TYPE.withCharset("UTF-8")).build();
        } catch (Exception ex) {
            return Response.status(404).header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_TYPE.withCharset("UTF-8")).build();
        }
    }

    @POST
    @Produces("application/json; charset=UTF-8")
    @Consumes("application/json; charset=UTF-8")
    public Empleado addEmpleado(Empleado e) {
        return this.empleadosCRUDService.addEmpleado(e);
    }

    @PUT
    @Path("/{id}")
    @Produces("application/json; charset=UTF-8")
    @Consumes("application/json; charset=UTF-8")
    public Response updateEmpleado(@PathParam("id") int id, Empleado empleadoNuevo) {
        try {
            Empleado empleado = this.empleadosCRUDService.getEmpleadoById(id);
            if (empleado != null) {
                empleado = empleadoNuevo;
                empleado = this.empleadosCRUDService.updateEmpleado(empleado);
                return Response.ok().entity(empleado).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
    }

}
