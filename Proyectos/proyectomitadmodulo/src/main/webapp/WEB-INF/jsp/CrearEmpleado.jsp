<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Empleado</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Notable&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">

</head>
<body>
<div class="container text-center">
		<h1>Agregar Empleado</h1>
		<div class="container col-8">
		<form:form method="post" action="AgregarEmpleado">
			<div class="form-group">
			<label>Nombre Empleado: </label><br />
			<form:input type="text" path="nombre" class="col-8"/><br />
			</div>
			<div class="form-group">
			<label>Especialidad Empleado: </label><br />
			<form:input type="text" path="especialidad" class="col-8"/><br /> 
			</div><br /> 
			<input type="submit" value="Agregar Empleado" class="btn btn-success"/><br /> <br /> 
			<a href="ListadoEmpleados" class="btn btn-primary">Listar Empleados</a><br /> 
		</form:form>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>
	
</body>
</html>