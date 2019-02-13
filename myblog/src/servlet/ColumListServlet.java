package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BlogDao;

@WebServlet("/ColumListServlet")
public class ColumListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String id= (String) session.getAttribute("id");

		BlogDao dao = new BlogDao();
	    ArrayList<String> list = dao.getBlogList(id);
	    ArrayList<Integer> nolist = dao.getNo(id);



	    request.setAttribute("list", list);
	    request.setAttribute("nolist", nolist);
	    request.getRequestDispatcher("/columlist.jsp").forward(request, response);

	}

}
