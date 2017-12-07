package erreur;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/debug4")
public class Debug4Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getOutputStream().println("<!DOCTYPE html>");
		resp.getOutputStream().println("<html>");
		resp.getOutputStream().println("	<head>");
		resp.getOutputStream().println("		<meta charset=\"ISO-8859-1\">");
		resp.getOutputStream().println("		<title>Test</title>");
		resp.getOutputStream().println("	</head>");
		resp.getOutputStream().println("	<body style=\"background-color: white;\">");
		resp.getOutputStream().println("		<form id=\"myform\" action=\"servlet/hello2\" method=\"post\"></form>");
		resp.getOutputStream().println("		<button id=\"myBtn\">Submit</button>");
		resp.getOutputStream().println("	</body>");
		resp.getOutputStream().println("	<script>");
		resp.getOutputStream().println("	function myFunction() {");
		resp.getOutputStream().println("		document.getElementById(\"myform\").submit();");
		resp.getOutputStream().println("	}");
		resp.getOutputStream().println("	document.getElementById(\"myBtn\").addEventListener(\"click\", myFunction);");
		resp.getOutputStream().println("	</script>");
		resp.getOutputStream().println("</html>");
	}


}
