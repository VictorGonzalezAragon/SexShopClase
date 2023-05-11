
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de productos registrados</h1>
        <%
            List<Prosucto> listaProductos = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for(Usuario usu : listaUsuarios){
            
            
        %>
        <p><b>Usuario nº: <%= cont%></b></p>
        <p>Nombre: <%usu.getNombre_usuario();%></p>
        <p>Apellido 1: <%=usu.getApellido1_usuario()%></p>
        <p>Apellido 2: <%=usu.getApellido2_usuario()%></p>
        <p>Email: <%usu.getEmail_usuario();%></p>
        <p>Contraseña: <%usu.getContraseña_usuario();%></p>
        <p>-------------------------------------------</p>
        <%cont = cont + 1 ;%>
        
        
        
        <% } %>
    </body>
</html>
