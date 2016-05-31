package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private String titular;
	private int numeroApolice;
	private double valor;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValorImposto() {
		return 42 + valor * 0.02;
	}

	@Override
	public String getTipo() {
		return "Seguro de Vida";
	}
}
