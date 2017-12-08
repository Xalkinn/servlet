package servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connexion.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/public/login")
public class LoginServlet extends GenericTpServlet {
	
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserBean utilisateur;
		if ("pwd".equals(req.getParameter("pwd"))){
			utilisateur = new UserBean();
			utilisateur.setLogin(req.getParameter("utilisateur"));
			utilisateur.setLoginDate(new Date());
			
			req.getSession().setAttribute("USER", utilisateur);
			res.sendRedirect("../private/home.jsp");
		}
		else {
			//res.getOutputStream().println("Erreur. Authentification incorrect");
			res.sendRedirect("../public/login.jsp");
		}
	}
}
