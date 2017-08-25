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

		String nome = request.getParameter("teste");
		String opcao = request.getParameter("opcao");

		if (opcao == "cadastrar") {
			
			out.println("hello world!");
			out.println(opcao);
			out.println(nome);
			out.println("Cadastrar");
			System.out.println("Cadastrar");



		} else if (opcao == "excluir") {
			
			out.println("hello world!");
			out.println(opcao);
			out.println(nome);
			out.println("excluir");
			System.out.println("Excluir");


		} else {
			
			out.println("hello world!");
			out.println(opcao);
			out.println(nome);
			out.println("Editar");
			System.out.println("Editar");
		}

		out.println("hello world!");
		out.println(opcao);
		out.println(nome);

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
