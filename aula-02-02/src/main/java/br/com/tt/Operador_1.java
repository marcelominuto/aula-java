package br.com.tt;

public class Operador_1 {

	public static void main(String[] args) {
		System.out.println("Operadores");
		System.out.println("Soma: " + (1+5));
		Long soma = 1 + 5L;
		System.out.println("Soma: " + soma);
		
		Long incremento = soma++;
		System.out.println("Incremento: " + incremento);
		System.out.println("Incremento: " + soma);
		
		System.out.println("Pre Incremento");
		Long pre = 3L;
		System.out.println("Pre: " + ++pre);

	}

}
