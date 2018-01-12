package br.com.agenda.model;

import java.util.Calendar;

public class Contato {

	private String nome;
	private String email;
	private String telefone;
	private int id;
	private Calendar dt_nasc;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome()+"-"+getEmail()+"-"+getTelefone();
	}

	public Calendar getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Calendar dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

}
