package br.com.caelum.contas;

import java.util.List;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
	
	private double total;
	
	public void calculaImpostos(Evento evento){
		total = 0;
		List<Tributavel> lista = evento.getLista("listaTributaveis");
		for (Tributavel t : lista) {
			total += t.getValorImposto();
		}
	}
	
	public double getTotal() {
		return total;
	}
}
