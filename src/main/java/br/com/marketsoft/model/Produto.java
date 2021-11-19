package br.com.marketsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mapeando tabela Produto
@Entity
@Table(name = "Produto")
public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Produto;
	@Column
	private String descricao;
	@Column
	private double preco_Venda;
	@Column
	private double quant_Estoque;
	//Duvida sobre data
	@Column
	private String validade;
	
	
	//Criando gets e setters
	public Integer getId_Produto() {
		return id_Produto;
	}
	public void setId_Produto(Integer id_Produto) {
		this.id_Produto = id_Produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco_Venda() {
		return preco_Venda;
	}
	public void setPreco_Venda(double preco_Venda) {
		this.preco_Venda = preco_Venda;
	}
	public double getQuant_Estoque() {
		return quant_Estoque;
	}
	public void setQuant_Estoque(double quant_Estoque) {
		this.quant_Estoque = quant_Estoque;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
	
	

}
