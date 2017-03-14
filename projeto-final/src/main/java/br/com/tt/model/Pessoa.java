package br.com.tt.model;

public abstract class Pessoa {
	private Long id;
	protected String codigo;
	private String nome;
	private String cnpjCpf;
	
	public abstract void gerarCodigo();
	
	public String getCodigo(){
		return codigo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

}
