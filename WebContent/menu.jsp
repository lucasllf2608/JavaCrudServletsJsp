<%@page import="java.io.OutputStream"%>
<%@page import="java.beans.Beans"%>
<%@page import="br.com.agenda.dao.ContatoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.agenda.util.ConexaoMySql"%>
<%@page import="br.com.agenda.dao.Contato"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="js/js.js"></script>
	<title>Menu</title>
	</head>
	<body>
	
		<button onclick="acessarCadastro()">Novo</button>
		<hr>
	
	
	<jsp:useBean id="contatos" class="br.com.agenda.controller.ContatoController"></jsp:useBean>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Nome</td>
			<td>Email</td>
			<td>Telefone</td>
			<td colspan="2">opcao</td>
		</tr> 
		<c:forEach var="contato" items="${contatos.listarContatos()}">
		<tr>
			<td>${contato.id}</td>
			<td>${contato.nome}</td>
			<td>${contato.email}</td>
			<td>${contato.telefone}</td>
			<td><a href="ContatoController?opcao=editar&id=<c:out value="${contato.id}"></c:out>&nome=<c:out value="${contato.nome} "></c:out>&email=<c:out value="${contato.email} "></c:out>&telefone=<c:out value="${contato.telefone}"></c:out>">editar</a></td>
			<td><a href="ContatoController?opcao=excluir&id=<c:out value="${contato.id}"></c:out>">excluir</a></td>
		</tr>
		</c:forEach>
	</table>	
	</body>
</html>