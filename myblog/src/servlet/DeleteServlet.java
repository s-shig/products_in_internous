package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int no = Integer.parseInt(request.getParameter("no"));

		HttpSession session = request.getSession();
		session.setAttribute("no", no);

//		BlogDao dao = new BlogDao();
//		dao.DeleteComp(no);

//		request.getRequestDispatcher("/deleteComp.jsp").forward(request, response);
		request.getRequestDispatcher("/deleteConf.jsp").forward(request, response);
		}

}
