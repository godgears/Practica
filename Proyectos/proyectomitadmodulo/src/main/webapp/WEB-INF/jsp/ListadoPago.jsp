<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Pagos</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
</head>
<body>
	<div class="container">
		<h1>Listado de Pagos</h1>
		<c:if test="${ccmensaje != null}">
			<h3>
				<c:out value="${ccmensaje}"></c:out>
			</h3>
		</c:if>

		<table class="table">
			<tr>
				<th>Id Pago</th>
				<th>Mes Año</th>
				<th>Monto Regular</th>
				<th>Monto Adicional</th>
				<th>Id Cliente</th>
			</tr>
			<c:forEach var="pago" items="${list}">
			<tr>
				<td>${pago.id_pago}</td>
				<td>${pago.mesanio}</td>
				<td>${pago.montoregular}</td>
				<td>${pago.montoadicionales}</td>
				<td>${pago.cliente_id_cliente}</td>
			</tr>
			</c:forEach>
		</table>
		<br /> 
		<a href="AgregarPago" class="btn btn-success" role="button">Agregar Pago</a> 
		<a href="ListadoClientes" class="btn btn-primary" role="button">Listado Clientes</a>
		<a href="index.jsp" class="btn btn-success"><i class="fas fa-home"></i></a>
	</div>
</body>
</html>