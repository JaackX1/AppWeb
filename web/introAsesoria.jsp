<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Capacitacion</title>

        <!--ESTILOS WEB-->
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">

        <!--ESTILOS CSS-->
        <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/capacita.css" rel="stylesheet" type="text/css"/>

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
        <div class="sectionC">
            <div class="container2C">
                <div class="content-sectionC">
                    <div class="titleC">
                        <h1>Sobre nuestas Asesorias</h1>
                    </div>
                    <div class="contentC">
                        <h3>Expertos con más de 20 años en el rubro</h3>
                        <p>Lorem ipsum dolor sit amet consectetur adipiscing elit eleifend bibendum, 
                            molestie euismod quis purus tellus vivamus praesent vitae fermentum, 
                            rutrum facilisi ultrices pulvinar cursus velit massa placerat. Habitant auctor integer quam hac fusce eros risus, 
                            fringilla justo congue mi primis porttitor. Nibh faucibus venenatis gravida sem hendrerit porta etiam est tempus, 
                            eu sed cum quisque dis malesuada duis dui, vestibulum mus mollis leo aliquet ornare turpis vel. Lacinia platea nam 
                            senectus odio, arcu diam interdum.</p>
                        <hr style="margin: 40px auto;" color="ffffff">
                        <div class="buttonC">
                            <c:if test="${username!=null}">
                                <a href="Asesoria.jsp">Pedir Asesoria</a>
                            </c:if>
                            <c:if test="${username==null}">
                            <a href="login.jsp">Iniciar sesion</a>
                            </c:if>
                        </div>
                    </div>
                </div>
                <div class="image-sectionC">
                    <img src="RESOURCE/5995353_1.jpg" alt=""/>
                </div>

            </div>
        </div>

        <!--BODY FOOTER-->
        <%@include file="footer.jsp" %>
    </body>

</html>