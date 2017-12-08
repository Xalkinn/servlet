<%@ include file="header.jsp" %>
<%@page import="java.util.List"%>
<%@ page import="biblio.Library"%>
<%@ page import="biblio.Book"%>



	<%  Library libb = Library.getInstance();
	Book b = libb.getById(Integer.parseInt(request.getParameter("id"))); %>
	<h1>
		Titre :
		<%= b.getTitle() %></h1>
	<h2>
		Nombre de pages :
		<%= b.getNbPages() %></h2>
	<h3>
		Mot clé :
		<%= b.getKeywords() %></h3>
	<%  String description = b.getDescription();
		if (description == null) { 
		 description = "pas de description";
		}
		%>
	<h4>
		Descripion : 
		<%= description %></h4>

		<%@ include file="footer.jsp" %>