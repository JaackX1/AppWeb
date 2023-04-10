<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin - Actividades</title>
    
    <!--ESTILOS CSS-->
    <link href="CSS/pPro.css" rel="stylesheet" type="text/css"/>
    <link href="CSS/dropdown.css" rel="stylesheet" type="text/css"/>
    
    <!--BOOTSTRAP-->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>
  
    <!--ESTILOS CSS-->
    <link href="CSS/StyleCheckResp.css" rel="stylesheet" type="text/css"/> 
    <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

    <!--ESTILOS WEB-->
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
    <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

    <!--STYLE-->
    <style>
        spanQuit {
            display: inline-block;
            width: 20px;
            height: 20px;
            background-color: firebrick;
            border-radius: 100%;
            text-align: center;
            color: #fff;
            margin: 0 10px;
            cursor: pointer;
        }

        spanQuit:hover {
            background-color: darkred;
        }
    </style>
    
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
    <script>
    document.addEventListener("alpine:init", () => {
        Alpine.data("select", () => ({
            open: false,
            language: "",

            toggle() {
                this.open = !this.open;
            },

            setLanguage(val) {
                this.language = val;
                this.open = false;
            },
        }));
    });
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
                            <c:if test="${tipo==2}">
                                <h4>${usernameNPer} ${usernameAPer}</h4>
                            </c:if>
                        </c:if>
                      <p class="text-secondary mb-1">Administrador</p>
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
            <div class="col-md-8">
              <div class="card mb-3">
                <div class="card-body">
                    <h6 class="mb-0" style="text-align: center">VER ACTIVIDADES</h6>
                    <hr>
                    <c:forEach var="c" items="${clienteInfo}">
                        <label class="text-xl text-gray-600"><strong>Cliente:</strong> <span id="">${c.getRUT_EMPRESA()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Nombre:</strong> <span id="">${c.getEMPR_NOMBRE()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Telefono:</strong> <span id="">${c.getEMPR_TELEFONO()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Direccion:</strong> <span id="">${c.getEMPR_DIRECCION()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Correo:</strong> <span id="">${c.getEMPR_CORREO()}</span></label></br>
                    </c:forEach>
                    <c:forEach var="p" items="${personaInfo}">
                    <label class="text-xl text-gray-600"><strong>Run:</strong> <span id="">${p.getRUN()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Nombre Completo:</strong> <span id="">${p.getPER_P_NOMBRE()} ${p.getPER_S_NOMBRE()} ${p.getPER_P_APELLIDO()} ${p.getPER_S_APELLIDO()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Telefono:</strong> <span id="">${p.getPER_TELEFONO()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Direccion:</strong> <span id="">${p.getDIRECCION()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Correo:</strong> <span id="">${p.getPER_CORREO()}</span></label></br>
                    <label class="text-xl text-gray-600"><strong>Fecha nacimiento:</strong> <span id="">${p.getPER_FECHA_NAC()}</span></label></br>
                    </c:forEach>
                    <hr>
                    <!--<button class="btn btn-success" id="anadir">Ver</button>-->
                    <!--<button class="btn btn-success" id="anadir">Guardar</button>-->
                </div>
                  <script src="JS/scriptChk.js" type="text/javascript"></script>
              </div>
                
            <div class="card mb-3">
                <div class="card-body">
                    <table id="contact-table" class="table is-fullwidth is-striped">
                        <tr>
                          <th>Actividades</th>  
                          <th></th> 
                          <th></th>
                        </tr>
                        <!--  CLIENTE -->
                        <c:forEach var="c" items="${clienteInfo}">
                            <tr>
                                <td>Capacitaciones</td>
                                <td></td>
                                <td><a class="btn btn-success" href="servletAdmin?accion=listarCapacitacionCliente&idc=${c.getRUT_EMPRESA()}">Ver Capacitaciones</a></td>
                            </tr>
                            <tr>
                                <td>Visitas</td>
                                <td></td>
                                <td><a class="btn btn-success" href="servletAdmin?accion=listarVisitasCliente&idc=${c.getRUT_EMPRESA()}">Ver Visitas</a></td>
                            </tr>
                            <tr>
                                <td>Asesorias</td>
                                <td></td>
                                <td><a class="btn btn-success" href="servletAdmin?accion=listarAsesoriaCliente&idc=${c.getRUT_EMPRESA()}">Ver Asesorias</a></td>
                            </tr>
                        </c:forEach>
                        <!--  PROFESIONAL -->
                        <c:forEach var="p" items="${personaInfo}">
                            <tr>
                                <td>Capacitaciones</td>
                                <td></td>
                                <td><a class="btn btn-success" href="servletAdmin?accion=listarCapacitacionProf&idc=${p.getRUN()}">Ver Capacitaciones</a></td>
                            </tr>
                            <tr>
                                <td>Visitas</td>
                                <td></td>
                                <td><a class="btn btn-success" href="servletAdmin?accion=listarVisitasProf&idc=${p.getRUN()}">Ver Visitas</a></td>
                            </tr>
                            <tr>
                                <td>Asesorias</td>
                                <td></td>
                                <td><a class="btn btn-success" href="servletAdmin?accion=listarAsesoriaProf&idc=${p.getRUN()}">Ver Asesorias</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
              </div>

              



            </div>
          </div>

        </div>
    </div>


    <!--BODY FOOTER-->
    <%@include file="footer.jsp" %>
</body>

</html>