package br.com.tt.model;

import java.util.Calendar;

public class Funcionario extends Pessoa {

	private Double salario;
	private Funcionario gerente;
	private Calendar admissao;
	private Calendar desligamento;

	public Funcionario() {
		super();
	}

	public Funcionario(Double salario, Funcionario gerente, Calendar admissao, Calendar desligamento) {
		super();
		this.salario = salario;
		this.gerente = gerente;
		this.admissao = admissao;
		this.desligamento = desligamento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	public Calendar getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Calendar admissao) {
		this.admissao = admissao;
	}

	public Calendar getDesligamento() {
		return desligamento;
	}

	public void setDesligamento(Calendar desligamento) {
		this.desligamento = desligamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admissao == null) ? 0 : admissao.hashCode());
		result = prime * result + ((desligamento == null) ? 0 : desligamento.hashCode());
		result = prime * result + ((gerente == null) ? 0 : gerente.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (admissao == null) {
			if (other.admissao != null)
				return false;
		} else if (!admissao.equals(other.admissao))
			return false;
		if (desligamento == null) {
			if (other.desligamento != null)
				return false;
		} else if (!desligamento.equals(other.desligamento))
			return false;
		if (gerente == null) {
			if (other.gerente != null)
				return false;
		} else if (!gerente.equals(other.gerente))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tFuncionario [salario=" + salario + ", gerente=" + gerente + ", admissao=" + admissao + ", desligamento="
				+ desligamento + "]";
	}

}
