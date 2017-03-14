package br.com.tt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static final String DB_URL = "jdbc:mysql://localhost/aula";
	public static final String USER = "root";
	public static final String PASS = "";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, USER, PASS);
	}
}
