package br.com.tt.validate;

import br.com.tt.exception.ClienteException;
import br.com.tt.model.Cliente;

public class ClienteValidate {

	private static final String NOME_VALIDA = "Nome necessita 5 letras";
	private static final String CPF_VALIDA = "Nome necessita 11 dígitos";

	public void nome(Cliente cliente) throws ClienteException {
		if (cliente.getNome().length() < 4) {
			throw new ClienteException(NOME_VALIDA);
		}
	}

	public void cpf(Cliente cliente) throws ClienteException {
		if (cliente.getCpf().length() != 11) {
			throw new ClienteException(CPF_VALIDA);
		}
	}

}
