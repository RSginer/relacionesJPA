<%-- 
    Document   : listaEmpleados
    Created on : 18-feb-2017, 17:49:45
    Author     : Rubén
--%>

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
        <%
            List<Empleado> listaEmpleados = (List<Empleado>) request.getAttribute("listaEmpleados");
            for (int i = 0; i < listaEmpleados.size(); i++) {
                Empleado e = listaEmpleados.get(i);
                out.print(e.getId());
            }
        %>
    </body>
</html>
