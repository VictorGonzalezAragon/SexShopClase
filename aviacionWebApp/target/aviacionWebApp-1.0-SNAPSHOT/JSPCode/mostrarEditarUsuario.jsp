<%-- 
    Document   : editarUsuario
    Created on : 11 may. 2023, 12:28:25
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

        <form action="../SvEditar" method="get">
        <p> <label>Id: </label> <input type="text" name="id_usuario">         </p>
            <button type="submit">Eliminar usuario</button>
        </form>
        
        

     </body>
</html>
