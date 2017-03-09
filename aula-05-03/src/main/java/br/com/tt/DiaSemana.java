package br.com.tt;

public enum DiaSemana {
	SEGUNDA(2, "Segunda"), TERCA(3, "Ter�a"), QUARTA(4, "Quarta"), QUINTA(5, "Quinta"), SEXTA(6, "Sexta"), SABADO(7,
			"S�bado"), DOMINGO(1, "Domingo");

	private int dia;
	private String desc;

	private DiaSemana(int dia, String desc) {
		this.dia = dia;
		this.desc = desc;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
