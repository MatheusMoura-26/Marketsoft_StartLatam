package br.com.marketsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Mapenado tabela Item_pedido
@Entity
@Table(name = "Item_Pedido")
public class  Item_Pedido {
	
	@Id
	private Integer  Id_Item;

	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Pedido pedido;
	
	@Column
	private double Quantidade;
	
	@Column
	private Integer Preco_unit;

	//Criando gets e setters
	public Integer getId_Item() {
		return Id_Item;
	}

	public void setId_Item(Integer id_Item) {
		Id_Item = id_Item;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

//	public Integer getPedido_Id_Pedido() {
//		return pedido_Id_Pedido;
//	}
//
//	public void setPedido_Id_Pedido(Integer pedido_Id_Pedido) {
//		this.pedido_Id_Pedido = pedido_Id_Pedido;
//	}
	

	public double getQuantidade() {
		return Quantidade;
	}

	

	

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setQuantidade(double quantidade) {
		Quantidade = quantidade;
	}

	public Integer getPreco_unit() {
		return Preco_unit;
	}

	public void setPreco_unit(Integer preco_unit) {
		Preco_unit = preco_unit;
	} 
	
}
