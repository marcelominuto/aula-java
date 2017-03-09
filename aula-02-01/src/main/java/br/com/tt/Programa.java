package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		Cliente c1 = null;
		System.out.println(c1);
		c1 = new Cliente();
		System.out.println(c1);
		System.out.println(c1.getNome());
		c1.setNome("Maria");
		System.out.println(c1.getNome());
		c1 = null;
		if (c1 != null) {
			System.out.println(c1.getNome());
		}
		c1 = new Cliente();
		Cliente c2 = c1;
		c1.setNome("Juca");
		System.out.println(c2.getNome());

		System.out.println(c2);
		System.out.println(c1);
	}

}
