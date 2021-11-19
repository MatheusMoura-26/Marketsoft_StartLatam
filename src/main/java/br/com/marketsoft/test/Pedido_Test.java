package br.com.marketsoft.test;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.Pedido;

//testando a inserção de dados na tabela Pedido
public class Pedido_Test {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Cliente cliente = new Cliente();
		//Passando dados para o relaciomento das tabelas
		 cliente.setEmail("teu.augusto@gmail.com");
		
		
		pedido.setId_Pedido(null);
		pedido.setData("21/10/21");
		pedido.setValor(11.50);
		pedido.setHora("14:30");
		pedido.setStatus("Agendado");
		pedido.setCliente(cliente);
		
		//Usando o Connection Factory 
		EntityManager em = new ConnectionFactory().getConnection();
				
		em.getTransaction().begin();
		//Fazendo a persistencia dos dados
		em.persist(pedido);
		em.getTransaction().commit(); 

	}

}
