package br.com.marketsoft.test;

import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.dao.ClienteDAO;

public class UpdateCliente_test {

	public static void main(String[] args) {
		//update
		
		//Cliente c = new Cliente();
		
//		c.setId_cliente(3);
//		c.setNome("Marcos");
//		c.setEmail("Marc.rob@gmail.com");
//		c.setSenha("macrob23");
//		
//		
//		ClienteDAO dao = new ClienteDAO();
//		c=dao.update(c);
//		
//		System.out.println("ID: " + c.getId_cliente());
//		System.out.println("NOME: " + c.getNome());
//		System.out.println("E-MAIL:" + c.getEmail());
//		System.out.println("SENHA: " + c.getSenha());
		
//Buscando dados com Find
	ClienteDAO dao = new ClienteDAO();
	Cliente c =dao.findByEmail("Rod.silva@gmail.com");
	

	System.out.println("NOME: " + c.getNome());
	System.out.println("E-MAIL:" + c.getEmail());
	System.out.println("SENHA: " + c.getSenha());
	
	
	

	}

}
