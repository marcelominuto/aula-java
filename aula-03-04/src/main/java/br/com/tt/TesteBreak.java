package br.com.tt;

public class TesteBreak {
	
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++){
			if(i==5){
				System.out.println("Número 5");
				break;
			}
			System.out.println(i);
		}
	}

}
