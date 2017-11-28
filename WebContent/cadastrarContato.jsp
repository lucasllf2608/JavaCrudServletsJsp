<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/css.css" type="text/css"rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/js.js"></script>
<title>CRUD::Agenda</title>


<style type="text/css">

input[type=text]:focus {
    background-color: lightgray;
}

input[type=email]:focus {
    background-color: lightgray;
}

</style>

</head>
<body>

<div>
	<form method="post" action="ContatoController">
		<fieldset>
			<legend>Dados Contato:</legend>
		<input type="hidden" name="opcao" id="opcao"  value="<c:out value="${opcao}"/>">
		<input type="hidden" name="id" id="id"  value="<c:out value="${id}"/>">
			<div>
				<label>Nome:</label></br>
				<input type="text" name="nome" id="nome" value="<c:out value="${contato.nome}"/>" required>
			</div>
			</br>
			<div>
				<label>Email:</label> </br>
				<input type="email" name="email" id="email" value="<c:out value="${contato.email}"/>" required/>
			</div>
			</br>
			<div>
				<label>Telefone:</label> </br>
				<input type="text" name="telefone" id="telefone" value="<c:out value="${contato.telefone}"/>"  onkeyup="maskTelefone( this, mtel );" maxlength="15"  required /> 
			</div>
			</br>
					<button type="submit" class="btn btn-primary"><c:out value="${opcao != null ? 'Atualizar ': 'Cadastrar '}"></c:out><i class="fa fa-plus-circle"></i> </button>
					

	<button id="cancelar" onclick="voltarMenu()">voltar <i class="fa fa-reply"></i></button>
	</fieldset>		
	</form>
</div>	
	</br>		
	

</body>
</html>