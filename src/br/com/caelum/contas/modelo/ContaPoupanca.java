package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}
	
	@Override
	public String getTipo() {
		return "Conta Poupanca";
	}
}
