package br.com.agenda.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.dao.Contato;
import br.com.agenda.service.ContatoService;

/**
 * Servlet implementation class ContatoController
 */
@WebServlet("/ContatoController")
public class ContatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final ContatoService cs = new ContatoService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContatoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String opcao = request.getParameter("opcao");
		String direcionar = "";
		

		

		if (opcao.equals("cadastrar")){
						
			Contato c = new Contato();
			c.setNome(request.getParameter("nome"));
			c.setEmail(request.getParameter("email"));
			c.setTelefone(request.getParameter("telefone"));
			cs.cadastraContato(c);

			out.print(c.toString());
			System.out.println("Cadastrar");
			direcionar = "menu.jsp";



		} else if (opcao.equals("excluir")) {
			
			System.out.println("chegou para excluir");
			out.println(request.getParameter("id"));
			String id = request.getParameter("id");
			cs.excluirCadastro(id);
//			System.out.println("Excluir");
//			direcionar = "menu.jsp";

		} else {
			
			System.out.println("Editar");
		}
		
		
		
		RequestDispatcher view = request.getRequestDispatcher(direcionar);
		view.forward(request, response);

	}
	
	
	public static ArrayList<Contato> listarContatos(){
		ArrayList<Contato> contato = new ArrayList<>();
		return contato = cs.listarContatos();
	} 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
