<%@page import="br.com.agenda.dao.ContatoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.agenda.util.ConexaoMySql"%>
<%@page import="br.com.agenda.dao.Contato"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>

<a href="cadastrarContato.jsp">Novo</a>
	<hr>



	<%
		ConexaoMySql.getConexao();

		out.println(ConexaoMySql.getStatusConexao());

		ArrayList<Contato> contato = ContatoDao.listar();

		out.println(contato.size());
		
	
		for(Contato contatos : contato){
		
			%>
			
			<table>
				<tr>
					<td>Nome</td>
					<td>Email</td>
					<td>Telefone</td>
				</tr>
				<tr>
					<td><% out.println(contatos.getNome()); %></td>
				</tr>
			</table>
			
			<%
			
		}
	%>




</body>
</html>