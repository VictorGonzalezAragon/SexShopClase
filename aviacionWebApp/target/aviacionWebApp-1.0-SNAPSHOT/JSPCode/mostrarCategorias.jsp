<%@page import="java.util.List"%>
<%@page import="entidades.Categorias"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Lista categorias existentes</h1>


<%  
            
            List<Categorias> listaCategorias = (List) request.getSession().getAttribute("listaCategoria");
            
            int i = 1;

            for(Categorias cat : listaCategorias){%>
            
            <p>Id: <%=cat.getId_categoria()%></p>
            <p>Nombre:<%=cat.getNombre_categoria()%>  </p>
            <p>--------------------------------</p>

            

        <% i++; }%>  

 <br>
        <a href="index.jsp">Inicio</a>

    </body>
</html>
