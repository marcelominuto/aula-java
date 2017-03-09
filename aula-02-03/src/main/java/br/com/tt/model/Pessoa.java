package br.com.tt.model;

public class Pessoa {
	
	private String nome;
	private String cnpjCpf;
	private String telefone;
	private Endereco endereco;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCnpjCpf(){
		return cnpjCpf;
	}
	
	public void setCnpjCpf(String cnpjCpf){
		this.cnpjCpf = cnpjCpf;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public Endereco getEndereco(){
		return endereco;
	}
	
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	

}
