package br.com.tt;

public class Sistema {
	
	public static void main(String[] args) {
		DiaSemana diaDaMulher = DiaSemana.QUARTA;
		DiaSemana descansar= DiaSemana.DOMINGO;
		int diaDomingo = DiaSemana.DOMINGO.getDia();
		
		DiaSemana[] dias = DiaSemana.values();
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
			System.out.println(" - - " + diaSemana.getDesc());
		}
	}

}
