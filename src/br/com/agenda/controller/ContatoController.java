package br.com.agenda.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.model.Contato;
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

		if (opcao.equals("editar")) {

			System.out.println(opcao);
			String id = request.getParameter("id");
			System.out.println(id);
			Contato contato = cs.consultarContatoPorId(id);
			System.out.println(contato.toString());
			request.setAttribute("id", id);
			request.setAttribute("opcao", "atualizar");
			request.setAttribute("contato", contato);
			direcionar = "cadastrarContato.jsp";

		} else if (opcao.equals("atualizar")) {

			Contato c = new Contato();
			String id = request.getParameter("id");
			System.out.println(id);
			c.setId(Integer.parseInt(request.getParameter("id")));
			c.setNome(request.getParameter("nome"));
			c.setEmail(request.getParameter("email"));
			c.setTelefone(request.getParameter("telefone"));
			System.out.println(toString());
			cs.atualizarContato(c);
			direcionar = "menu.jsp";

		} else if (opcao.equals("excluir")) {

			System.out.println("chegou para excluir");
			out.println(request.getParameter("id"));
			String id = request.getParameter("id");
			cs.excluirCadastro(id);

		} else {

			Contato c = new Contato();
			c.setNome(request.getParameter("nome"));
			c.setEmail(request.getParameter("email"));
			c.setTelefone(request.getParameter("telefone"));
			String dt_nasc = request.getParameter("dt_nasc");
			Calendar dataNascimento = null;
			
			
			try{
				
				Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dt_nasc);
				dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(data);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			c.setDt_nasc(dataNascimento);	
			cs.cadastraContato(c);
			System.out.println("Cadastrar");
			request.setAttribute("mensagem", "Salvo com sucesso");
			direcionar = "menu.jsp";

		}

		RequestDispatcher view = request.getRequestDispatcher(direcionar);
		view.forward(request, response);

	}

	public static ArrayList<Contato> listarContatos() {
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
