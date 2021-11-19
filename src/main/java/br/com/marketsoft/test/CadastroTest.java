package br.com.marketsoft.test;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.dao.ClienteDAO;

//testando o método cadastro que está na classe ClienteDAO
public class CadastroTest {

	public static void main(String[] args) {
		//Cliente c = new Cliente(null, "Aldo", "aldo.moura@gmail.com", "547677");
		
		Cliente cliente = new Cliente();
		cliente.setEmail("lucas.melo@gmail.com");
		cliente.setNome("Lucas Melo");
		
		cliente.setSenha("12345");

		
		//Cliente c1 = New Cliente(null,"Lucas","luke.gmz@gmail.com","12345");
		
		
		
		//Também testando o update 
		ClienteDAO dao = new ClienteDAO();
		//cliente=dao.c(cliente);
		//Printando os dados do cliente criado ou alterado
		System.out.println("NOME: " + cliente.getNome());
		System.out.println("E-MAIL:" + cliente.getEmail());
		System.out.println("SENHA: " + cliente.getSenha());
		

	}

}
