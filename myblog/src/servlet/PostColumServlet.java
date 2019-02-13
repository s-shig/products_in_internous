package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BlogDao;

@WebServlet("/PostColumServlet")
public class PostColumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/postcolum.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String colum = request.getParameter("colum");
		colum = colum.replaceAll("\n","<BR>");

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");

		BlogDao dao = new BlogDao();
	    dao.PostColum(id,colum);


		request.getRequestDispatcher("/postcollumcomp.jsp").forward(request, response);
	}

}
