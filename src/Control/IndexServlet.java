/*package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app")
public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = -4587622200104894945L;

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		if(request.getSession().getAttribute("user_metadata") == null)
			request.getRequestDispatcher("index.jsp").forward(request, response);
		else
			request.getRequestDispatcher("app.jsp").forward(request, response);
	}
	
}
*/