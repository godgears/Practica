<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
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
		<div class="row">
		<div class="container col-10">
		<form:form method="post" action="/proyectomitadmodulo/GuardarEditarCliente">
			<div class="form-group">
			<form:hidden path="id_cliente" class="col-8"/><br /><br />
			</div>
			<label>Nombre: </label><br />
			<div class="form-group">
			<form:input type="text" path="nombre" class="col-8"/><br />
			</div>
			<div class="form-group">
			<label>Telefono: </label><br />
			<form:input type="number" path="telefono" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Correo electrónico: </label><br />
			<form:input type="text" path="correoelectronico" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Rubro: </label><br />
			<form:input type="text" path="rubro" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Dirección: </label><br />
			<form:input type="text" path="direccion" class="col-8"/><br /> 
			</div>
			<div class="form-group">
			<label>Cantidad Trabajadores: </label><br />
			<form:input type="number" path="cantidadtrabajadores" class="col-8"/><br /> 
			</div>
			<input type="submit" value="Guardar Cambios" class="btn btn-success"/>
			<a href="ListadoClientes.jsp" class="btn btn-primary">Listado Clientes</a>
			
		</form:form>
		</div>
	</div>
	</div>
</body>
</html>