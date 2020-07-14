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
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<table class="table">  
	<tr>
		<th>Id</th><th>Nombre</th><th>Teléfono</th><th>Correo Electrónico</th><th>Rubro</th><th>Dirección</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="cli" items="${list}">   
   <tr>  
	   <td>${cli.id_cliente}</td>  
	   <td>${cli.nombre}</td>  
	   <td>${cli.telefono}</td>  
	   <td>${cli.correoelectronico}</td>
	   <td>${cli.rubro}</td>  
	   <td>${cli.direccion}</td> 
	    <td>${cli.cantidadtrabajadores}</td> 
	   <td><a href="editcli/${cli.id_cliente}">Editar</a></td>  
	   <td><a href="deletecli/${cli.id_cliente}">Eliminar</a></td>  
   </tr>
   </c:forEach>  
  </table>  



<br/>
<a href="/AgregarCliente" class="btn btn-success"><i class="fas fa-user-plus"></i></a>
<a href="/ListadoClientes" class="btn btn-primary"><i class="fas fa-sync-alt"></i></a>
<a title="Ver Listado Pagos Cliente" href="/ListadoPagosClientes" class="btn btn-info"><i class="fas fa-dollar-sign"></i></a>
<a href="/index.jsp" class="btn btn-success"><i class="fas fa-home"></i></a>
</div>
</body>
</html>