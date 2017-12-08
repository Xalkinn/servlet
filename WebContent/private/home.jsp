<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<%@page import="biblio.Book"%>
<%@page import="biblio.Library"%>
<%@page import="connexion.UserBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TP JSP</title>
</head>
<body>
	<h1>
		<center>Tableau de livre</center>
	</h1>
	
	<% UserBean utilisateur = (UserBean) request.getSession().getAttribute("USER"); %>
	
	<h2><%= "L'utilisateur " + utilisateur.getLogin() + " est connecte depuis le " + utilisateur.getLoginDate() %></h2></br>
	
	<center>
	<%  Library lib = Library.getInstance();
		List<Book> livres = lib.getAll();  
		%>
		<table border="1px">
			<tr> <!-- Ligne 1 -->
				<th>ID</th> <!-- Contenu colonne 1 -->
				<th>Titre</th> <!-- Contenu colonne 2 -->
				<th>Nombre de pages</th>
			</tr>
			<% for (Book b : livres){
			%>
			<tr> <!-- Ligne généré en fonction du nombre de ligne -->
				<td> <a href="./bookdetail.jsp?id=<%= b.getId() %>" ><%= b.getId() %></a></td>
				<td><%= b.getTitle() %></td>
				<td><%= b.getNbPages() %></td>
			</tr>
			<% } %>

		</table>
	</center>
</body>
</html>