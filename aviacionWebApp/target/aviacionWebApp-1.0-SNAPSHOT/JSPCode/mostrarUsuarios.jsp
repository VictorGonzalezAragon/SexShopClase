<%@page import="java.util.List"%>
<%@page import="entidades.Usuario"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostar Usuarios</title>
    </head>
    <body>

        <h1>Lista usuarios registrados</h1>

        <%  
            
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            
            int i = 1;

            for(Usuario usu : listaUsuarios){%>
            
            <p>Numero de usuario: <%=i%></p>
            <p>Id: <%=usu.getId_usuario()%></p>
            <p>Nombre:<%=usu.getNombre_usuario()%>  </p>
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
