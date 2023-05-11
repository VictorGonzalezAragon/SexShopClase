<%-- 
    Document   : registroUsuarios
    Created on : 27 abr. 2023, 9:19:46
    Author     : Víctor
--%>
<%@page import="entidades.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../CssCode/registrousuario.css" rel="stylesheet" type="text/css">

        <title>JSP Page</title>
    </head>
    <body>
         <header>
            <div class="logo">
                <a href="inicio.html"><img src="../Multimedia/Logo/LogoSolo.png" alt="logo"></a>
            </div>
            <div class="botonera">
                <nav>
                    <ul>
                        <li>
                            <a href="#">Gestión</a>
                            <ul>
                                <li><a href="altasproducto.html">Altas</a></li>
                                <li><a href="bajasproducto.html">Bajas</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="Login.html">Login</a>
                        </li>
                        <li>
                            <a href="registrousuario.html">Registro</a>
                        </li>
                    </ul>
                </nav>
            </div>



        </header>
        
 <div class="fueraform">
            <div class="formulario">        
        <form action="../SvUsuarios" method="post">
            
            <p><label>Nombre: </label> <input type = text name="nombre_usuario"></p>
                
            <br/> <br/>
            
            <p><label>Primer Apellido:  </label> <input type = text name="apellido1_usuario"></p>
                
            <br/> <br/>
            
            <p><label>Segundo Apellido: </label> <input type = text name="apellido2_usuario"></p>
                
            <br/> <br/>
            
            <p><label>Nombre de usuario: </label> <input type = text name="nombreUsuario_usuario"></p>
                
            <br/> <br/>
            
            <p><label>Correo electronico: </label> <input type = text name="correo_usuario"></p>
                
            <br/> <br/>
            
            <p><label>Contraseña: </label> <input type = text name="contraseña_usuario"></p>
            <button type="submit" onclick="window">Confirmar</button>  
            
            <%%>
            
            
        </form>
       
               <a href="index.jsp">Inicio</a>

    </body>
</html>
