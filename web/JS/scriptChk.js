//tomar elementos

var inputTarea = document.getElementById("NameChk");
var btn = document.getElementById("anadir");
var listado = document.getElementById("listado");
var cantidad = document.getElementById("cantidadchk");

var total = 0;
var maxx = 5;

//funcion agregar al listado
btn.onclick = function(){
    if (inputTarea.value == ""){
        return;
    }

    
    var elemento = inputTarea.value;
    
    var li = document.createElement("li");
    li.textContent = elemento;
    
    listado.appendChild(li);
    
    total++;
    cantidad.innerHTML = total;
    

    
    var btnEliminar = document.createElement("spanQuit");
    btnEliminar.textContent = "\u00d7";
    li.appendChild(btnEliminar);
    
    btnEliminar.onclick = function (){
        li.remove();
        total--;
        cantidad.innerHTML = total;
    }
    inputTarea.value = "";
    
}



