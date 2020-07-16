<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Notable&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">

</head>
<body>
<div class="container text-center">
<h1>Datos Visitas</h1>
<table class="table">
	<tr>
		<th>ID visita</th>
		<th>Dirección</th>
		<th>Ciudad</th>
		<th>Fecha</th>
		<th>Resumen</th>
		<th>Observaciones</th>
		<th>ID Cliente</th>
		<th>ID Empleado</th>
		
	</tr>
	<c:forEach items="${listareportev}" var="visita">
	<tr>
		<td class="table-light" scope="row">${visita.getId_visita()}</td>
		<td class="table-light">${visita.getDireccion()}</td>
		<td class="table-light">${visita.getCiudad()}</td>
		<td class="table-light">${visita.getFecha()}</td>
		<td class="table-light">${visita.getResumen()}</td>
		<td class="table-light">${visita.getObservaciones()}</td>
		<td class="table-light">${visita.getCliente_id_cliente()}</td>
		<td class="table-light">${visita.getEmpleado_id_empleado()}</td>
	</tr>
	</c:forEach>
	
</table>
<h1>Datos Capacitaciones</h1>
<table class="table">
	<tr>
		<th>ID capacitacion</th>
		<th>fecha</th>
		<th>hora</th>
		<th>asistentes</th>
		<th>visita id</th>
	</tr>
	<c:forEach items="${listareportec}" var="capacitacion">
	<tr>
		<td class="table-light" scope="row">${capacitacion.getId_capacitacion()}</td>
		<td class="table-light">${capacitacion.getFecha()}</td>
		<td class="table-light">${capacitacion.getHora()}</td>
		<td class="table-light">${capacitacion.getNumasistentes()}</td>
		<td class="table-light">${capacitacion.getVisitas_id_visita()}</td>
	</tr>
	</c:forEach>

</table>
<a href="index.jsp" class="btn btn-success"><i class="fas fa-home"></i></a>
</div>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>

</body>
</html>