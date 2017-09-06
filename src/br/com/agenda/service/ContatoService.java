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
	
	
	public void cadastraContato(Contato contato){
		
		dao.cadastraContato(contato);
		 
	}
	
	
	public void excluirCadastro(String id){
		
		System.out.println("chegou no service");
		dao.excluirCadastro(Integer.parseInt(id));
	}

}
