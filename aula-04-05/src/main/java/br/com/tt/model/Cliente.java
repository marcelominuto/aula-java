package br.com.tt.model;

import java.math.BigDecimal;

public class Cliente extends Pessoa {

	private Boolean ativo = Boolean.TRUE;
	private BigDecimal saldo;

	public Cliente() {
		super();
	}

	public Cliente(Boolean ativo, BigDecimal saldo) {
		super();
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
}
