<%@page import="br.com.agenda.util.ConexaoMySql"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"  src="js/js.js" ></script>
<link rel="stylesheet" type="text/css" href="css/css.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agenda</title>
</head>
<body>
<%ConexaoMySql.getConexao();%>
<% out.println(ConexaoMySql.getStatusConexao()); %>
<hr>
<script type="text/javascript">
window.location = "menu.jsp";
</script>


</body>
</html>