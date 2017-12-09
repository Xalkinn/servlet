<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="biblio.Book"%>
<%@page import="biblio.Library"%>
<%@page import="connexion.UserBean" %>
<%@include file="header.jsp" %>



	<h1>
		<center>Tableau de livre</center>
	</h1>
	
	<% UserBean utilisateur = (UserBean) request.getSession().getAttribute("USER"); %>
	
	<h2><%= "L'utilisateur " + utilisateur.getLogin() + " est connecte depuis le " + utilisateur.getLoginDate() %></h2>
	
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
<%@include file="footer.jsp"%>