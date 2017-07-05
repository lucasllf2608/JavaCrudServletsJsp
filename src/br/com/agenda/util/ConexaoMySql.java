package br.com.agenda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {

	public static String status = "Não conectou...";

	public ConexaoMySql() {

	}

	public static java.sql.Connection getConexao() {

		Connection connection = null;
		try {

			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);

			String serverName = "localhost";
			String dataBase = "crud";
			String url = "jdbc:mysql://"+serverName +"/"+dataBase;
			String usuario = "root";
			String password = "";
			connection = DriverManager.getConnection(url, usuario, password);

			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->Não foi possivel realizar conexão");

			}

			return connection;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException sql) {
			sql.printStackTrace();
			return null;
		}

	}

	public static String getStatusConexao() {
		return status;
	}

}
