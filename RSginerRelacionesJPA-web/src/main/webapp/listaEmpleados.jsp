<%-- 
    Document   : listaEmpleados
    Created on : 18-feb-2017, 17:49:45
    Author     : Rubén
--%>

<%@page import="com.fpmislata.domain.Proyecto"%>
<%@page import="com.fpmislata.domain.Empleado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <caption>Lista Empleados</caption>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Departamento</th>
                <th>Nº Plaza de aparcamiento</th>
                <th>Proyectos</th>
            </tr>    
            <%
                List<Empleado> listaEmpleados = (List<Empleado>) request.getSession().getAttribute("listaEmpleados");
                for (int i = 0; i < listaEmpleados.size(); i++) {
                    Empleado e = listaEmpleados.get(i);
            %>
            <tr>
                <td><%=e.getId()%></td>
                <td><%=e.getNombre()%></td>
                <td><%=e.getDepartamento().getNombre()%></td>
                <td><%=e.getPlazaAparcamiento().getId()%></td>
                <td>
                    <table border="1">
                        <th>Código proyecto</th>
                        <th>Nombre proyecto</th>
                        <%
                            List<Proyecto> listaProyectos = e.getProyectos();
                            for (int j = 0; j < listaProyectos.size(); j++) {
                                %>
                        <tr>
                            <td>
                                <%=listaProyectos.get(j).getId()%>
                            </td>
                             <td>
                                <%=listaProyectos.get(j).getNombre()%>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                      
                    </table>
                </td>
            </tr>
            <%}
            %>

        </table>
    </body>
</html>
