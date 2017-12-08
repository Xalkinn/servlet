package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/private/logout")
public class Logout extends GenericTpServlet {
	private static final long serialVersionUID = 1L;

	public Logout() {
	}

	
	protected void process (HttpServletRequest req, HttpServletResponse res )throws ServletException, IOException {
		req.getSession().invalidate();
		res.sendRedirect("../public/login.jsp");
	}
}
