
<%@page import="java.beans.Beans"%>
<%@page import="br.com.agenda.dao.ContatoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.agenda.util.ConexaoMySql"%>
<%@page import="br.com.agenda.model.Contato"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="js/js.js"></script>
	<link href="css/css.css" type="text/css"rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Menu</title>
	<style type="text/css">
	
menu{
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #00aaa6;
}

li {
	font-family: verdana;
	font-size: 13px;
    float: left;
    border-right:1px solid #bbb;
}

li:last-child {
    border-right: none;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #D3D3D3;
}

.active {
    background-color: #4CAF50;
}
	
tr:nth-child(even) {
	background-color: #f2f2f2;
}
	
	
#novo{
float: right;
}	
	</style>
	
	</head>
	<body>
	<div id="topo">	
		<c:import url="menu.jsp"></c:import>
	<div>
	<div id="corpo">
		<button id="novo" onclick="acessarCadastro()">Novo <i class="fa fa-user-plus"></i></button>
	
		<jsp:useBean id="contatos" class="br.com.agenda.controller.ContatoController"></jsp:useBean>
			<table>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Telefone</th>
					<th>Data de Nascimento</th>
					<th colspan="2">Op&ccedil;&atilde;o</th>
				</tr> 
				<c:forEach var="contato" items="${contatos.listarContatos()}">
				<tr>
					<td>${contato.id}</td>
					<td>${contato.nome}</td>
					<td>
						<c:if test="${not empty contato.email}">
							<a href='mailto:${contato.email}'>${contato.email}</a>	
						</c:if>
						<c:if test="${empty contato.email}">
							E-mail não informado
						</c:if>
					</td>
					<td>${contato.telefone}</td>
					<td> <fmt:formatDate value="${contato.dt_nasc.time}" pattern="dd/MM/yyyy"/></td>
					<td><a href="ContatoController?opcao=editar&id=<c:out value="${contato.id}"></c:out>"><i class="fa fa-pencil-square-o" style="font-size:24px"></i></a></td>
					<td><a href="ContatoController?opcao=excluir&id=<c:out value="${contato.id}"></c:out>"><i class="fa fa-trash-o" style="font-size:24px" alt="teste"></i></a></td>
				</tr>
				</c:forEach>
			</table>	
	</div>
	</body>
</html>