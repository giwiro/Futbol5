
$.post( "/CanchasDisponibles", { fecha: "John", time: "hora" })
  .done(function( data ) {
    alert( "Data Loaded: " + data );
  });