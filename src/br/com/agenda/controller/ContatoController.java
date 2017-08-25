package br.com.agenda.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
		
		Contato c = new Contato();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		
		c.setEmail(nome);
		c.setNome(nome);
		c.setTelefone(telefone);
		
		out.print(c.toString());
		

		if (opcao {
			
//			
//			c.setNome(request.getParameter("nome"));
//			c.setEmail(request.getParameter("email"));
//			c.setTelefone(request.getParameter("telefone"));
			cs.cadastraContato(c);

			System.out.println("Cadastrar");



		} else if (opcao == 3) {
			
			out.println("excluir");
			System.out.println("Excluir");


		} else {
			
			System.out.println("Editar");
		}

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
