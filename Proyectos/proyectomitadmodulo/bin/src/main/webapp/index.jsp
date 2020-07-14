<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Notable&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<style>
header{
height: 180px;
padding: 130px;
text-align: center;
font-family: 'Notable', sans-serif;
font-size: 300%;
color: white;
background-image: url("http://www.segval.cl/wp-content/uploads/2014/05/grunge_warning_industrial_plants_danger_stripes_1366x768_21139.jpg");
}

</style>
</head>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <a class="navbar-brand" href="index">Inicio</a>
      <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="ListadoClientes">Informacion Clientes</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="ListadoEmpleados">Informacion Profesionales</a>
        </li>
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
            Reportes
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <li><a class="dropdown-item" href="ListaReporteGeneral">Reporte General</a></li>
          </ul>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="ListarAsesoria">Asesoria Especial</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="ListarAccidente">Accidentes</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<header>
<p>AntiAccidentes S.A</p>
<h6>Expertos en la seguridad de tu empresa</h6>
</header>
<br/>

<body>

<div class="container">
  <div class="row">
    <div class="col-sm text-center">
     <img class="img-thumbnail" src="http://www.haleco.es/wp-content/uploads/2014/07/PAC_STG11_21A-250x250.jpeg"><br>
	<a class="text-center btn btn-dark btn-lg" href="/ListadoClientes" role="button">Actividades</a>

    </div>
    <div class="col-sm text-center">
     	<img class="img-thumbnail" src="http://www.haleco.es/wp-content/uploads/2014/07/PAC_STG14_24A-250x250.jpeg" ><br>
		<a class="btn btn-dark btn-lg" href="/FormularioAccidente.jsp" role="button">Ingresar Accidente</a>
    </div>
    <div class="col-sm text-center">
     	<img class="img-thumbnail" src="http://www.haleco.es/wp-content/uploads/2014/07/PAC_STG10_20A-250x250.jpeg" ><br>
		<a class="btn btn-dark btn-lg" href="/ListadoPagosClientes" role="button">Pagos</a>
    </div>
      <div class="col-sm text-center">
		<a href="welcome.html">Click here to See Welcome Message... </a>		
    </div>
  </div>
 </div>
 </br>
 </br>
</body>
<footer class="py-5 bg-dark">
  	 <!-- Footer Elements -->
  <div class="container">

    <!-- Grid row-->
    <div class="row">

      <!-- Grid column -->
      <div class="col-md-12 py-5 text-center">
        <div class="mb-5 flex-center">

          <!-- Facebook -->
          <a class="fb-ic">
            <i class="fab fa-facebook-f fa-lg  mr-md-5 mr-3 fa-2x"> </i>
          </a>
          <!-- Twitter -->
          <a class="tw-ic">
            <i class="fab fa-twitter fa-lg  mr-md-5 mr-3 fa-2x"> </i>
          </a>
          <!-- Google +-->
          <a class="gplus-ic">
            <i class="fab fa-google-plus-g fa-lg  mr-md-5 mr-3 fa-2x"> </i>
          </a>
          <!--Linkedin -->
          <a class="li-ic">
            <i class="fab fa-linkedin-in fa-lg  mr-md-5 mr-3 fa-2x"> </i>
          </a>
          <!--Instagram-->
          <a class="ins-ic">
            <i class="fab fa-instagram fa-lg mr-md-5 mr-3 fa-2x"> </i>
          </a>
          <!--Pinterest-->
          <a class="pin-ic">
            <i class="fab fa-pinterest fa-lg  fa-2x"> </i>
          </a>
        </div>
      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row-->
 	<p class="m-0 text-center text-white">Copyright &copy; asesorias.com 2019</p>
  </div>
    <!-- /.container -->
  </footer>



<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script></body>
</html>