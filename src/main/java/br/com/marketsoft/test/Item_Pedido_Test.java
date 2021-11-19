package br.com.marketsoft.test;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Item_Pedido;
import br.com.marketsoft.model.Pedido;
import br.com.marketsoft.model.Produto;

//testando a inserção de dados na tabela Item_Pedido
public class Item_Pedido_Test { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item_Pedido item_Ped = new Item_Pedido();
		Produto produto = new Produto();
		Pedido pedido = new Pedido();
		//Passando dados para o relaciomento das tabelas
		produto.setId_Produto(35);
		pedido.setId_Pedido(1);
		
		
		item_Ped.setId_Item(5);		
		item_Ped.setProduto(produto);
		item_Ped.setPedido(pedido);
		item_Ped.setQuantidade(3);
		item_Ped.setPreco_unit(3);
		
		
		
		
		//Usando o Connection Factory 
		EntityManager em = new ConnectionFactory().getConnection();
		em.getTransaction().begin();
		//Fazendo a persistencia dos dados
		em.persist(item_Ped);
		em.getTransaction().commit();
	}

}
