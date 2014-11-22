<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Mis Partidos</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="static/css/bootstrap.min.css">
        <link rel="stylesheet" href="static/css/flatly-theme.min.css">
        <link rel="stylesheet" href="static/css/main.css">
        <link rel="stylesheet" href="static/css/fullcalendar.min.css">
        <link rel="stylesheet" href="static/css/fullcalendar.print.css" media="print">

        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">


        <script src="static/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <jsp:include page="top.jsp" />
        
        <img src="static/img/goal.jpg" class="img-responsive" style="width: 100%; opacity: 0.8">
        <div style="text-align: center; position: relative; z-index: 9999; margin-top: -160px; margin-bottom: 160px;">
          <h1 style="color: white; font-weight: bold; font-size: 3.5em; text-align: center;  display: inline-block; background: rgba(0,0,0,0.3); padding: 5px;">Mis Partidos</h1>
        </div>
        

        <div class="row">
          <div class="col-md-10 col-md-offset-1">

            <ul class="list-group">
              
            <c:forEach items="${lista}" var="item">
                <li class="list-group-item">
                    <h3 style="color: black"><a href="getPartido/${item.id}"><c:out value="${item.name}" /></a><span class="label label-default" style="margin-left: 10px;">${item.estado}</span></h3>
                    <strong style="display: inline-block; vertical-align: top">Hora: </strong><label for="">${item.hora}</label><br>  
                </li>             
            </c:forEach> 
                <!--
                <strong style="display: inline-block; vertical-align: top">Hora: </strong><label for="">10:40</label><br>
                <strong style="display: inline-block; vertical-align: top">Cancha: </strong><label for="">Av. Universitaria</label>-->
                
            </ul>

          </div>
        </div>

        <jsp:include page="bottom.jsp" />



        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>

        <script src="static/js/vendor/bootstrap.min.js"></script>

</html>
