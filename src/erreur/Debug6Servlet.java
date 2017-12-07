package erreur;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/debug6")
public class Debug6Servlet extends HttpServlet {

	private static final long serialVersionUID = 7312605307252317220L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		String dateStr = formatter.format(date);
		String str = "Hello world !!!" +  dateStr;
		System.out.println(str);
	}

}
