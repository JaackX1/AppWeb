<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Servicios</title>

        <!--ESTILOS WEB-->
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">

        <!--ESTILOS CSS-->
        <link href="CSS/StyleTypes.css" rel="stylesheet" type="text/css"/>
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
            });
        </script>
    </head>

    <body>
        <!--BODY NAVBAR-->
        <%@include file="navbar.jsp" %>
        <hr style="margin: 55px auto;" color="ffffff">

        <!--BODY CONTENIDO-->
        <div class="cards">

            <div class="card">
                <div class="header">
                    <span class="license">Asesoria</span>
                    <h2>$1600</h2>
                    <span class="duration">/mes</span>
                    <a href="introAsesoria.jsp" class="btn">Seleccionar</a>
                </div>
                <ul class="features">
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Servicio personalizado</a>
                    </li>
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Profesional con experiencia</a>
                    </li>
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Retroalimentación actival</a>
                    </li>
                </ul>
            </div>
            
            
            <div class="card">
                <div class="header">
                    <span class="license">Planes</span>
                    <h2>$699 / 2000</h2>
                    <span class="duration">/mes</span>
                    <a href="Controlador?accion=home" class="btn">Seleccionar</a>
                </div>
                <ul class="features">
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">inspeccion general</a>
                    </li>
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">1 a 2  Profesionales a cargo</a>
                    </li>
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Costo dependiendo m2</a>
                    </li>
                </ul>
            </div>
            
            
            
            <div class="card">
                <div class="header">
                    <span class="license">Capacitación</span>
                    <h2>$2000</h2>
                    <span class="duration">/mes</span>
                    <a href="capacitacion.jsp" class="btn">Seleccionar</a>
                </div>
                <ul class="features">
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Personal capacitado</a>
                    </li>
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Variedad de capacitaciones</a>
                    </li>
                    <li>
                        <img src="images/checkmark.png" alt=""/>
                        <a href="#">Certificado de capacitación</a>
                    </li>
                </ul>
            </div>

        </div>

        <!--BODY FOOTER-->
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        <%@include file="footer.jsp" %>
    </body>


</html>