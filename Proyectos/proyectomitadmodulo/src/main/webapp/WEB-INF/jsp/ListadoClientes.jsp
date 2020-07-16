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
<div class="container">
<h1>Listado de clientes</h1>

<table class="table">
	<tr>
		<td>Nombre</td>
		<td>Telefono</td>
		<td>Correo electdónico</td>
		<td>Rubro</td>
		<td>Direccion</td>
		<td>Cantidad tdabajadores</td>
		<td>Acciones</td>
	</tr>
	<c:forEach items="${listaclientes}" var="cliente">
	<tr>
		<td class="table-light" scope="row">${cliente.getNombre()}</td>
		<td class="table-light">${cliente.getTelefono()}</td>
		<td class="table-light">${cliente.getCorreoelectronico()}</td>
		<td class="table-light">${cliente.getRubro()}</td>
		<td class="table-light">${cliente.getDireccion()}</td>
		<td class="table-light">${cliente.getCantidadtrabajadores()}</td>
		<td class="table-light" colspan="2">
			<a title="Eliminar Cliente" href="<%=request.getContextPath()%>/EliminarCliente/${cliente.getId_cliente()}" class="btn  btn-danger"><i class="fas fa-trash"></i></a>&nbsp;
			<a title="Editar Cliente" href="<%=request.getContextPath()%>/EditarCliente/${cliente.getId_cliente()}" class="btn btn-warning"><i class="fas fa-pencil-alt"></i></a>&nbsp;
			<a title="Ver Actividad Cliente" href="<%=request.getContextPath()%>/VerActividades/${cliente.getId_cliente()}" class="btn btn-info"><i class="fas fa-th-list"></i></a>&nbsp;
			<a title="Ver Ultimo Pago" href="<%=request.getContextPath()%>/UltimoPago/${cliente.getId_cliente()}" class="btn btn-info"><i class="fas fa-search-dollar"></i></a>
			<a title="Ver Reporte Cliente" href="ListadoReporteCliente/${cliente.getId_cliente()}" class="btn btn-info"><i class="fas fa-check"></i></a>&nbsp;
			<a title="Ver Listado Pagos Cliente" href="ListadoPagoCliente/${cliente.getId_cliente()}" class="btn btn-info"><i class="fas fa-dollar-sign"></i></a> <br>
		</td>
	</tr>
	</c:forEach>
</table>
<br/>
<a href="<%=request.getContextPath()%>/CrearCliente" class="btn btn-success"><i class="fas fa-user-plus"></i></a>
<a href="<%=request.getContextPath()%>/ListadoClientes" class="btn btn-primary"><i class="fas fa-sync-alt"></i></a>
<a title="Ver Listado Pagos Cliente" href="<%=request.getContextPath()%>/ListadoPago" class="btn btn-info"><i class="fas fa-dollar-sign"></i></a>
<a href="<%=request.getContextPath()%>/index.jsp" class="btn btn-success"><i class="fas fa-home"></i></a>
</div>
</body>
</html>