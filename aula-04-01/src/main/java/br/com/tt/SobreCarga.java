package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class SobreCarga {

	static List<String> nomes = new ArrayList<>();

	public static void main(String[] args) {
		String nome = "";
		nome = pesquisar("Ana");
		System.out.println("Nome: " + nome);
		nome = pesquisar(2);
		System.out.println("ID 2: " + nome);
		nome = pesquisar();
		System.out.println("Todos:" + nome);
		nome = pesquisar('n', 1);
		System.out.println("Nome: " + nome);
		nome = pesquisar(1, 'n');
		System.out.println("Nome: " + nome);
	}

	private static String pesquisar(int i, char letra) {
		return pesquisar(letra, i);
	}

	private static String pesquisar(char letra, int i) {
		List<String> result = new ArrayList<>();
		for (String nome : nomes) {
			if (i >= nome.length()) {
				continue;
			}
			if (nome.charAt(i) == letra) {
				result.add(nome);
			}
		}
		if (!result.isEmpty()) {
			return result.toString();
		} else {
			return "Nome não encontrado";
		}
	}

	private static String pesquisar() {
		return nomes.toString();
	}

	private static String pesquisar(int i) {
		if (nomes.contains(nomes.get(i))) {
			return nomes.get(i);
		}
		return "Nome não econtrado";
	}

	private static String pesquisar(String nome) {
		if (nomes.contains(nome)) {
			return nome;
		}
		return "Nome não encontrado";
	}

	static {
		nomes.add("Ana");
		nomes.add("Ona");
		nomes.add("Ina");
		nomes.add("Pedro");
		nomes.add("Maria");
		nomes.add("Leo");
	}

}
