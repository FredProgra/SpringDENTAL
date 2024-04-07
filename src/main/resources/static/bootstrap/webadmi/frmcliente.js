$(document).on( "click","#btnnuevo" ,function() {
$(".alert-primary").hide().html("");
$("#txtcodigo").val(0);
$("#txtnombre").val("");
$("#txtapellido").val("");
$("#txtedad").val("");
$("#txttelefono").val("");
$("#modalregistro").modal("show");
});

$(document).on("click","#btnregistrar",function(){
             $.ajax({
                          type:"POST",
                          contentType:"application/json",
                          url: "/admin/cliente/registrar",

                          data:JSON.stringify({
                               cod:$("#txtcodigo").val(),
                               nom:$("#txtnombre").val(),
                               apell:$("#txtapellido").val(),
                               edad:$("#txtedad").val(),
                               tele:$("#txttelefono").val()
                          }),
                          success: function(resultado)
                            {

                              alert(resultado.mensaje);
                              $("#modalregistro").modal("hide");

                            }

             });

});

$(document).on("click","#btnactualizar",function(){
$("#modalregistro").modal("show");
$("#txtnombre").val($(this).attr("data-nombre"));
$("#txtapellido").val($(this).attr("data-apellido"));
$("#txtedad").val($(this).attr("data-edad"));
$("#txttelefono").val($(this).attr("data-tele"));
});

$(document).on("click","#btneliminar",function(){

$("#txtcod").val($(this).attr("data-id"));
$("#txtnom").val($(this).attr("data-nombre"));
$("#txtapell").val($(this).attr("data-apellido"));
$("#modaleliminar").modal("show");
});


$(document).on("click","#btnelimina",function(){
$.ajax({
  type:"DELETE",
  contentType:"application/json",
  url: "/admin/cliente/eliminar",
  data:JSON.stringify( {
    cod:$("#txtcod").val()

  }),
  success: function(resultado) {
    alert(resultado.mensaje);
  }
});

});





