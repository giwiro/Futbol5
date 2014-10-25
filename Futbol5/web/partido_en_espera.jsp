<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="static/css/bootstrap.min.css">
        <link rel="stylesheet" href="static/css/flatly-theme.min.css">
        <link rel="stylesheet" href="static/css/main.css">

        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

        <style>
          .wrap-input{
            text-align: center;
            padding: 35px 10px;
            background: #EBEBEB;
          }
          .wrap-input input, .wrap-input select{
            text-align: left;
            margin: 0 10px;
            vertical-align: top;
            display: inline-block;
            border: solid 2px grey;
            border-radius: 5px;
            height: 30px;
            padding: 2px 0px 4px 7px;
          }
          .wrap-input button{
            margin: 0 10px;
            vertical-align: top;
            display: inline-block;
            margin-top: -7px;
          }
        </style>
  


        <script src="static/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

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
              <li><a href="#">Crear Sala</a></li>
              <li class="pad">
                <label for="Hola">Hola </label>
                <a href="#">giwiro</a>
                <span id="tooltip-karma" class="badge pull-right hidden-xs" style="margin-top:23px; cursor: default" data-toggle="tooltip" data-placement="bottom" title="Puntos de Karma">42</span>
                <span class="badge pull-right visible-xs" style="margin-top:9px">42</span>
              </li>
              <li><a href="#">Logout</a></li>
            </ul>
          </div>
        </div>
  
        <div class="row">
            <div class="wrap-input col-md-10 col-md-offset-1">
              <select name="" id="">
                <option value="7">7am - 8am</option>
                <option value="8">8am - 9am</option>
                <option value="9">9am - 10am</option>
                <option value="10">10am - 11am</option>
                <option value="11">11am - 12am</option>
                <option value="12">12am - 1pm</option>
                <option value="13">1pm - 2pm</option>
                <option value="14">2pm - 4pm</option>
                <option value="15">3pm - 5pm</option>
                <option value="16">4pm - 6pm</option>
                <option value="17">5pm - 6pm</option>
                <option value="18">6pm - 7pm</option>
                <option value="19">7pm - 8pm</option>
                <option value="20">8pm - 9pm</option>
                <option value="21">9pm - 10pm</option>
              </select>
              <input type="text" id="datepicker" placeholder="Ingresar Fecha">
              <button class="btn btn-default">Check</button>
            </div>
              
        </div>

        <div class="row">
          
        </div>

        <br>

        <div id="footer" class="footer">
          <img src="static/img/tw.png" class="SNicon img-thumbnail img-circle pull-right" style="margin-right: 20px;">
          <img src="static/img/fb.png" class="SNicon img-thumbnail img-circle pull-right">
          <div class="row" style="padding: 30px 0">
            <div class="col-md-3" style="text-align: center">
              <img src="static/img/logo.png" class="logo" width="220">
            </div>
            <div class="col-md-2">
              <h4><b>Sobre Nosotros</b></h4>
              <p>Somos un grupo de desarrolladores que aman las nuevas tecnologías</p>
              <!-- <dt>
                <dd>Holi</dd>
                <dd>Holi2</dd>
              </dt> -->
            </div>
            <div class="col-md-2">
              <h4><b>Contacto</b></h4>
              <div class="icon-wrap">
                <div class="icon">
                  <span class="glyphicon glyphicon-earphone"></span>
                </div>
                <label style="font-weight: normal !important"> 99995867</label>
              </div>
              <div class="icon-wrap">
                <div class="icon">
                  <span class="glyphicon glyphicon-envelope"></span>
                </div>
                <label style="font-weight: normal !important"> contacto@alengi.com</label>
              </div>
            </div>
          </div>

        </div>


        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
        
        <script>
          $.datepicker.regional['es'] = {
           closeText: 'Cerrar',
           prevText: '<Ant',
           nextText: 'Sig>',
           currentText: 'Hoy',
           monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
           monthNamesShort: ['Ene','Feb','Mar','Abr', 'May','Jun','Jul','Ago','Sep', 'Oct','Nov','Dic'],
           dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
           dayNamesShort: ['Dom','Lun','Mar','Mié','Juv','Vie','Sáb'],
           dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','Sá'],
           weekHeader: 'Sm',
           dateFormat: 'dd/mm/yy',
           firstDay: 1,
           isRTL: false,
           showMonthAfterYear: false,
           yearSuffix: ''
         };
         $.datepicker.setDefaults($.datepicker.regional['es']);

         $(function() {
          $( "#datepicker" ).datepicker({ minDate: 1 });
        });
        </script>

        <script src="static/js/vendor/bootstrap.min.js"></script>

        
    </body>
</html>
