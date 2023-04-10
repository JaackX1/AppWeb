<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Profesional</title>

        <!--ESTILOS CSS-->
        <link href="CSS/pPro.css" rel="stylesheet" type="text/css"/>

        <!--BOOTSTRAP-->
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>

        <!--ESTILOS CSS-->
        <link href="CSS/StyleP.css" rel="stylesheet" type="text/css"/> 
        <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

        <!--ESTILOS WEB-->
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

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
        <hr style="margin: 55px auto;" color="ffffff">

        <!--BODY CONTENIDO-->
        <div class="container">
            <div class="main-body">
                <div class="row gutters-sm">
                    <div class="col-md-4 mb-3">
                        <div class="card mt-3">
                            <%@include file="cardInfo.jsp" %>
                        </div>
                    </div> 

                    <div class="col-md-8">

                        <div class="card mb-3">
                            <form action="servletAgregarContrato" method="POST">
                                <div class="card-body">
                                    <label class="text-xl text-gray-600">Fecha de pago<span class="text-red-500"></span></label></br>
                                    <input type="text" style="width: 150%" class="form-control" name="fecha_fin_pago" id="fecha_fin_pago" value="${fecha_fin_pago}" readonly="" required>
                                    <hr>

                                    <h6 class="mb-0" style="text-align: center">Total pago</h6>
                                    <input type="number" style="width: 150%" class="form-control" name="totalpagarr" id="totalpagarr" value="${totalpagarr}" readonly="" required>
                                    <hr>



                                    <label class="text-xl text-gray-600">Plan<span class="text-red-500"></span></label></br>
                                    <input type="number" style="width: 150%" class="form-control" id="ididi" name="ididi" value="${ididi}" readonly=""></input>
                                    <hr>

                                    <label class="text-xl text-gray-600">Usuario<span class="text-red-500"></span></label></br>
                                    <input type="text" style="width: 150%" class="form-control" name="sesionUser" id="sesionUser" value="${sesionUser}" readonly="" required>
                                    <hr>


                                    <label class="text-xl text-gray-600">Firma<span class="text-red-500"></span></label></br>
                                    <input type="text" style="width: 150%" class="form-control" name="firma" id="firma" value="${firma}" readonly="" required>
                                    <hr>

                                    <label class="text-xl text-gray-600">Fecha de inicio<span class="text-red-500"></span></label></br>
                                    <input type="text" style="width: 150%" class="form-control" name="fecha_inicio_pago" id="fecha_inicio_pago" value="${fecha_inicio}" readonly="" required>
                                    <hr>

                                    <button type="submit" class="btn btn-success">Guardar</button>
                                   
                                    <c:if test="${msj!=null}">
                                        <div class="alert alert-succes">${msj}</div>
                                    </c:if>
                                    <c:if test="${err!=null}">
                                        <div class="alert alert-succes">${err}</div>
                                    </c:if>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <!--BODY FOOTER-->
        <%@include file="footer.jsp" %>
    </body>

</html>