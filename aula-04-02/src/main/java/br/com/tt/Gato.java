package br.com.tt;

public class Gato extends Animal {

	private Integer idade;
	private String pelo;
	private String raca;

	public Gato() {

	}

	public Gato(Integer id, String nome) {
		super(id, nome);
	}

	public Gato(Integer id, String nome, String dono) {
		super(id, nome, dono);
	}

	public Gato(Integer id, String nome, String dono, Integer idade) {
		super(id, nome, dono);
		this.idade = idade;
	}

	public Gato(Integer id, String nome, String dono, Integer idade, String pelo) {
		super(idade, nome, dono);
		this.idade = idade;
		this.pelo = pelo;
	}

	public Gato(Integer id, String nome, String dono, Integer idade, String pelo, String raca) {
		super(id, nome, dono);
		this.idade = idade;
		this.pelo = pelo;
		this.raca = raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
