package br.com.caelum.contas.modelo;

public abstract class Conta {

	private int numero;
	private String agencia;
	private String titular;
	protected double saldo;

	public Conta() {
	}

	public Conta(int numero, String agencia, String titular, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor menor do que 0");
		}
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public abstract String getTipo();

	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

}
