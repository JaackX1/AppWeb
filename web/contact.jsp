<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contacto</title>
    
    <!--ESTILO CSS-->
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
    <script src="../JS/glightbox.min.js" type="text/javascript"></script>
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
            <div class="col-md-8">
              <div class="card mb-3">
                <div class="card-body">
                    <h6 class="mb-0" style="text-align: center">CONTACTO</h6>
                    <hr>
                    <label class="text-xl text-gray-600">Nombre <span class="text-danger-500">*</span></label></br>
                    <input type="text" style="width: 50%" class="border-2 border-gray-300 p-2 w-full" name="title" id="title" value="" required>
                    <hr>
                    <label class="text-xl text-gray-600">Correo <span class="text-danger-500">*</span></label></br>
                    <input type="text" style="width: 50%" class="border-2 border-gray-300 p-2 w-full" name="title" id="title" value="" required>
                    <hr>
                    <label class="text-xl text-gray-600">Mensaje</label></br>
                    <textarea placeholder="" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                        
                  <button class="btn btn-success">Enviar Mensaje</button>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-3">
                <div class="card-body">
                    <h6 class="mb-0" style="text-align: center">INFORMACION NUESTRA</h6>
                    <hr>
                    <label class="text-xl text-gray-600"><strong>Nuestro Telefono </strong><span class="text-danger-500"></span></label></br>
                    <label class="text-xl text-gray-600">(+56) 9 8833 1122</label></br>
                    <hr>
                    <label class="text-xl text-gray-600"><strong>Nuestro Correo </strong><span class="text-danger-500"></span></label></br>
                    <label class="text-xl text-gray-600">nma@gmail.com</label></br>
                    <hr>
                    <label class="text-xl text-gray-600"><strong>Direccion</strong></label></br>                    
                    <label class="text-xl text-gray-600">av.los mariachis 1921</label></br>
                    <hr>
                    <img src="images/Logo_PNG.png" alt="" class="rounded-circle" width="86">
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