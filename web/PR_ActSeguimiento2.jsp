<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin - Seguimiento</title>
    
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
            <div class="col-md-8">
              <div class="card mb-3">
                <div class="card-body">
                    <h6 class="mb-0" style="text-align: center">ACTUALIZAR SEGUIMIENTO</h6>
                    <hr>
                    <c:forEach var="v" items="${visita}">
                        <label class="text-xl text-gray-600"><strong>Id visita:</strong> <span id="">${v.getId()}</span></label></br>
                        <label class="text-xl text-gray-600"><strong>Nombre:</strong> <span id="">${v.getNombre()}</span></label></br>
                        <label class="text-xl text-gray-600"><strong>Descripcion:</strong> <span id="">${v.getDescripcion()}</span></label></br>
                        <label class="text-xl text-gray-600"><strong>Fecha de inicio:</strong> <span id="">${v.getFecha_ini()}</span></label></br>
                        <c:if test="${estadoCheck==1}"><label class="text-xl text-gray-600"><strong>Estado actual:</strong> <span id="">En preparacion de tecnico</span></label></br></c:if>
                        <c:if test="${estadoCheck==2}"><label class="text-xl text-gray-600"><strong>Estado actual:</strong> <span id="">En camino a la empresa</span></label></br></c:if>
                        <c:if test="${estadoCheck==3}"><label class="text-xl text-gray-600"><strong>Estado actual:</strong> <span id="">En progreso</span></label></br></c:if>
                        <c:if test="${estadoCheck==4}"><label class="text-xl text-gray-600"><strong>Estado actual:</strong> <span id="">Finalizado</span></label></br></c:if>
                    </c:forEach>
                </div>
                  <script src="JS/scriptChk.js" type="text/javascript"></script>
              </div>
                
            <div class="card mb-3">
                <div class="card-body">
                    <!--  COMBOBOX CON FORM  -->
                    <c:if test="${estadoCheck!=null}">
                        <form action="servletUpdateSeg" method="POST">
                            <!--Info para buscar visita-->
                            <c:forEach var="v" items="${visita}">
                                <input hidden="" type="text" id="id_visita" name="id_visita" value="${v.getId()}" />
                                <input hidden="" type="text" id="id_estadoActual" name="id_estadoActual" value="${v.getId_estado()}" />
                            </c:forEach>
                            <!-- Select para hacer update-->
                            <select name="selectEstado" id="selectEstado">
                                <option value="1" <c:if test="${estadoCheck==1}"><% {out.print("selected");}%></c:if>>En preparacion de tecnico</option>
                                <option value="2" <c:if test="${estadoCheck==2}"><% {out.print("selected");}%></c:if>>En camino a la empresa</option>
                                <option value="3" <c:if test="${estadoCheck==3}"><% {out.print("selected");}%></c:if>>En progreso</option>
                                <option value="4" <c:if test="${estadoCheck==4}"><% {out.print("selected");}%></c:if>>Finalizado</option>
                            </select>
                            <br>
                            <input type="submit" class="btn btn-success" value="Guardar"></input>
                        </form>
                    </c:if>
                    <c:if test="${msj!=null}">
                        <div class="alert alert-succes"><strong>${msj}</strong></div>
                    </c:if>
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