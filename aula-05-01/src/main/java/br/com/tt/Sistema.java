package br.com.tt;

public class Sistema {

	public static void main(String[] args) {
		comprar(50D, "Pedro", "Arroz", "Feijão" ,"Batata");
	}

	private static void comprar(double valor, String nome, String... produtos) {
		System.out.println("Nome: " + nome);
		System.out.println("Valor: " + valor);
		System.out.println("Produtos: ");
		for (String produto : produtos) {
			System.out.println("\t - " + produto);
		}

	}
}
