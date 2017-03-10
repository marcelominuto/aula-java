package br.com.tt;

public class Sistema {

	public static void main(String[] args) throws Exception {

		Integer nota = 11;
		validarNota(nota);
		System.out.println("Calcular notas");
	}

	public static void validarNota(Integer nota) throws Exception {
		if (nota < 0 || nota > 10) {
			throw new Exception("Nota inválida");
		}
	}

}
