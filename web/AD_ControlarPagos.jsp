<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin - Pagos</title>
    
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
                  <h6 class="mb-0" style="text-align: center">CONTROLAR PAGOS DE CLIENTES</h6>
                  <hr>
                  <div class="row">
                    <div class="col-sm-8">
                        <label for="Search">Empresa</label>
                        <input type="nombre" class="form-control" id="InputNombre" aria-describedby="NombreInput" placeholder="Escriba el nombre de empresa">
                  </div>
                    </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                        <button class="btn btn-success">Buscar</button>
                    </div>
                  </div>
                  
                  <hr>
                  <!--<button class="btn btn-success">Guardar</button>-->
                </div>
              </div>

                <div class="card mb-3">
                <div class="card-body">

                    <div class="container">
                    <div class="row">
                      <div class="col">
                        Rut
                      </div>
                      <div class="col">
                        Empresa
                      </div>
                      <div class="col">
                        Estado
                      </div>
                      <div class="col">
                        Fecha Pago
                      </div>  
                      <div class="col">
                        
                      </div>
                      
                    </div>
                        <hr>
                    <div class="row">
                      <div class="col">
                        205582150
                      </div>
                      <div class="col">
                        StarLink
                      </div>
                      <div class="col">
                        Pendiente
                      </div>
                      <div class="col">
                        30/9/2022
                      </div>
                      <div class="col">
                        <a class="btn btn-success" href="AD_ControlarPagos2.jsp">Revisar</a>
                      </div>                        
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