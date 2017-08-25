package br.com.agenda.service;

import java.util.ArrayList;

import br.com.agenda.dao.Contato;
import br.com.agenda.dao.ContatoDao;

public class ContatoService {

	static final ContatoDao dao = new ContatoDao();

	public static ArrayList<Contato> listarContatos() {
		
		ArrayList<Contato> contato = new ArrayList<>();
		return  contato = dao.listarContatos();
	}

}
