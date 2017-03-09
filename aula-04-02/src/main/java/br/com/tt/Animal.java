package br.com.tt;

public class Animal {
	
	private Integer id;
	private String nome;
	private String dono;

	public Animal() {

	}
	
	public Animal(Integer id) {
		this.id = id;
	}
	
	public Animal(Integer id, String nome){
		this(id);
		this.nome = nome;
	}
	
	public Animal(Integer id, String nome, String dono){
		this(id, nome);
		this.dono = dono;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	
	
	
}
