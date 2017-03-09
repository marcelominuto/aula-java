package br.com.tt;
/**
 * Olá sou a classe cliente
 * @author sala03
 *
 */
public class Cliente {

	private String nome;
	private String cnpjCpf;
	private String endereco;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNCnpjCpf(){
		return cnpjCpf;
	}
	
	public void setCnpjCpf(String cnpjCpf){
		this.cnpjCpf = cnpjCpf;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cnpjCpf=" + cnpjCpf + ", endereco=" + endereco + "]";
	}

}
