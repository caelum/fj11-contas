package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.1;
	}

}
