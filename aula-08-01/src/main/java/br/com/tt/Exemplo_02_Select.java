package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo_02_Select {

	private static final String URL = "jdbc:mysql://localhost/aula";
	private static final String USER = "root";
	private static final String PASS = "";

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection(URL, USER, PASS);

		String sql = "INSERT INTO CLIENTE";
		sql += " (nome, cnpj_cpf) values(?,?) ";

		PreparedStatement pst = c.prepareStatement(sql);
		pst.setString(1, "Carlos");
		pst.setString(2, "254148948");
		pst.execute();
		pst.close();
		c.close();
	}

}
