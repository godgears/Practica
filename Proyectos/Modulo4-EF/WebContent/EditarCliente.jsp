<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Editar cliente</h1>
		<c:if test="${ccmensaje != null}">
			<h3>
				<c:out value="${ccmensaje}"></c:out>
			</h3>
		</c:if>
		<div class"row">
		<div class="container col-10">
			<form method="post" action="EditarCliente">
				<div class="form-group">
					<label>Nombre: </label><br /> <input type="text" name="nombre"
						value="${regcli.getNombre()}" class="col-8" /><br />
				</div>
				<div class="form-group">
					<label>Telefono: </label><br /> <input type="number"
						name="telefono" value="${regcli.getTelefono()}" class="col-8" /><br />
				</div>
				<div class="form-group">
					<label>Correo electrónico: </label><br /> <input type="text"
						name="correo" value="${regcli.getCorreoelectronico()}"
						class="col-8" /><br />
				</div>
				<div class="form-group">
					<label>Rubro: </label><br /> <input type="text" name="rubro"
						value="${regcli.getRubro()}" class="col-8" /><br />
				</div>
				<div class="form-group">
					<label>Dirección: </label><br /> <input type="text"
						name="direccion" value="${regcli.getDireccion()}" class="col-8" /><br />
				</div>
				<div class="form-group">
					<label>cantidad trabajadores:</label> <br /> <input type="number"
						name="cantidadtrabajadores"
						value="${regcli.getCantidadtrabajadores()}" class="col-8" /><br />
				</div>
				<input type="hidden" name="idcliente"
					value="${regcli.getIdCliente()}" /> <input type="submit"
					value="Agregar cliente" value="${regcli.getNombre()}"
					class="btn btn-success" /> <a
					href="${pageContext.request.contextPath}/ListadoClientes"
					class="btn btn-primary">Listar cliente</a>
			</form>
		</div>
		</div>

	</div>
</body>
</html>