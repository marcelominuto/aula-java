package br.com.tt;

public class Sistema {

	public static void main(String[] args) {
		try {
			cadastro(5);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void cadastro(int i) {
		String[] clientes = new String[5];
		clientes[i] = "Pedro";
	}

}
