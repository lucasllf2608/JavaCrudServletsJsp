package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import br.com.agenda.util.ConexaoMySql;

public class ContatoDao {

	public static java.sql.Connection conexao() {

		Connection connetion;
		return connetion = ConexaoMySql.getConexao();
	}

	public void cadastraContato(Contato contato) {
		conexao();

		try {
			String sql = "insert into contato (nome, email, telefone) values (?,?,?)";
			java.sql.PreparedStatement stmt = conexao().prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getTelefone());
			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<Contato> listarContatos() {

		ArrayList<Contato> contato = new ArrayList<>();

		conexao();

		try {

			String sql = "SELECT * FROM  contato";

			java.sql.PreparedStatement stmt = conexao().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				contato.add(c);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return contato;

	}

	public void excluirCadastro(int id) {

		conexao();

		try {

			String sql = "delete from contato where id = ?";
			java.sql.PreparedStatement stmt = conexao().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
			conexao().close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Contato consultarContatoPorId(String id) {

		conexao();

		Contato contato = new Contato();
		try {

			String sql = "select * from contato where id =?";
			java.sql.PreparedStatement stmt = conexao().prepareStatement(sql);
			stmt.setInt(0, Integer.parseInt(id));
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				if (rs.getInt("id") == Integer.parseInt(id)) {
					contato.setId(rs.getInt("id"));
					contato.setNome(rs.getString("nome"));
					contato.setEmail(rs.getString("email"));
					contato.setTelefone(rs.getString("telefone"));
					System.out.println("Pessoa encontrada...");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return contato;

	}

}
