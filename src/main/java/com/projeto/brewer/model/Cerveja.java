package com.projeto.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Cerveja {

	 @NotBlank
	 private String sku;
	 @NotBlank
	 private String nome;
	 
	 @Size
	 private String descricao;
	 
	 
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	 
}