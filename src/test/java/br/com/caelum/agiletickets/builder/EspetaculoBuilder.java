package br.com.caelum.agiletickets.builder;

import br.com.caelum.agiletickets.models.Espetaculo;
import br.com.caelum.agiletickets.models.TipoDeEspetaculo;

public class EspetaculoBuilder {
	private Espetaculo espetaculo;
	
	public EspetaculoBuilder() {
		espetaculo = espetaculoDefault();
	}
	
	public EspetaculoBuilder chamado(String nome) {
		this.espetaculo.setNome(nome);
		return this;
	}
	
	public EspetaculoBuilder queEh(String descricao) {
		this.espetaculo.setDescricao(descricao);
		return this;
	}
	
	public EspetaculoBuilder doTipo(TipoDeEspetaculo tipo) {
		this.espetaculo.setTipo(tipo);
		
		return this;
	}
	
	public Espetaculo cria() {
		return this.espetaculo;
	}

	private Espetaculo espetaculoDefault() {
		Espetaculo espetaculoDefault = new Espetaculo();
		
		espetaculoDefault = new Espetaculo();
		espetaculoDefault.setNome("Rei Leao");
		espetaculoDefault.setDescricao("Musical da Broadway");
		espetaculoDefault.setTipo(TipoDeEspetaculo.TEATRO);
		
		return espetaculoDefault;
	}

}
