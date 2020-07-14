<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Asesoria</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Notable&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
</head>
<body>
<div class="container text-center">
	<h1>Agregar Asesorias</h1>
	<c:if test="${aamensaje != null}">
	<h3><c:out value="${aamensaje}"></c:out></h3>
	</c:if>
	<div class="container col-8"">
	<form method="post" action="AgregarAsesoria">
		<div class="form-group">
    	<label class="form-label" >Detalle :</label><br />
    	<input type="text" name="detalle" /><br />
  		</div>
  	<div class="form-group">
    <label class="form-label">Gestion :</label><br />
    <input type="text" name="gestion" /><br />
  	</div>
  	<div class="form-group">
    <label class="form-label">Propuesta :</label><br />
    <input type="text" name="propuestas" /><br />
  	</div>
  	<div class="form-group">
    <label class="form-label">Fecha :</label><br />
    <input type="text" name="fecha" placeholder="02-2020 Utilizar este formato"/><br />
  	</div>
  	<div class="form-group">
    <label class="form-label">Especial :</label><br />
    <input type="text" name="especial" /><br />
  	</div>
  	<div class="form-group">
    <label class="form-label">Id Visita :</label><br />
    <input type="number" name="visitaid" /><br />
  	</div><br />
  	 <button type="submit" class="btn btn-primary mb-3">Agregar Asesoria</button>
	</form>
	</div>
	<a class="btn btn-primary mb-3" href="${pageContext.request.contextPath}/ListarAsesoria">Listar Asesorias</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>

</body>

</html>