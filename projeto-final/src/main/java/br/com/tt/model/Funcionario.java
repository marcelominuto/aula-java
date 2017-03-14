package br.com.tt.model;

import java.util.List;

import br.com.tt.dao.FuncionarioDao;

public class Funcionario extends Pessoa {
	private String funcao;
	private Double salario;

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public void gerarCodigo() {
		this.codigo = this.getClass().getName();
		this.codigo += "_" + funcao + getId();
	}

	public void salvar() {
		new FuncionarioDao().salvar(this);
	}

	public static List<Funcionario> consultar() {
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		List<Funcionario> funcionarios = funcionarioDao.consultar();
		return funcionarios;
	}

	public static void deletar(String nome) {

		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = novoFuncionario(nome);
		funcionario = dao.buscar(funcionario);

		dao.deletar(funcionario);
	}

	private static Funcionario novoFuncionario(String nome) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		return funcionario;
	}

	public static Funcionario consultar(String nome) {
		FuncionarioDao dao = new FuncionarioDao();
		return dao.buscar(novoFuncionario(nome));

	}

}
