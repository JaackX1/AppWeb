<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profesional - ResponderChecklist</title>
    
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
                    <h6 class="mb-0" style="text-align: center">ASIGNAR CHECKLIST</h6>
                    <hr>
                    <label class="text-xl text-gray-600">Cliente: <span id="buscarCR">${rut_empr}</span></label></br>

                    <hr>
                    <!--<button class="btn btn-success" id="anadir">Ver</button>-->
                    <!--<button class="btn btn-success" id="anadir">Guardar</button>-->
                </div>
                  <script src="JS/scriptChk.js" type="text/javascript"></script>
              </div>
                
            <div class="card mb-3">
                <div class="card-body">
                    <form method="POST" action="servletResp">
                    <c:forEach var="ch" items="${checklist}">
                    <div class="row">
                       
                      <div class="col-sm-1">
                          <input type="checkbox" name="chkResp" id="" value="1">
                          <input type="text" hidden="true" name="id_obs" id="id_obs" value="${ch.getId_obs()}">
                      </div>                      
                      <div class="col-sm-8">
                        <h6 class="mb-0">${ch.getObs1()}</h6>
                      </div>
                      <div class="col-sm-9 text-secondary">
                        ${ch.getMej1()}
                      </div>
                    </div>
                    <br>
                    <c:if test="${ch.getObs2() ne null}">
                    <div class="row">
                      <div class="col-sm-1">
                          <input type="checkbox" name="chkResp" id="" value="1">
                      </div>                      
                      <div class="col-sm-8">
                        <h6 class="mb-0">${ch.getObs2()}</h6>
                      </div>
                      <div class="col-sm-9 text-secondary">
                        ${ch.getMej2()}
                      </div>
                    </div><br></c:if>
                    
                    <c:if test="${ch.getObs3() ne null}">
                    <div class="row">
                      <div class="col-sm-1">
                          <input type="checkbox" name="chkResp" id="" value="1">
                      </div>                      
                      <div class="col-sm-8">
                        <h6 class="mb-0">${ch.getObs3()}</h6>
                      </div>
                      <div class="col-sm-9 text-secondary">
                        ${ch.getMej3()}
                      </div>
                    </div><br></c:if>
                    
                    <c:if test="${ch.getObs4() ne null}">
                    <div class="row">
                      <div class="col-sm-1">
                          <input type="checkbox" name="chkResp" id="" value="1">
                      </div>                      
                      <div class="col-sm-8">
                        <h6 class="mb-0">${ch.getObs4()}</h6>
                      </div>
                      <div class="col-sm-9 text-secondary">
                        ${ch.getMej4()}
                      </div>
                    </div><br></c:if>
                    
                    <c:if test="${ch.getObs5() ne null}">
                    <div class="row">
                      <div class="col-sm-1">
                          <input type="checkbox" name="chkResp" id="" value="1">
                      </div>                      
                      <div class="col-sm-8">
                        <h6 class="mb-0">${ch.getObs5()}</h6>
                      </div>
                      <div class="col-sm-9 text-secondary">
                        ${ch.getMej5()}
                      </div>
                    </div><br>
                    </c:if>
                    
                    <c:if test="${ch.getObs6() ne null}">
                        <div class="row">
                            <div class="col-sm-1">
                                <input type="checkbox" name="chkResp" id="" value="1">
                            </div>                      
                            <div class="col-sm-8">
                                <h6 class="mb-0">${ch.getObs6()}</h6>
                            </div>
                            <div class="col-sm-9 text-secondary">
                                ${ch.getMej6()}
                            </div>
                        </div>
                    </c:if>
                    <hr>
                    <input type="submit" class="btn btn-success" value="Guardar"></input>
                    </c:forEach>
                    </form>
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