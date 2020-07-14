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
</head>
<body>
	<div class="container">
		<h1>Listado de Pagos por Cliente</h1>
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
			<c:forEach items="${listapago}" var="pago">
				<tr>
					<td>${pago.getIdpago()}</td>
					<td>${pago.getMesanio()}</td>
					<td>${pago.getMontoregular()}</td>
					<td>${pago.getMontoadicionales()}</td>
					<td>${pago.getClienteid()}</td>
					
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="${pageContext.request.contextPath}/AgregarPago" class="btn btn-success">Agregar
			Pago</a> <a href="${pageContext.request.contextPath}/ListadoClientes" class="btn btn-primary">Listado
			Clientes</a>
	</div>
</body>
</html>