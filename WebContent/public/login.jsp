<%@ include file="header.jsp" %>
<%@ page import="connexion.UserBean" %>

<form action="/tp1/public/login" method="post">
Utilisateur : <input type="text" id="utilisateur" name="utilisateur"></input></br></br>
Mot de passe : <input type="password" id="pwd" name="pwd"></input></br></br>
<input type="submit"></input>
</form>

<%@ include file="footer.jsp" %>