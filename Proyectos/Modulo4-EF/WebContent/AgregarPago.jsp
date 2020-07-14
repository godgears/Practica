<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<title>Agregar Pagos</title>
</head>
<body>
<div class="container">
	<h1>Agregar Pago</h1>
	<c:if test="${ccmensaje != null}">
		<h3>
			<c:out value="${ccmensaje}"></c:out>
		</h3>
	</c:if>
	<div class="container col-8">
		<form method="post" action="AgregarPago">
			<div class="form-group">
				<label>Mes Año:</label> <br />
				<input type="text" name="mesanio" class="col-8"/><br />
			</div>
			<div class="form-group">
				<label>Monto Regular: </label><br />
				<input type="number" name="montor" class="col-8"/><br />
			</div>
			<div class="form-group">
				<label>Monto Adicional:</label> <br />
				<input type="number" name="montoa" class="col-8"/><br />
			</div>
			<div class="form-group">
				<label>id cliente:</label> <br />
				<input type="number" name="idclie" class="col-8"/><br />
			</div>
			<input type="submit" value="Guardar Cambios" class=" btn btn-success"/>
			<a href="${pageContext.request.contextPath}/ListadoPagosClientes" class="btn btn-primary">Listar Pagos</a>
		</form>
	</div>
	
</div>
</body>
</html>