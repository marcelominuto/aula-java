package br.com.tt;

public class Animal {

	public Animal() {
		System.out.println("Passando no construtor");
	}

	static {
		System.out.println("Bloco static");
	}

	{
		System.out.println("Passando no bloco");
	}
}
