$(document).ready(function(){
   $('').submit(function(){
       $.ajax({
           url: 'update',
           type: 'POST',
           datatype: 'json',
           data: $('#updateUsername').serialize(),
           success: function(data){
               if(data.isValid){
                   $('#displayName').html('your name is: ' + data.username);
                   $('#displayName').slideDown(500);
               }
               else{
                   alert('please enter a valid username')
               }
           }
       });
       return false;
   }) ;
});

