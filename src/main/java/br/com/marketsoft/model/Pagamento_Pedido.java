package br.com.marketsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Mapeando tabela Pagamento_Pedido
@Entity
@Table(name = "Pagamento_Pedido")
public class Pagamento_Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Pagamento_Pedido;
	
	@ManyToOne
	private Forma_Pagamento forma_pagamento;
	
	@ManyToOne
	private Pedido  pedido;
	
	//Criando gets e setters
	
	public Integer getId_Pagamento_Pedido() {
		return Id_Pagamento_Pedido;
	}

	public void setId_Pagamento_Pedido(Integer id_Pagamento_Pedido) {
		Id_Pagamento_Pedido = id_Pagamento_Pedido;
	}

	public Forma_Pagamento getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(Forma_Pagamento forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	@Column
    private double Valor;

	
	
	
}
