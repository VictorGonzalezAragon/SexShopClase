<%@page import="java.util.List"%>
<%@page import="entidades.Administrador"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>

        <h1>Lista usuarios registrados</h1>

        <%  
            
            List<Administrador> listaAdmins = (List) request.getSession().getAttribute("listaAdmins");

            int i = 1;

            for(Administrador admin : listaAdmins){%>
            
            <p>Numero de administrador <%=i%></p>
            <p>Id: <%=admin.getId_administrador()%></p>
            <p>Nombre:<%=admin.getNombre_administrador()%>  </p>
            <p>Apellido1: </p>
            <p>Apellido2: </p>
            <p>Nombre de Usuario: </p>
            <p>Email: </p>
            <p>Contraseña: </p>
            <p>--------------------------------</p>

            

        <% i++; }%>  


        

        <br>
        <a href="index.jsp">Inicio</a>

    </body>
</html>
