package br.com.tt.controller;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.tt.exception.ClienteException;
import br.com.tt.model.Cliente;
import br.com.tt.validate.ClienteValidate;

public class Sistema {

	public static void main(String[] args) {

		Set<Cliente> clientes = new HashSet<>();
		String nome = "";
		final JPanel panel = new JPanel();

		do {
			nome = JOptionPane.showInputDialog("Nome");
			if (!nome.equalsIgnoreCase("Sair")) {
				try {
					Cliente cliente = new Cliente(nome);
					new ClienteValidate().nome(cliente);
					clientes.add(cliente);
				} catch (ClienteException e) {
					JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(panel, "Falha no Sistema", "Error", JOptionPane.ERROR_MESSAGE);
				} finally {
					System.out.println("Passando sempre");
				}
			}
		} while (!nome.equalsIgnoreCase("Sair"));

		clientes.forEach(c -> System.out.println(c));
	}

}
