<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Landing</title>
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

        <div class="noticia-mes"></div>

        <div class="noticia-calendar">
          <div id="calendar"></div>
        </div>


        <div id="noticias" class="row">
          <div class="noticia-wrap col-md-4">
            <img src="http://thedailyshift.ie/wp-content/uploads/2014/01/1280423555-stadium-05.jpg" alt="" class="img-circle img-thumbnail img-noticia">
            <article>
              <h3>Impactante noticia</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequatur similique, beatae. Consequatur sapiente optio excepturi accusamus nulla nemo, cum voluptatibus, explicabo debitis maiores natus iure harum repellat tempora? Voluptatibus, hic.</p>
              <button class="btn btn-info pull-right">Leer más ...</button>
            </article>
          </div>
          <div class="noticia-wrap col-md-4">
            <img src="http://2.bp.blogspot.com/_1kNf5YsCl7I/TDX-MmTsgWI/AAAAAAAACgk/l5tOjjVdTF0/s1600/Howard+Webb+5.jpg" alt="" class="img-circle img-thumbnail img-noticia">
            <article>
              <h3>Impactante noticia2</h3>
              <p>Nam dolore, nihil rem earum, laborum ea dolores autem iste reiciendis, provident incidunt mollitia. Iste quis rem id cumque perferendis, debitis voluptates quos ab numquam. Minima quis non consectetur ipsa.</p>
              <button class="btn btn-info pull-right">Leer más ...</button>
            </article>
            
          </div>
          <div class="noticia-wrap col-md-4">
            <img src="http://www.footballaustralia.com.au/di/library/Football_Australia/2b/d3/ffa-have-confirmed-the-uniform-the-socceroos-will-wear-for-their-world-cup-campaign_pfvyauvzn4av1hfqf6nou4aau.jpg?t=-1825343594" alt="" class="img-circle img-thumbnail img-noticia">
            <article>
              <h3>Impactante noticia3</h3>
              <p>Deleniti id necessitatibus natus fugiat mollitia maxime est. Dolores doloremque, impedit dolor blanditiis aspernatur, obcaecati doloribus, recusandae cupiditate vitae quasi labore, dolore adipisci necessitatibus. Corporis quibusdam modi, alias dolores aliquid.</p>
              <button class="btn btn-info pull-right">Leer más ...</button>
            </article>
            
          </div>
        </div>

        <br>

        <jsp:include page="bottom.jsp" />


        <div id="unirse" class="modal fade">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Cerrar</span></button>
                <h4 class="modal-title">Llena el código de reserva</h4>
              </div>
              <form action="/UnirsePartido" method="post">
                <div class="modal-body">
                    <div class="modal-body">
                        <input class="form-control" type="text" name="nombrePartido" placeholder="Nombre del Partido" 
                  </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                  <input type="submit" class="btn btn-primary" value="Ir al partido">
                </div>
              </form>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


        <div id="fecha_hora" class="modal fade">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Cerrar</span></button>
                <h4 class="modal-title">Llena los datos</h4>
              </div>
              <form action="RegistroPartido" method="post">
                <div class="modal-body">
                    <div class="modal-body">
                        <input class="form-control" type="text" name="nombrePartido" placeholder="Nombre del Partido" required="required">
                        <br>
                        <select class="form-control" name="hora" required="required">
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
                        <br>
                        <input class="form-control" type="text" id="datepicker" name="fecha" placeholder="Ingresar Fecha" required="required">
                  </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                  <input type="submit" class="btn btn-primary" value="Crear Sala">
                </div>
              </form>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>

        <script src="static/js/vendor/bootstrap.min.js"></script>

        <script src="static/js/vendor/moment.js"></script>
        <script src="static/js/vendor/fullcalendar.min.js"></script>
        

        <script src="static/js/main.js"></script>

        <script>
          var options = {
            theme: true,
            header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
            },
            timeFormat: {
            agenda: 'h(:mm)t{ - h(:mm)t}',
            '': 'h(:mm)t{-h(:mm)t }'
            },
            monthNames: ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ], 
            monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun','Jul','Ago','Sep','Oct','Nov','Dic'],
            dayNames: [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
            dayNamesShort: ['Dom','Lun','Mar','Mié','Jue','Vie','Sáb'],
            buttonText: {
              today: 'hoy',
              month: 'mes',
              week: 'semana',
              day: 'día'
            }
          };

          var d;

    //$('#calendar').fullCalendar(options);

          $(document).ready(function() {

            $('#tooltip-karma').tooltip();
            
            $('#calendar').fullCalendar({
              header: {
                left: '',
                center: 'title,prev,next',
                right: ''
              },
              theme: true,
              eventAfterAllRender: function(){
                $(".fc-prev-button.ui-button.ui-state-default").html("<span class='glyphicon glyphicon-chevron-left'></span>")
                $(".fc-next-button.ui-button.ui-state-default").html("<span class='glyphicon glyphicon-chevron-right'></span>")
              },
              disableDragging: true,
              defaultDate: '2014-09-12',
              editable: false,
              eventLimit: true, // allow "more" link when too many events
              timeFormat: {
                agenda: 'h(:mm)t{ - h(:mm)t}',
                '': 'h(:mm)t{-h(:mm)t }'
              },
              monthNames: ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ], 
              monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun','Jul','Ago','Sep','Oct','Nov','Dic'],
              dayNames: [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
              dayNamesShort: ['Dom','Lun','Mar','Mié','Jue','Vie','Sáb'],
              buttonText: {
                today: 'hoy',
                month: 'mes',
                week: 'semana',
                day: 'día'
              },
              dayRender: function (date, cell) {
                  var today = new Date();
                  if (parseInt(date.format("D")) === today.getDate()) {
                    $("[data-date='"+ $(cell).data("date") +"']").css("font-size","2em");
                    /*d=cell;
                    console.log(cell);*/
                  }
              },
              events: [
                /*{
                  title: 'All Day Event',
                  start: '2014-09-01'
                },
                {
                  title: 'Long Event',
                  start: '2014-09-07',
                  end: '2014-09-10'
                },
                {
                  id: 999,
                  title: 'Repeating Event',
                  start: '2014-09-09T16:00:00'
                },
                {
                  id: 999,
                  title: 'Repeating Event',
                  start: '2014-09-16T16:00:00'
                },
                {
                  title: 'Conference',
                  start: '2014-09-11',
                  end: '2014-09-13'
                },
                {
                  title: 'Meeting',
                  start: '2014-09-12T10:30:00',
                  end: '2014-09-12T12:30:00'
                },
                {
                  title: 'Lunch',
                  start: '2014-09-12T12:00:00'
                },
                {
                  title: 'Meeting',
                  start: '2014-09-12T14:30:00'
                },
                {
                  title: 'Happy Hour',
                  start: '2014-09-12T17:30:00'
                },
                {
                  title: 'Dinner',
                  start: '2014-09-12T20:00:00'
                },
                {
                  title: 'Birthday Party',
                  start: '2014-09-13T07:00:00'
                },
                {
                  title: 'Click for Google',
                  url: 'http://google.com/',
                  start: '2014-09-28'
                }*/
              ]
            });
            
          });
        </script>

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

    </body>
</html>
