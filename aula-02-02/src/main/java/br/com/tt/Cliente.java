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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjCpf == null) ? 0 : cnpjCpf.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cnpjCpf == null) {
			if (other.cnpjCpf != null)
				return false;
		} else if (!cnpjCpf.equals(other.cnpjCpf))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
