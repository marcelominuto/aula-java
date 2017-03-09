package br.com.tt;

public class String_2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Texto");
		sb.append("Adicionando").append(" mais ");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);

		String nome = "Maria" + " " + "Santos";
		System.out.println(nome);
	}

}
