package br.com.agenda.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.model.Contato;

public class ContatoService {

	static final ContatoDao dao = new ContatoDao();
	private static ArrayList<Contato> contato;

	public static ArrayList<Contato> listarContatos() {

		contato = new ArrayList<>();
		return contato = dao.listarContatos();
	}

	public void cadastraContato(Contato contato) {
		dao.cadastraContato(contato);
	}

	public void excluirCadastro(String id) {
		dao.excluirCadastro(Integer.parseInt(id));
	}

	public Contato consultarContatoPorId(String id) {

		Contato contato = dao.consultarContatoPorId(id);
		return contato;

	}

	public void atualizarContato(Contato contato) {
		dao.atualizarContato(contato);

	}
	
	
}
