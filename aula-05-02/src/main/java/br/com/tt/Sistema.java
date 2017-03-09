package br.com.tt;

public class Sistema {

	final String teste;
	
	public Sistema(){
		teste = "a";
	}
	
	public static void main(String[] args) {

		final double pi = 3.14;
		
		final Cliente c1 = new Cliente(1L);
		c1.setNome("Maria");
		c1.setNome("Juca");
		System.out.println(c1.getNome());
	}
}
