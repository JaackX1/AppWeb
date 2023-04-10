<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profesional - Perfil</title>
    
    <!--ESTILOS CSS-->
    <link href="CSS/pPro.css" rel="stylesheet" type="text/css"/>
    
    <!--BOOTSTRAP-->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>
  
    <!--ESTILO CSS-->
    <link href="CSS/StyleP.css" rel="stylesheet" type="text/css"/>
    <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

    <!--ESTILO WEB-->
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
    <hr style="margin: 55px auto;", color="ffffff">

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
                      <c:forEach var="p" items="${cuentaActiva}">
                      <h4>${p.getPER_P_NOMBRE()} ${p.getPER_P_APELLIDO()}</h4>
                      </c:forEach>
                      <p class="text-secondary mb-1">Profesional</p>
                      <button class="btn btn-success">Editar</button>
                      <a class="btn btn-outline-danger" href="servletLogin">Logout</a>
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
                  <h6 class="mb-0" style="text-align: center">MI INFORMACION</h6>
                  <hr>
                  <c:forEach var="p" items="${cuentaActiva}">
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Rut</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${p.getRUN()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nombre Completo</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${p.getPER_P_NOMBRE()} ${p.getPER_S_NOMBRE()} ${p.getPER_P_APELLIDO()} ${p.getPER_S_APELLIDO()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Email</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${p.getPER_CORREO()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Telefono</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      (56) ${p.getPER_TELEFONO()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Direccion</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${p.getDIRECCION()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Fecha Nacimiento</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${p.getPER_FECHA_NAC()}
                    </div>
                  </div>
                  </c:forEach>
                  <hr>
                  <!--<button class="btn btn-success">Guardar</button>-->
                </div>
              </div>

              <div class="row gutters-sm">
                <div class="col-sm-6 mb-3">
                  <div class="card mb-3">
                    <div class="card-body">
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Revisar Cliente</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-success " target="" href="servletProf?accion=revisarCliente">Ingresar</a>
                        </div>
                      </div>
                      <hr>
                      <!--
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Crear Caso de asesoria</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-secondary " target="" href="">Ingresar</a>
                        </div>
                      </div>
                      <hr>
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Ingresar asesoria</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-secondary " target="" href="">Ingresar</a>
                        </div>
                      </div>
                      <hr>-->
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Planificar visita</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-success " target="" href="servletProf?accion=Planificar">Ingresar</a>
                        </div>
                      </div>
                      <hr>
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Actualizar seguimiento</h6>
                        </div>
                          <div class="col-sm-1 text-secondary"><c:forEach var="p" items="${cuentaActiva}">
                          <a class="btn btn-success " target="" href="servletProf?accion=ActualizarSeguimiento&idc=${p.getRUN()}">Ingresar</a>
                        </div></c:forEach>
                      </div>
                      <hr>
                      <!--
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Ingresar actividad de mejora</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-secondary " target="" href="">Ingresar</a>
                        </div>
                      </div>
                      <hr>-->
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 mb-3">
                  <div class="card mb-3">
                    <div class="card-body">
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Responder Checklist</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-success " target="" href="servletProf?accion=ResponderChecklist">Ingresar</a>
                        </div>
                      </div>
                      <hr>
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Ver Actividades</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-success " target="" href="servletProf?accion=VerActividades">Ingresar</a>
                        </div>
                      </div>
                      <hr>
                      <!--<div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Revisar actividad de mejora</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                          <a class="btn btn-secondary " target="" href="">Ingresar</a>
                        </div>
                      </div>
                      <hr>-->
                      <div class="row">
                        <div class="col-sm-7">
                          <h6 class="mb-0">Crear Checklist</h6>
                        </div>
                        <div class="col-sm-1 text-secondary">
                            <a class="btn btn-success " target="" href="servletProf?accion=CrearChecklist">Ingresar</a>
                        </div>
                      </div>
                      <hr>
                    </div>
                  </div>
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