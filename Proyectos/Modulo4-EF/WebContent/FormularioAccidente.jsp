<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Registro de accidente</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Notable&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">

</head>
<body>



<div class="container text-center">
		<h1>Formulario Registro de accidente</h1>
		<div class="container col-8">
		<form method="post" action="ProcesarAccidente">
			<div class="form-group">
			<label>Id Cliente: </label><br />
			<input type="text" name="txtidcliente" class="col-8"/><br />
			</div>
			<div class="form-group">
			<label>Fecha Accidente: </label><br />
			<input type="number" name="date" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Hora Accidente: </label><br />
			<input type="text" name="hora" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Lugar: </label><br />
			<input type="text" name="txtLugar" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Descripción del accidente: </label><br />
			<textarea name="suceso" cols="50" rows="5"></textarea>
			</div>
			<div class="form-group">
			<label>cantiadadt: </label><br />
			<input type="number" name="cantidadtra" class="col-8"/><br /> 
			</div><br>
			<input type="submit" value="Agregar cliente" class="btn btn-success"/>
			<br><br>
			<a href="${pageContext.request.contextPath}/ListarAccidente" class="btn btn-primary">Listar accidente</a>
		</form>
		</div>
		
</div>
	
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>
	
</body>
</html>