<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cliente - Reporte Accidente</title>

        <!--ESTILO CSS-->
        <link href="CSS/pPro.css" rel="stylesheet" type="text/css"/>

        <!--BOOTSTRAP-->
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>

        <!--ESTILOS CSS-->
        <link href="CSS/StyleP.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

        <!--ESTILOS WEB-->
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
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
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">
                                    <img src="images/user.png" alt="" class="rounded-circle" width="150">
                                    <div class="mt-3">
                                        <c:if test="${username!=null}">
                                            <c:if test="${tipo==1}">
                                                <h4>${usernameCliente}</h4>
                                            </c:if>
                                        </c:if>
                                        <p class="text-secondary mb-1">Cliente</p>
                                        <button class="btn btn-success">Editar</button>
                                        <button class="btn btn-outline-danger">Logout</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="card mt-3">
                            <%@include file="cardInfo.jsp" %>
                        </div>
                    </div>
                    <form action="servletAccidente" method="POST">
                        <div class="col-md-8">
                            <div class="card mb-3">
                                <div class="card-body">
                                    <h6 class="mb-0" style="text-align: center">REPORTE DE ACCIDENTE</h6>
                                    <hr>
                                    <label class="text-xl text-gray-600">Dia Accidente <span class="text-red-500">*</span></label></br>
                                    <input type="date" style="width: 50%" class="border-2 border-gray-300 p-2 w-full" name="txtfecha" id="txtfecha" value="" required>
                                    <hr>
                                    <label class="text-xl text-gray-600">Hora <span class="text-red-500">*</span></label></br>
                                    <input type="time" style="width: 50%" class="border-2 border-gray-300 p-2 w-full" name="txthora" id="txthora" value="" required>
                                    <hr>
                                    <label class="text-xl text-gray-600">Descripcion <span class="text-red-500">*</span></label></br>
                                    <textarea placeholder="Escribe tu comentario..." style="width: 100%" name="txtdescripcion" id="txtdescripcion" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                                    <hr>
                                    <label class="text-xl text-gray-600" readonly="">Resolucion</label></br>
                                    <textarea placeholder="En proceso" readonly="" style="width: 100%" name="txtresolucion" id="txtresolucion" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                                    <hr>  
                                    <button type="submit" class="btn btn-success">Guardar</button>
                                    
                                    <c:if test="${msj!=null}">
                                        <div class="alert alert-succes">${msj}</div>
                                    </c:if>

                                    <c:if test="${err!=null}">
                                        <div class="alert alert-succes">${err}</div>
                                    </c:if>
                                    
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp" %>
    </body>

</html>