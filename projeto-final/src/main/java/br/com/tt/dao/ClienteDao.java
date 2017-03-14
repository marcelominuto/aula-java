package br.com.tt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.tt.jdbc.ConnectionFactory;
import br.com.tt.model.Cliente;

public class ClienteDao implements Dao<Cliente> {
	private static final String SQL_INSERT = "INSERT INTO CLIENTE (NOME, CNPJ_CPF) " + "VALUES (?, ?)";
	String SQL_SELECT_ALL = "SELECT * FROM CLIENTE";

	// CREATE TABLE cliente
	// (
	// id bigint NOT NULL,
	// nome character varying(255),
	// codigo character varying(255),
	// cnpj_cpf character varying(255),
	// CONSTRAINT ecliente_pkey PRIMARY KEY (id)
	// )

	@Override
	public void salvar(Cliente cliente) {
		System.out.println("Salvando Cliente " + cliente);
		try (Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);

			pstmt.setString(1, cliente.getNome());
			pstmt.setString(2, cliente.getCnpjCpf());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Cliente buscar(Long id) {
		return null;
	}

	@Override
	public Cliente buscar(Cliente t) {
		return null;
	}

	@Override
	public List<Cliente> consultar() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try (Connection conn = new ConnectionFactory().getConnection()) {
			Statement stmt = null;
			System.out.println("Iniciando um Statement");
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(SQL_SELECT_ALL);
			while (rs.next()) {
				Long id = rs.getLong("id");
				String nome = rs.getString("nome");
				String cnpjCpf = rs.getString("cnpj_cpf");
				Cliente cliente = new Cliente();
				cliente.setId(id);
				cliente.setNome(nome);
				cliente.setCnpjCpf(cnpjCpf);
				clientes.add(cliente);
				System.out.println("ID: " + id + "\tNome: " + nome + "\tCPF: " + cnpjCpf);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;
	}

	@Override
	public List<Cliente> consultar(Cliente t) {
		return null;
	}

	@Override
	public List<Cliente> consultar(List<Cliente> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(Cliente t) {
		// TODO Auto-generated method stub

	}

}
