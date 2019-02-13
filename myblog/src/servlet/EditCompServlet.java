package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BlogDao;

@WebServlet("/EditCompServlet")
public class EditCompServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String afcolum = request.getParameter("afcolum");

		HttpSession session = request.getSession();
		int columNo = (int) session.getAttribute("columNo");

		BlogDao dao = new BlogDao();
		dao.EditComp(afcolum,columNo);

		request.getRequestDispatcher("/editComp.jsp").forward(request, response);
	}

}
