<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>

        <!--ESTILO WEB-->
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

        <!--ESTILO CSS-->    
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/paypal.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

        <!--SCRIPT-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8=" crossorigin="anonymous">
            </script>
        <script>
            $(function () {
                $(".toggle").on("click", function () {
                    if ($(".item").hasClass("active")) {
                        $(".item").removeClass("active");
                    } else {
                        $(".item").addClass("active");
                    }
                });
            });
        </script>    
        <script src="JS/glightbox.min.js" type="text/javascript"></script>
        <script>
            const glightbox = GLightbox({
                selector: '.glightbox'
            })
        </script>

    </head>

    <body>

        <!--BODY NAVBAR-->
        <%@include file="navbar.jsp" %>
        <hr style="margin: 55px auto;", color="ffffff">

        <!--BODY CONTENIDO-->
        <div class="main">
            <div class="container">
                <div class="">
                    <img src="images/PayPal-Logo.png" width="400" height="200" alt=""/>
                </div>

                <form action="servletPaypal" method="POST">
                    <div class="register-top-grid">

                        <h3>CUENTA</h3>
                        <br>
                        <div style="width: 100%">
                            <span>Correo<label>*</label></span>
                            <input type="text" id="txtPaypalCorreo" name="txtPaypalCorreo" required="" > 
                        </div>
                        <div class="clear"> </div>
                    </div>
                    <div class="clear"> </div>
                    <div class="register-bottom-grid">
                        <div style="width: 100%">
                            <input type="text" name="txtPaypalPrecio" hidden="" value="15000" required="">
                            <span>Contraseña<label>*</label></span>
                            <input type="password" id="txtPaypalPass" name="txtPaypalPass" required="">
                        </div>

                        <div class="clear"> </div>
                    </div>
                    <div class="clear"> </div>
                    <input class="btn btn-primary" type="submit" value="Enviar">
                    <!--<a href="Controlador?accion=Pagar" class="btn btn-primary">Enviar</a>-->
                    <c:if test="${msj!=null}">
                        <div class="alert alert-succes">${msj}</div>
                    </c:if>

                    <c:if test="${err!=null}">
                        <div class="alert alert-succes">${err}</div>
                    </c:if>
                    <!--<a href="Controlador?accion=Pagar" class="btn btn-primary">Enviar</a>-->
                </form>
            </div>
            <br>
        </div>

        <!--BODY FOOTER-->
        <%@include file="footer.jsp" %>
    </body>

</html>