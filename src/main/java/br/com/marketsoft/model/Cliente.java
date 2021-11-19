package br.com.marketsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Mapaeando tabela cliente

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	private String email;
	
	@Column
	private String nome;
	
	
	@Column
	private String senha;
	
	
	//public Cliente(Integer id_cliente, String nome, String email, String senha) {
		//super();
		//Id_cliente = id_cliente;
		//this.nome = nome;
		//this.email = email;
		//this.senha = senha;
	//}
	
	
	//Criando gets e setters
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
