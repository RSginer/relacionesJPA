<%-- 
    Document   : test
    Created on : 18-feb-2017, 14:35:30
    Author     : Rubén
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% out.print(request.getSession().getAttribute("test"));%>
    </body>
</html>
