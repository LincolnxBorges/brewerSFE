package com.algaworks.brewer.model;

public enum Origem {
	
	NACIONAL("Nacional"),
	INTERNACIONAL("Internacional");
	
	//Preciso criar esse construtor para ficar com letras minuscular 
	private String descricao;
	
	Origem(String descricao) {
		this.descricao  = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
