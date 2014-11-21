<div class="navbar navbar-default">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#"><img class="logo blanco" src="static/img/logoBlanco.png" alt=""></a>
  </div>
  <div class="navbar-collapse collapse navbar-responsive-collapse">
    <ul class="nav navbar-nav navbar-right">
      <li><a href="" onclick="$('#unirse').modal('show'); return false">Unirme a una sala</a></li>
      <li><a href="MisPartidos">Mis Partidos</a></li>
      <li><a href="" onclick="$('#fecha_hora').modal('show'); return false">Crear Sala</a></li>
      <li class="pad">
        <label for="Hola">Hola </label>
        <a href="#"><%= session.getAttribute( "Nombre" ) %></a>
        <span id="tooltip-karma" class="badge pull-right hidden-xs" style="margin-top:23px; cursor: default" data-toggle="tooltip" data-placement="bottom" title="Puntos de Karma"><%= session.getAttribute( "Karma" ) %></span>
        <span class="badge pull-right visible-xs" style="margin-top:9px"><%= session.getAttribute( "Karma" ) %></span>
      </li>
      <li><a href="Logout">Logout</a></li>
    </ul>
  </div>
</div>
