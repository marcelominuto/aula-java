package br.com.tt;

public class Switch {

	public static void main(String[] args) {

		String turno = "N";
		switch (turno) {
		case "M":
			System.out.println("Bom Dia");
			break;
		case "T":
			System.out.println("Boa Tarde");
			break;
		case "N":
			System.out.println("Boa Noite");
			break;
		default:
			System.out.println("Olá");
			break;
		}
	}

}
