<%-- 
    Document   : navbar
    Created on : 01-oct-2022, 13:20:45
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
        <nav class="navbar">
            <a href="index.jsp" class="nav-branding">NMA</a>
            <li class="logo"><a href="index.jsp"><img src="RESOURCE/logo.png" alt=""></a></li>
            <ul class="nav-menu">
          
                <li class="nav-item">
                    <a href="Controlador?accion=Carrito" class="nav-link"><i class="fas fa-cart-plus">(<label style="color: orange">${contador}</label>)</i>Carrito</a>
                </li>
                
                <li class="nav-item">
                    <a href="index.jsp" class="nav-link">Inicio</a>
                </li>

                <li class="nav-item">
                    <a href="tipoServicio.jsp" class="nav-link">Servicios</a>
                </li>

                <li class="nav-item">
                    <a href="contact.jsp" class="nav-link">Contactanos</a>
                </li>
                
                <c:if test="${tipo==2}">
                <li class="nav-item">
                    <a href="servletCuentas" class="nav-link">Mi Perfil</a>
                </li>
                </c:if>
                
                <c:if test="${tipo==3}">
                <li class="nav-item">
                    <a href="servletCuentas" class="nav-link">Mi Perfil</a>
                </li>
                </c:if>
                
                <c:if test="${tipo==1}">
                <li class="nav-item">
                    <a href="servletCuentas" class="nav-link">Mi perfil</a>
                </li>
                </c:if>
                
      
                <c:if test="${username!=null}">
                   
                    <c:if test="${tipo==1}">
                        <div class="alert alert-primary" >Bienvenido Cliente ${usernameCliente}</div>
                    </c:if>
                        
                    <c:if test="${tipo==2}">
                        <div class="alert alert-warning">Bienvenido Administrador ${usernameNPer} ${usernameAPer}</div>
                    </c:if>
                        
                    <c:if test="${tipo==3}">
                        <div class="alert alert-warning">Bienvenido Profesional ${usernameNPer} ${usernameAPer}</div>
                    </c:if>    
                    
                    <li class="item button"><a href="servletLogin">Cerrar Sesion</a></li>
                </c:if>

                        
                <c:if test="${username==null}">
                <li class="item button"><a href="login.jsp">Iniciar Sesion</a></li>
                <li class="item button secondary"><a href="login.jsp">Registrarse</a></li>
                <li class="toggle"><span class="bars"></span></li>
                </c:if>
                
            </ul>

            <div class="hamburger">
                <span class="bar"></span>
                <span class="bar"></span>
                <span class="bar"></span>
            </div>
            <script src="JS/script.js" type="text/javascript"></script>
        </nav>
    </header>
    </body>
</html>
