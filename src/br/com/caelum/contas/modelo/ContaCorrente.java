package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

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
		return getSaldo() * 0.01;
	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor menor do que 0");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= valor - 0.10;
	}
}
