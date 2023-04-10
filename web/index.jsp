<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Index</title>

        <!--BOOTSTRAP-->
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>

        <!--ESTILOS WEB-->
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

        <!--ESTILOS CSS-->
        <link href="CSS/StyleP.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

        <!--SCRIPTS-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8=" crossorigin="anonymous"></script>
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
        <section id="hero-banner">
            <div class="container">
                <div class="row">
                    <div class="col-6 text-align">
                        <h1>Expertos en <span>Seguridad</span></h1>
                        <h2>Te brindamos la mejor asesoria profesional para evitar riesgos en tu empresa, con el mejor
                            servicio personalizado</h2>
                        <div class="button-wrapper">
                            <a href="#" class="btn-get-started">Cotización</a>
                            <a href="#" class="btn-watch-video"><i class='bx bx-play-circle'></i>Watch video</a>
                        </div>
                    </div>
                    <div class="col-6">
                        <img src="RESOURCE/4786.jpg" alt="" class="img-fluid animated">
                    </div>

                </div>
            </div>
        </section>
        <div class="section">
            <div class="container2">
                <div class="content-section">
                    <div class="title">
                        <h1>Sobre nostros</h1>
                    </div>
                    <div class="content">
                        <h3>Expertos con más de 20 años en el rubro</h3>
                        <p>Somos un grupo de más de 40 expertos en prevención de riesgos, presentes en todo el territorio
                            nacional, brindando asesorías a pequeñas, medianas y grandes empresas de distintos rubros. Para
                            las organizaciones que no cuentan con sus propios prevencionistas nos volvemos parte de ellos. Y
                            en el caso en que ya cuentes con prevencionistas, somos tu apoyo y ejecutamos las actividades en
                            distintos puntos de trabajo para que tengas el mayor alcance en tu organización.</p>
                        <hr style="margin: 40px auto;", color="ffffff">
                        <div class="button">
                            <a href="">Contactanos</a>
                        </div>
                    </div>
                </div>
                <div class="image-section">
                    <img src="RESOURCE/Wavy_Ppl-06_Single-03.jpg" alt=""/>
                </div>

            </div>
        </div>
        <div class="nuetros-clientes">
            <div class="title">
                <h1>Nuestros Clientes</h1>
                <hr style="margin: 40px auto;", color="ffffff">
            </div>
            <ul>

                <li> <img src="images/su1.png" alt=""> <img src="images/su2.png" alt=""> </li>
                <li> <img src="images/aa2.jpg" alt=""> <img src="images/ad1.jpg" alt=""> </li>
                <li> <img src="images/n1.png" alt=""> <img src="images/n1.jpg" alt=""> </li>
                <li> <img src="images/jo1.png" alt=""> <img src="images/jo2.png" alt=""> </li>
                <li> <img src="images/as1.jpg" alt=""> <img src="images/as2.png" alt=""> </li>
                <li> <img src="images/nv1.png" alt=""> <img src="images/nv2.png" alt=""> </li>

            </ul>
        </div>

        <!--BODY FOOTER-->
        <%@include file="footer.jsp" %>
    </body>

</html>