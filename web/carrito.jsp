<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!--DEFAULT INFO-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Carrito</title>

        <!--BOOTSTRAP-->
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>

        <!--ESTILOS WEB-->
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">    

        <!--ESTILOS CSS-->
        <link href="CSS/StyleCarrito.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

        <!--SCRIPT-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
                integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8=" crossorigin="anonymous">
        </script>
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="JS/funciones.js" type="text/javascript"></script>
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
        <hr style="margin: 55px auto;", color="ffffff">

        <!--BODY CONTENIDO-->
        <div class="container mt-4">
            <h3>Carrito</h3>
            <br>
            <div class="row">
                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Items</th>
                                <th>Nombres</th>
                                <th>Descripcion</th>
                                <th>Precio</th>
                                <th>Cant</th>
                                <th>Subtotal</th>
                                <th>Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="car" items="${carrito}">
                                <tr>
                                    <td>${car.getItem()}</td>
                                    <td>${car.getNombres()}</td>
                                    <td>${car.getDescripcion()}</td>
                                    <td>${car.getPrecioCompra()}</td>
                                    <td>
                                        <input type="number" hidden="true" id="idpro" name="idpro" value="${car.getIdProducto()}"></input>
                                        <input type="number" id="Cantidad" max="1" name="Cantidad" value="${car.getCantidad()}" class="form-control text-center" min="1"></input>
                                        <input type="number" hidden="true" id="cantidadTotal" name="cantidadTotal"  value="${car.getSubTotal()}"></input>
                                    </td>
                                    <td>${car.getSubTotal()}</td>
                                    <td>
                                        <input type="hidden" id="idp" value="${car.getIdProducto()}"></input>
                                        <a href="# " id="btnDelete">eliminar</a>
                                    </td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col-sm-4">
                    <div class="card">
                        <div class="card-header">
                            <h3>Generar compra</h3>
                        </div>

                        <div class="card-body">
                            <label>Subtotal</label>
                            <input type="text" value="$.${totalPagar}0" readonly="" class="form-control"></input>
                            <label>Descuento</label>
                            <input type="text" value="$0.00" readonly="" class="form-control"></input>
                            <label>Total a pagar</label>
                            <input type="text" value="$.${totalPagar}0" readonly="" class="form-control"></input>
                        </div>

                        <div class="card-footerr">
                            <form method="POST" action="servletContrato">
                                <input type="number" hidden="true" id="id_plan_jsp" name="id_plan_jsp" value="${ididi}"></input>
                                <input type="number" hidden="true" id="totalpagarr" name="totalpagarr" value="${totalPagar}"></input>
                                <input type="submit" class="btn btn-info btn-block"></input>

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