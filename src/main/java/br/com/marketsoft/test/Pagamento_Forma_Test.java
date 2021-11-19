package br.com.marketsoft.test;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Forma_Pagamento;
import br.com.marketsoft.model.Pagamento_Pedido;
import br.com.marketsoft.model.Pedido;

//testando a inserção de dados na tabela Forma_Pagamento 
public class Pagamento_Forma_Test {

	public static void main(String[] args) {
		Pagamento_Pedido pag_Pedido = new Pagamento_Pedido();
		Forma_Pagamento forma_Pag = new Forma_Pagamento();
		Pedido pedido = new Pedido();
		//Passando dados para o relaciomento das tabelas
		forma_Pag.setId_Forma_Pagto(5);
		pedido.setId_Pedido(5);
		
		pag_Pedido.setId_Pagamento_Pedido(null);
		pag_Pedido.setForma_pagamento(forma_Pag);
		pag_Pedido.setPedido(pedido);
		pag_Pedido.setValor(11.50);
		
		
		
		//Usando o Connection Factory 
		EntityManager em = new ConnectionFactory().getConnection();
		em.getTransaction().begin();
		//Fazendo a persistencia dos dados
		em.persist(pag_Pedido);
		em.getTransaction().commit();
		
		em.close();
	}

}
