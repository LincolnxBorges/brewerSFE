package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.*;

public class Cliente {

	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	
	private String cpf;
	
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
}
