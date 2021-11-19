package br.com.marketsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Mapeando tabela forma_pagamento
@Entity
@Table(name = "forma_pagamento")
public class Forma_Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Forma_Pagto;
	
	@Column
	private String Descricao;
	
	//Criando gets e setters

	public Integer getId_Forma_Pagto() {
		return Id_Forma_Pagto;
	}

	public void setId_Forma_Pagto(Integer id_Forma_Pagto) {
		Id_Forma_Pagto = id_Forma_Pagto;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	
	
}
