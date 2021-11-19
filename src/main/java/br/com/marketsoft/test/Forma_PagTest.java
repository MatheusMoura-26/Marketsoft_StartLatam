package br.com.marketsoft.test;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Forma_Pagamento;

//testando a inserção de dados na tabela Forma_Pagamento
public class Forma_PagTest {
	
	public static void main(String[] args) {
		Forma_Pagamento fpa = new Forma_Pagamento();
		
		//Não precisa passar o id pois foi configurado como auto-incremento
		fpa.setId_Forma_Pagto(null);
		fpa.setDescricao("Cartão Credencial");
		
		
		//Usando o Connection Factory 
		EntityManager em = new ConnectionFactory().getConnection();
		em.getTransaction().begin();
		//Fazendo a persistencia dos dados
		em.persist(fpa);
		em.getTransaction().commit();
	}

}
