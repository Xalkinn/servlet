package filtre;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName="filter", urlPatterns = {"/private/*"})
public class filter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		if (((HttpServletRequest) req).getSession().getAttribute("connecte") != null) {
			chain.doFilter(req, res);
		}
		else {
			((HttpServletResponse) res).sendRedirect("../public/login.jsp");
		}
	}
	
	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

    

}
