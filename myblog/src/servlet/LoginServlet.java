package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BlogDao;
import dto.BlogDto;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		BlogDao dao = new BlogDao();
		BlogDto user = dao.findUser(id);

		HttpSession session = request.getSession();
		session.setAttribute("id", id);

		boolean isLogin = (user != null && id.equals(user.getUserid()) && password.equals(user.getPassword()));
		session.setAttribute("isLogin", isLogin);



		if (isLogin) {
			request.getRequestDispatcher("/manage.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "IDかパスワードが間違っています。再入力してください。");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

}
