
<%@page import="java.beans.Beans"%>
<%@page import="br.com.agenda.dao.ContatoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.agenda.util.ConexaoMySql"%>
<%@page import="br.com.agenda.model.Contato"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="js/js.js"></script>
	<link href="css/css.css" type="text/css"rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Menu</title>
	<style type="text/css">
	
#menu{
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
	
	</style>
	
	</head>
	<body>
	
	 <div>
	     <h2><i class="fa fa-address-book-o" style="font-size:48px;color:#00aaa6"></i> Agenda de Contatos</h2>
	     <ul id="menu">
		   <li><a href="menu.jsp">Inicio</a></li>
		   <li><a href="contato.jsp">Contatos</a></li>
         </ul>
	</div>	
	<hr>	
	</body>
</html>