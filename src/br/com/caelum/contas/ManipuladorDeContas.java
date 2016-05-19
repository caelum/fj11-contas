package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setAgencia("1234");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batman");
	}

	public void saca(Evento evento) {
		double valor = evento.getDouble("valor");
		conta.saca(valor);
	}

	public void deposita(Evento evento) {
		double valor = evento.getDouble("valor");
		conta.deposita(valor);
	}

}
