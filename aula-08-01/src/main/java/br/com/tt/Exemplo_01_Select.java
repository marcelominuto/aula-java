package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Exemplo_01_Select {

	private static final String URL = "jdbc:mysql://localhost/aula";
	private static final String USER = "root";
	private static final String PASS = "";

	public static void main(String[] args) {
		try {

			Connection c = DriverManager.getConnection(URL, USER, PASS);
			Statement st = c.createStatement();
			
			String sql = "SELECT * FROM CLIENTE";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nome= rs.getString("nome");
				String cnpjCpf= rs.getString("cnpj_cpf");
				
				System.out.println(id + "-" + nome + "-" + cnpjCpf);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
