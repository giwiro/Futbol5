<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js full"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="static/css/bootstrap.min.css">
        <link rel="stylesheet" href="static/css/main.css">

        <style>
          body {
            background: none;
          }
          .fail{
            display: none;
            margin: auto;
            margin-bottom: 10px;
            width: 81%
          }
        </style>

        <script src="static/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        <div class="login">
            <img src="static/img/logo.png" alt="">
            <br><br>

            

            <form action="LoginUser" method="post">
                <div class="fail alert alert-danger" role="alert" style="${fail}">
                    <b>¡ Usuario o Password incorrectos !</b>
                </div>
                <div class="group-input">
                    <span class="icon-glyph">
                        <span class="glyphicon glyphicon-user"></span>  
                        <div class="arrow-right"></div>
                    </span>
                    <input type="text" placeholder="Usuario" name="nickname">
                </div>

                <div class="group-input">
                    <span class="icon-glyph">
                        <span class="glyphicon glyphicon-lock"></span>  
                        <div class="arrow-right"></div>
                    </span>
                    <input type="password" placeholder="Contraseña" name="password">
                </div>
                   
                <button type="submit" class="login btn btn-lg- btn-block btn-primary text-login bold">INGRESAR</button>
            </form> 
            <a href="" class="text-login bold" data-toggle="modal" data-target="#modalResgitro">¿ NO ERES MIEMBRO AÚN ? REGÍSTRATE !</a>
            <br><br>
            <a href="" class="text-login" style="margin-top: 10px">Olvide mi contraseña</a>
            
            
            <div id="modalResgitro" class="modal fade">
                
                <div class="modal-dialog">
                  <div class="modal-content">

                    <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                      <h4 class="modal-title" id="myModalLabel" style="color: black">Registro</h4>
                    </div>
                    <form action="RegistroUser" method="post">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-4" style="border-right: solid 1px grey">
                                    imagten paja
                                </div>
                                <div class="col-md-8">
                                    <input class="form-control" type="text" name="dni" placeholder="dni" />
                                    <br>
                                    <input class="form-control" type="text" name="nombre" placeholder="nombre" />
                                    <br>
                                    <input class="form-control" type="text" name="apellido" placeholder="apellido" />
                                    <br>
                                    <input class="form-control" type="text" name="nickname" placeholder="nick" />
                                    <br>
                                    <input class="form-control" type="text" name="password" placeholder="password" />
                                    <br>
                                </div>
                            </div>
                            
                        <div class="modal-footer">
                          <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                          <input type="submit" class="btn btn-primary" value="Registrar" />
                        </div>
                    </form>

                  </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
              </div>
           


        </div>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.0.min.js"><\/script>')</script>

        <script src="static/js/vendor/bootstrap.min.js"></script>

        <script>
            ${failRegister}
        </script>

        <script src="static/js/main.js"></script>

        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <script>
            /*(function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
            e=o.createElement(i);r=o.getElementsByTagName(i)[0];
            e.src='//www.google-analytics.com/analytics.js';
            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
            ga('create','UA-XXXXX-X');ga('send','pageview');*/
        </script>
    </body>
</html>
