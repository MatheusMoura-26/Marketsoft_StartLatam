package br.com.marketsoft.test;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Produto;
//testando a inserção de dados na tabela Produto
public class ProdutoTest {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		
		produto.setDescricao("Pacote Biscoito Futurinhas");
		produto.setPreco_Venda(3.00);
		produto.setQuant_Estoque(7);
		produto.setValidade("12/12/21");
		
		//Usando o Connection Factory 
		EntityManager em = new ConnectionFactory().getConnection();
		
		em.getTransaction().begin();
		//Fazendo a persistencia dos dados
		em.persist(produto);
		em.getTransaction().commit();

	}

}
