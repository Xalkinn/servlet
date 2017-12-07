package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/servlet/hello")
public class HelloServlet extends GenericTpServlet {
    
	private static final long serialVersionUID = -1802588302866417185L;

	@Override
    protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	res.getOutputStream().print("Hello get or post" + new java.util.Date());
	}
}
