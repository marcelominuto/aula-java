package br.com.tt;

public class Sistema {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal(1, "Toto");
		System.out.println(animal.getNome());
		
		Animal a1 = new Animal();
		Animal a2 = new Animal(2, "Rex", "Ana");
		
		Gato g1 = new Gato(5, "Lua");
	}

}
