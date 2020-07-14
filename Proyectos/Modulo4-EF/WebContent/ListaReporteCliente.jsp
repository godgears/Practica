<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/all.min.js" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container text-center">
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

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
		<th>Accion</th>
		
	</tr>
	<c:forEach items="${listareportev}" var="visita">
	<tr>
		<td class="table-light" scope="row">${visita.getIdvisita()}</td>
		<td class="table-light">${visita.getDireccion()}</td>
		<td class="table-light">${visita.getCiudad()}</td>
		<td class="table-light">${visita.getFecha()}</td>
		<td class="table-light">${visita.getResumen()}</td>
		<td class="table-light">${visita.getObservaciones()}</td>
		<td class="table-light">${visita.getClienteid()}</td>
		<td class="table-light">${visita.getEmpleadoid()}</td>
		<td class="table-light">
			<form method="post">
			<input type="hidden" name="idc" value="${visita.getClienteid()}">
			<input type="hidden" name="idv" value="${visita.getIdvisita()}">
			<input class="btn btn-success" type="submit" value="Mostrar Capacitaciones">
			</form>
		</td>
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
		<td class="table-light" scope="row">${capacitacion.getIdcapacitacion()}</td>
		<td class="table-light">${capacitacion.getFecha()}</td>
		<td class="table-light">${capacitacion.getHora()}</td>
		<td class="table-light">${capacitacion.getNumasistentes()}</td>
		<td class="table-light">${capacitacion.getIdvisita()}</td>
	</tr>
	</c:forEach>
	
</table>
<br/>
<a href="${pageContext.request.contextPath}/ListadoClientes" class="btn btn-primary"><i class="fas fa-sync-alt"></i></a>
</div>
</body>
</html>