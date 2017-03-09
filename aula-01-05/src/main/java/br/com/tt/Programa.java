package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		char sexo = 'M';
		char letraA = '\u0061';
		System.out.println("var letraA = " + letraA);
		char letraX = 120;
		System.out.println("var letraX = " + letraX);

		boolean vivo = true;
		Boolean saldo = true;
		Boolean aprovado = Boolean.TRUE;
		
		byte valorBaixo = 127;
		byte valorBaixo1 = - 128; 
		
		short valorCurto = 5245;
		
		Integer valorInteiro = 128000;
		int valorInteiroPrimitivo = 128000;
		
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		
		Long valorLong = 6565656565656L;
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		
		Float valorFlutuante = 5258F;
		Double valorDouble = 5258D;
	}

}
