package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.1;
	}

}
