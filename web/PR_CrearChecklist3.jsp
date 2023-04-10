<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--DEFAULT INFO-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profesional - Checklist</title>
    
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
                    <form action="servletChecklist" method="POST">
                    <h6 class="mb-0" style="text-align: center">Crear CHECKLIST</h6>
                    <input hidden="true" type="text" style="width: 86%" class="" name="idvisi" id="idvisi" value="${idVisita}" required>
                    <hr>
                    <label class="text-xl text-gray-600">Observacion 1:<span id=""></span></label></br>
                    <input type="text" style="width: 86%" class="border-2 border-gray-300 p-1 w-full" name="obs1" id="obs1" value="" required>
                    <label class="text-xl text-gray-600">Mejora 1:<span id=""></span></label>
                    <textarea placeholder="" id="mej1" name="mej1" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                    <hr>
                    <label class="text-xl text-gray-600">Observacion 2:<span id=""></span></label></br>
                    <input type="text" style="width: 86%" class="border-2 border-gray-300 p-1 w-full" name="obs2" id="obs2" value="" >
                    <label class="text-xl text-gray-600">Mejora 2:<span id=""></span></label>
                    <textarea placeholder="" id="mej2" name="mej2" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                    <hr>
                    <label class="text-xl text-gray-600">Observacion 3:<span id=""></span></label></br>
                    <input type="text" style="width: 86%" class="border-2 border-gray-300 p-1 w-full" name="obs3" id="obs3" value="" >
                    <label class="text-xl text-gray-600">Mejora 3:<span id=""></span></label>
                    <textarea placeholder="" id="mej3" name="mej3" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                    <hr>
                    <label class="text-xl text-gray-600">Observacion 4:<span id=""></span></label></br>
                    <input type="text" style="width: 86%" class="border-2 border-gray-300 p-1 w-full" name="obs4" id="obs4" value="" >
                    <label class="text-xl text-gray-600">Mejora 4:<span id=""></span></label>
                    <textarea placeholder="" id="mej4" name="mej4" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                    <hr>
                    <label class="text-xl text-gray-600">Observacion 5:<span id=""></span></label></br>
                    <input type="text" style="width: 86%" class="border-2 border-gray-300 p-1 w-full" name="obs5" id="obs5" value="" >
                    <label class="text-xl text-gray-600">Mejora 5:<span id=""></span></label>
                    <textarea placeholder="" id="mej5" name="mej5" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                    <hr>
                    <label class="text-xl text-gray-600">Observacion 6:<span id=""></span></label></br>
                    <input type="text" style="width: 86%" class="border-2 border-gray-300 p-1 w-full" name="obs6" id="obs6" value="" >
                    <label class="text-xl text-gray-600">Mejora 6:<span id=""></span></label>
                    <textarea placeholder="" id="mej6" name="mej6" style="width: 100%" class="p-3 focus:outline-1 focus:outline-blue-500 font-bold border-[0.1px] resize-none h-[120px] border-[#9EA5B1] rounded-md w-[60vw]"></textarea>
                    <hr>
                    <span id="buscado"></span>
                    <hr>
                    <button type="submit" class="btn btn-success" id="guardarCheck" >Guardar Checklist</button>
                    </form>
                  
                </div>
                  <script src="JS/scriptChk.js" type="text/javascript"></script>
              </div>

              



            </div>
          </div>

        </div>
    </div>

    <!--BODY FOOTER-->
    <%@include file="footer.jsp" %>
</body>

</html>