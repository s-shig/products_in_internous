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

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
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

		boolean isLogin = (user!=null && id.equals(user.getUserid()));
		HttpSession session = request.getSession();
		session.setAttribute("isLogin", isLogin);

		if (id == "" || password == "") {
			request.setAttribute("error", "入力されていない項目があります");
			request.getRequestDispatcher("/regist.jsp").forward(request, response);
		} else if(id.length() < 6){
			request.setAttribute("error", "IDは６文字以上に設定してください");
			request.getRequestDispatcher("/regist.jsp").forward(request, response);
		}else if(isLogin){
			request.setAttribute("error", "同じIDのユーザが既に登録されています。");
			request.getRequestDispatcher("/regist.jsp").forward(request, response);
		} else  {
			dao.regUser(id, password);
			request.getRequestDispatcher("/registSuccess.jsp").forward(request, response);
		}

	}

}
