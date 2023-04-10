<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profesional - Visitas</title>
    
       
    
    <!--ESTILO CSS-->
    <link href="CSS/pPro.css" rel="stylesheet" type="text/css"/>
    <link href="CSS/calendario.css" rel="stylesheet" type="text/css"/>
  

    
    <!--ESTILO WEB-->
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">

    
    <!--CALENDARIO-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>

    <script src="JS/jquery.min.js" type="text/javascript"></script>
    <script src="JS/moment.min.js" type="text/javascript"></script>
    <script src="JS/moment.js" type="text/javascript"></script>

    <link href="CSS/fullcalendar.min.css" rel="stylesheet" type="text/css"/>
    <script src="JS/fullcalendar.min.js" type="text/javascript"></script>

    <script src="JS/es.js" type="text/javascript"></script>

    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>

    <script src="JS/calendario.js" type="text/javascript"></script>
    
    <!--ESTILO CSS-->
    <link href="CSS/StyleCalendario.css" rel="stylesheet" type="text/css"/> 
    <link href="CSS/glightbox.min.css" rel="stylesheet" type="text/css"/>

    
    
    
    <style>
        body {
          padding: 0;
          font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
          font-size: 14px;
        }

        #calendar {
          max-width: 700px;
          margin: 0 auto;
        }

    </style>
</head>

<body>
    
    <!--BODY NAVBAR-->
    <%@include file="navbar.jsp" %>
    <hr style="margin: 55px auto;", color="ffffff">
    
    <!--BODY CONTENIDO-->
    <div class="container">
    <div class="main-body">
          <div class="row gutters-sm">
            <div class="col-md-3 mb-3">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center">
                      <img src="images/user.png" alt="" class="rounded-circle" width="150">
                    <div class="mt-3">
                        <c:if test="${username!=null}">
                            <c:if test="${tipo==3}">
                                <h4>${usernameNPer} ${usernameAPer}</h4>
                            </c:if>
                        </c:if>
                      <p class="text-secondary mb-1">Profesional</p>
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
            <div class="col-md-9">
              <div class="card mb-3">
                <div class="card-body">
                    
                    
                    <h6 class="mb-0" style="text-align: center">CALENDARIO PARA AGENDAR VISITAS</h6>
                    <hr>
                    <main>
                        <div id='calendar'></div>
                    </main>
                    <hr>
                    <form id="" method="POST" action="servletJSON">
                        <input type="text" style="width: 100%" class="border-2 border-gray-300 p-2 w-full" name="sstart" id="sstart" value="" required hidden="">
                        <input type="text" style="width: 100%" class="border-2 border-gray-300 p-2 w-full" name="eend" id="eend" value="" required hidden="">
                        <label class="text-xl text-gray-600">Fecha Seleccionada <span class="text-red-500">*</span></label></br>
                        <input type="text" style="" class="txtInfoV border-2 border-gray-300 p-2 w-full" name="fechaSelect" id="fechaSelect" value="" required disabled="True">
                        <hr>
                        <label class="text-xl text-gray-600">Cliente <span class="text-red-500">*</span></label></br>
                        <input type="text" style="" class="txtInfoV border-2 border-gray-300 p-2 w-full" name="" id="" value="${rutCliente}" required disabled="True">
                        <textarea hidden="True" id="rutClient" name="rutClient">${rutCliente}</textarea>
                        <hr>
                        <label class="text-xl text-gray-600">Nombre <span class="text-red-500">*</span></label></br>
                        <input type="text" style="" class="txtInfoV border-2 border-gray-300 p-2 w-full" name="titlee" id="titlee" value="" required>
                        <hr>
                        <label class="text-xl text-gray-600">Descripcion <span class="text-red-500">*</span></label></br>
                        <textarea id="descripcionn" name="descripcionn" placeholder="" style="width: 100%" class="p-2 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]" required></textarea>
                        <hr>
                        <button class="btn btn-success">Solicitar</button>
                    </form>
                  
                </div>
              </div>

              



            </div>
          </div>

        </div>
    </div>

    
    
    <!-- Modal View -->
    <div class="modal fade" id="ModalView" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="">Visita</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
              <div><b>Nombre: </b><span id="tituloEvento"></span></div>
              <div><b>Descripcion: </b><span id="descripcionEvento"></span></div>
              <div><b>Fecha: </b><span id="fechaEvento"></span></div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Salir</button>
          </div>
        </div>
      </div>
    </div>
</body>

    <!--BODY FOOTER-->
    <%@include file="footer.jsp" %>

</html>