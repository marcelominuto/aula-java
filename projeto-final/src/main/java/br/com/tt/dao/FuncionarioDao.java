package br.com.tt.dao;

import java.util.List;

import br.com.tt.fake.BancoDadosFake;
import br.com.tt.model.Funcionario;

public class FuncionarioDao implements Dao<Funcionario> {

	@Override
	public void salvar(Funcionario funcionario) {
		String nome = funcionario.getNome();
		System.out.println("Salvando Funcionario " + nome);
		if (funcionario.getId() == null) {
			Long id = (long) BancoDadosFake.funcionarios.size();
			funcionario.setId(id + 1);

		} else {
			BancoDadosFake.funcionarios.remove(funcionario.getId());

		}
		BancoDadosFake.funcionarios.add(funcionario);

	}

	@Override
	public Funcionario buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario buscar(Funcionario f) {
		List<Funcionario> lista = BancoDadosFake.funcionarios;
		for (Funcionario funcionario : lista) {
			if (funcionario.getNome().equals(f.getNome())) {
				return funcionario;
			}
		}
		return null;
	}

	@Override
	public List<Funcionario> consultar() {

		return BancoDadosFake.funcionarios;
	}

	@Override
	public List<Funcionario> consultar(Funcionario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> consultar(List<Funcionario> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(Funcionario funcionario) {
		BancoDadosFake.funcionarios.remove(funcionario);

	}

}
