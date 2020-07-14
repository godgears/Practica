<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Asesorias</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Notable&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">


</head>
<body>
<div class="container">
<table class="table">
	<tr>
		<th>Id Asesoria</th>
		<th>Detalle</th>
		<th>Gestión</th>
		<th>Propuestas</th>
		<th>Fecha</th>
		<th>Especial</th>
		<th>Id visita</th>
	</tr>
<c:forEach items="${listadoasesoria}" var="asesoria">
	<tr>
		<td class="table-light" scope="row">${asesoria.getIdasesoria()}</td>
		<td class="table-light">${asesoria.getDetalle()}</td>
		<td class="table-light">${asesoria.getGestion()}</td>
		<td class="table-light" >${asesoria.getPropuestas()}</td>
		<td class="table-light">${asesoria.getFecha()}</td>
		<td class="table-light">${asesoria.getEspecial()}</td>
		<td class="table-light">${asesoria.getVisitaid()}</td>
	</tr>
	</c:forEach>
</table>
<a title="Agregar Asesoria a Cliente" href="${pageContext.request.contextPath}/AgregarAsesoria" class="btn btn-info"><i class="fas fa-plus-square"></i></a>&nbsp;
<a title="Ir a inicio" href="${pageContext.request.contextPath}/index.jsp" class="btn btn-info"><i class="fas fa-home"></i></a>&nbsp;
</div>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>

</body>
</html>

