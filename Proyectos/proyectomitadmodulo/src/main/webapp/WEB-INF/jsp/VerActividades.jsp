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
<title>Ver Actividades</title>
</head>
<body>
<div class="container text-center">
<table class="table">
	<tr>
		<th>Fecha</th>
		<th>Dirección</th>
		<th>Ciudad</th>
		<th>Resumen</th>		
		<th>Observaciones</th>
	</tr>
	<c:forEach items="${listadovisitas}" var="visita">
	<tr>
	<td class="table-light" scope="row">${visita.getFecha()}</td>
	<td class="table-light">${visita.getDireccion()}</td>
	<td class="table-light">${visita.getCiudad()}</td>
	<td class="table-light">${visita.getResumen()}</td>
	<td class="table-light">${visita.getObservaciones()}</td>
	</tr>
	</c:forEach>
</table>

<a title="Ir a inicio" href="<%=request.getContextPath()%>/index.jsp" class="btn btn-info"><i class="fas fa-home"></i></a>&nbsp;

</div>


<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>

</body>
</html>