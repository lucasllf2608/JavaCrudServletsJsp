<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/css.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/js.js"></script>
<title>CRUD::Agenda</title>
</head>
<body>




	<form method="post" action="ContatoController">
		<input type="hidden" name="opcao" id="opcao"  value="<c:out value="${opcao}"/>">
		<input type="hidden" name="id" id="id"  value="<c:out value="${id}"/>">
			<div>
				<label>Nome:    </label>
				<input type="text" name="nome" id="nome" value="<c:out value="${contato.nome}"/>" required>
			</div>
			<div>
				<label>Email:</label> 
				<input type="email" name="email" id="email" value="<c:out value="${contato.email}"/>" required/>
			</div>
			<div>
				<label>Telefone:</label> 
				<input type="text" name="telefone" id="telefone" value="<c:out value="${contato.telefone}"/>" required /> 
			</div>
			</br>
			</br> 
			</br> 
	<button type="submit" class="btn btn-primary">Cadastrar  <i class="fa fa-plus-circle"></i> </button>		
	</form>
	
	<button id="cancelar" onclick="voltarMenu()">voltar <i class="fa fa-reply"></i></button>
	</br>		
	

</body>
</html>