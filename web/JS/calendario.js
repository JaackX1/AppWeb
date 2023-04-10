$(document).ready(function() {
    $('#calendar').fullCalendar({
        header: {
          left: 'prev,next today',
          center: 'title',
          right: 'month,agendaWeek,agendaDay'
        },
        navLinks: true, // can click day/week names to navigate views
        selectable: true,
        businessHours: true,
        selectHelper: true,
        select: function(startStr, end) {
          
          var title = confirm('¿Agregar nuevo evento?');
          var eventData;
          if (title) {
              
            let start1 = startStr.toString();
            let start2 = start1.substr(4,11);
            $('#sstart').val(startStr);
            $('#eend').val(end);
            $('#fechaSelect').val(start2);
            
            /*$("#exampleModal2").modal();
            $('#btnGuardar').click(function(){
                eventData = {
                    id:$('#InputId').val(),
                    title:$('#InputTitle').val(),
                    descripcion:$('#InputDescripcion').val(),
                    start: start,
                    end: end
                };
                $('#calendar').fullCalendar('renderEvent', eventData, true);
            });*/
          }
          $('#calendar').fullCalendar('unselect');
        },
        
        editable: false,
        eventLimit: true, // allow "more" link when too many events
        /*events:[{
            id:2,
            title: 'Long Event',
            descripcion:'guiatafak',
            start: '2022-10-07',
            end: '2022-10-09'
                
        }],*/
        //events:'http://localhost:8080/calendario/servletJson.java',
        //events:'/servletJson',
        events:'http://localhost:8080/AppWeb/servletJSON',



        eventClick: function(calEvent,jsEvent,view){
            $('#tituloEvento').html(calEvent.title);
            $('#descripcionEvento').html(calEvent.descripcion);
            $('#fechaEvento').html(calEvent.start);
            $('#ModalView').modal();
        }
    });

});


