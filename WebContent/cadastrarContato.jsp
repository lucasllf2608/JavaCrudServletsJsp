<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/css.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/js.js"></script>
<title>CRUD::Agenda</title>
</head>
<body>
teste

	<form method="post" action="ContatoController">
		<input type="hidden" value="cadastrar" name="opcao" id="opcao" />
		<label>Nome:</label>
		<input type="text" name="nome" id="nome" value="<c:out value="${contato.nome}"/>">
		<label>Email:</label> 
		<input type="email" name="email" id="email" value=""/> 
		<label>Telefone:</label> 
		<input type="text" name="telefone" id="telefone" value="" /> 
		</br> 
		<input type="submit" value="Cadastrar">
	</form>
	</br>		
	<button onclick="voltarMenu()">voltar</button>

</body>
</html>