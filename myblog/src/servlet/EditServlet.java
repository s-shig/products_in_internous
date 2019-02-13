package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String bfcolum = request.getParameter("bfcolum");
		int no = Integer.parseInt(request.getParameter("no"));

		HttpSession session = request.getSession();
		session.setAttribute("bfcolum",bfcolum);


		    session.setAttribute("columNo",no);


	    request.getRequestDispatcher("/edit.jsp").forward(request, response);
	}

}
