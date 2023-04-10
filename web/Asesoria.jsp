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



        <script type="Asesoria/javascript">
            var date = new Date();
            var fecha_hoy = new Date(date.setMonth(date.getMonth() + 1 ));
            var fecha_mes = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();
            
            var diciembre = 12;
            var fecha_hoy_2;
            
            if (fecha_hoy.getMonth() === 0){
                fecha_hoy_2 = (fecha_hoy.getFullYear() - 1) + "-" + diciembre + "-" + fecha_hoy.getDate();
            } else {
                fecha_hoy_2 = fecha_hoy.getFullYear() + "-" + fecha_hoy.getMonth() + "-" + fecha_hoy.getDate();
            }
            
            
            document.getElementById("FechaHoy").setAttribute('value', fecha_hoy_2);
            document.getElementById("Fecha1mes").setAttribute('value', fecha_mes);
            
        </script>


        <script type="text/javascript">
            function funcionalidad(cboMes) {
                //fecha
                var date = new Date();
                var current_date = new Date(date.setMonth(date.getMonth() + 1));
                var next_date = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();
                var fecha_hoy = new Date(date.setMonth(date.getMonth()));
                var fecha_mes = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();

                var dic = 12;
                var current_date2;
                var diciembre = 12;
                var fecha_hoy_2;


                if (fecha_hoy.getMonth() === 0) {
                    fecha_hoy_2 = (fecha_hoy.getFullYear() - 1) + "-" + diciembre + "-" + fecha_hoy.getDate();
                } else {
                    fecha_hoy_2 = fecha_hoy.getFullYear() + "-" + fecha_hoy.getMonth() + "-" + fecha_hoy.getDate();
                }

                if (current_date.getMonth() === 0) {
                    current_date2 = (current_date.getFullYear() - 1) + "-" + dic + "-" + current_date.getDate();
                } else {
                    current_date2 = current_date.getFullYear() + "-" + current_date.getMonth() + "-" + current_date.getDate();
                }


                var new_date;
                var new_date2;



                //precio
                var option = cboMes.value;
                var valor;
                var precio = 1600;

                //condiciones
                if (option === "1 mes") {
                    valor = precio * 1;
                    next_date = date.getFullYear() + "-" + (date.getMonth() + 2) + "-" + date.getDate();

                    new_date = new Date(date.setMonth(date.getMonth() + 1));
                }
                if (option === "2 meses") {
                    valor = precio * 2;
                    next_date = date.getFullYear() + "-" + (date.getMonth() + 3) + "-" + date.getDate();

                    new_date = new Date(date.setMonth(date.getMonth() + 2));
                }
                if (option === "3 meses") {
                    valor = precio * 3;
                    next_date = date.getFullYear() + "-" + (date.getMonth() + 4) + "-" + date.getDate();

                    new_date = new Date(date.setMonth(date.getMonth() + 3));
                }

                if (new_date.getMonth() === 0) {
                    new_date2 = (new_date.getFullYear() - 1) + "-" + dic + "-" + new_date.getDate();
                } else {
                    new_date2 = new_date.getFullYear() + "-" + new_date.getMonth() + "-" + new_date.getDate();
                }





                document.getElementById("inputDinamic").setAttribute('value', valor);
                document.getElementById("inputStartDate").setAttribute('value', current_date2);
                document.getElementById("inputEndDate").setAttribute('value', new_date2);
                document.getElementById("FechaHoy").setAttribute('value', fecha_hoy_2);
                document.getElementById("Fecha1mes").setAttribute('value', fecha_mes);
            }
        </script>

        <script type="text1/javascript">
            function funcionalidad1(cboMes){
            var option = cboMes.value;
            var today = new Date();
            var fechahoy = console.log(`${day}/${month}/${year}`);
            var valor;

            if (option === "1 mes") {
            fechahoy.setMonth(fechahoy.getMonth() + 1)
            valor = fechahoy;

            }
            if (option === "2 meses") {
            fechahoy.setMonth(fechahoy.getMonth() + 2)
            valor = fechahoy;
            }
            if (option === "3 meses") {
            fechahoy.setMonth(fechahoy.getMonth() + 3)
            valor = fechahoy;
            }
            document.getElementById("inputDinamic1").setAttribute('value', valor);

            }
        </script>

        <script type="text1/javascript">
            function funcionalidad2(cboMes){
            var option = cboMes.value;

            var date = new Date();
            var current_date = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+ date.getDate();
            var valor;

            if (option === "1 mes") {
            }
            if (option === "2 meses") {
            }
            if (option === "3 meses") {
            }
            document.getElementById("inputDinamic1").setAttribute('value', valor);
            document.getElementById("inputStartDate").setAttribute('value', current_date);
            document.getElementById("inputStartDate").setAttribute('value', current_date);

            }
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
                            <form action="servletAsesoria" method="POST">
                                <div class="card-body">                    
                                    <label class="text-xl text-gray-600">Cantidad de meses<span class="text-red-500"></span></label></br>                                     
                                    <select id="cboMes" name="cboMes" onchange="funcionalidad(this)">
                                        <option selected disabled>Escoga la cantidad de meses</option>
                                        <option value="1 mes">1 mes</option>
                                        <option value="2 meses">2 meses</option>
                                        <option value="3 meses">3 meses</option>
                                    </select>
                                    <hr>


                                    <label class="text-xl text-gray-600">Fecha inicio asesoria<span class="text-red-500"></span></label></br>
                                    <input type="text" style="width: 150%" class="form-control" name="inputStartDate" id="inputStartDate" value="" readonly="" >
                                    <hr>

                                    <label class="text-xl text-gray-600">Fecha fin asesoria<span class="text-red-500"></span></label></br>
                                    <input type="text" style="width: 150%" class="form-control" name="inputEndDate" id="inputEndDate" value="" readonly="" >
                                    <hr>

                                    <input type="hidden" style="width: 150%"  name="FechaHoy" id="FechaHoy" value="" readonly="" >
                                    <input type="hidden" style="width: 150%"  name="Fecha1mes" id="Fecha1mes" value="" readonly="" >

                                    <label class="text-xl text-gray-600">Precio<span class="text-red-500"></span></label></br>
                                    <input type="number" style="width: 150%" class="form-control" id="inputDinamic" name="inputDinamic" value="" readonly=""></input>
                                    <hr>

                                    <label class="text-xl text-gray-600">Area de trabajo<span class="text-red-500"></span></label></br>
                                    <select name="format2" id="format2" required="">
                                        <option selected disabled>Escoga su rubro</option>
                                        <option value="1">Industrial</option>
                                        <option value="2">Minera</option>
                                        <option value="3">Construcción</option>
                                    </select>                          
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