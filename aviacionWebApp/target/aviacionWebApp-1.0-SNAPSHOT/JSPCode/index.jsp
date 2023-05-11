<%-- 
    Document   : index
    Created on : 27 abr. 2023, 8:33:26
    Author     : Víctor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            
           
        <a href="registroUsuarios.jsp">Registro Usuarios</a>
            
       
        
        
        <form action="../SvUsuarios" method="get">
            
            <button type="submit">Ver lista usuarios:</button>
        </form>
        
        
        
        
        
        
        
        
        <a href="registroAdmin.jsp">Registro Usuarios</a>
        <br>
        <a href="eliminarUsuario.jsp">Eliminar usuarios</a>
        <br>
        <a href="mostrarEditarUsuario.jsp">editarUsuario</a>



        <form action="../SvAdministrador" method="get">
            
            <button type="submit">Ver lista administradores</button>
        </form>
        
        
        
        
        
        <a href="../HtmlCode/registroCategoria.html">Registro categorias</a>

        <form action="../SvCategorias" method="get">
            
            <button type="submit">Ver lista categorias</button>
        </form>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
