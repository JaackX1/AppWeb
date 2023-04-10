<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>NMA Login</title>
        
        <!--ESTILOS WEB-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        
        <!--ESTILOS CSS-->
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        
        
    </head>


    <body>
        <!--BODY NAVBAR-->
        <%@include file="navbar.jsp" %>

        <!--BODY CONTENIDO-->
        <div class="containerlogin">
            <div class="forms-container">
                <div class="signin-signup">
                    <form action="servletLogin" method="POST" class="sign-in-form">
                        <h2 class="title">Inicia Sesión</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" name="txtusuario" placeholder="Username" required/>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" name="txtpassword" placeholder="Password" required/>
                        </div>
                        
                        <c:if test="${msj!=null}">
                            <div class="alert alert-succes">${msj}</div>
                        </c:if>
                            
                        <c:if test="${err!=null}">
                            <div class="alert alert-succes">${err}</div>
                        </c:if>
                            
                        <input class="btn solid" type="submit" name="btnLogin" value="Login" />

                        <div class="social-media">

                        </div>
                    </form>


                    <form action="servletAgregar" method="POST" class="sign-up-form">
                        <h2 class="title">Enviar credenciales</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text"  name="txtRutempresa" placeholder="Rut" required maxlength="9"/>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-envelope"></i>
                            <input type="text" name="txtNombreEmpresa" placeholder="Nombre Empresa" required/>
                        </div>

                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="text" name="txtDireccion" placeholder="Dirección" required />
                        </div>


                        <div class="input-field">
                            <i class="fas fa-envelope"></i>
                            <input type="number" name="txtTelefono" placeholder="Número" required maxlength="9"/>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="text" name="txtCorreo" placeholder="Correo" required />
                        </div>

                        <div class="select">
                            <select name="format" id="format">
                                <option selected disabled>Escoga su rubro</option>
                                <option value="1">Industrial</option>
                                <option value="2">Minera</option>
                                <option value="3">Construcción</option>
                            </select>
                        </div>
                        
             
                        <input type="submit" name="btnEnviar" class="btn" value="Enviar Datos" />

                        <c:if test="${msj!=null}">
                            <div class="alert alert-succes">${msj}</div>
                        </c:if>
                            
                        <c:if test="${err!=null}">
                            <div class="alert alert-succes">${err}</div>
                        </c:if>
                        
                        <div class="social-media">

                        </div>
                    </form>
                </div>
            </div>

            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>¿Eres nuevo?</h3>
                        <p>
                            Si te interesan los servicios, envianos tus datos y te enviaremos las credenciales para iniciar sesion
                        </p>
                        <button class="btn transparent" id="sign-up-btn">Enviar credenciales</button>
                    </div>
                    <img src="RESOURCE/log.svg" class="image" alt="" />
                </div>
                <div class="panel right-panel">
                    <div class="content">
                        <h3>¿Ya tienes tus credenciales?</h3>
                        <p>
                            Inicia sesion para poder ver los servicios
                        </p>
                        <button class="btn transparent" id="sign-in-btn">Iniciar sesion</button>
                    </div>
                    <img src="RESOURCE/register.svg" class="image" alt="" />
                </div>
            </div>
        </div>
        <script src="JS/login.js" type="text/javascript"></script>


        <!--BODY FOOTER-->
        <%@include file="footer.jsp" %>
    </body>

</html>