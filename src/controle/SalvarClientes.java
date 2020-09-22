package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalvarClientes")
public class SalvarClientes extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String nome = request.getParameter("Nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");	
		
		response.sendRedirect("sucesso.jsp?Nome=" + nome + "&telefone=" + telefone + "&email=" + email);
			}

}
