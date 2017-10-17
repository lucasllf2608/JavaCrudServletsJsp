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
<style>
.loader {
  border: 16px solid #f3f3f3;
  border-radius: 50%;
  border-top: 16px solid #3498db;
  width: 120px;
  height: 120px;
  -webkit-animation: spin 2s linear infinite;
  animation: spin 2s linear infinite;
}

@-webkit-keyframes spin {
  0% { -webkit-transform: rotate(0deg); }
  100% { -webkit-transform: rotate(360deg); }
}

@keyframes spin {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}
</style>
</head>
<body>
<%//ConexaoMySql.getConexao();%>
<% //out.println(ConexaoMySql.getStatusConexao()); %>
<hr>


<div class="loader"></div>

<script type="text/javascript">
window.location = "menu.jsp";
</script>

teste
</body>
</html>