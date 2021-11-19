package br.com.marketsoft.test;

import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.dao.ClienteDAO;

//testando o método findall que está na classe ClienteDAO
public class Clientefindalltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAO dao = new ClienteDAO();
		//Estrutura de repetição for para mostrar todos os nomes da lista
		for(Cliente cliente:dao.findAll()) {
			System.out.println("Nome: "+ cliente.getNome());
		}
		
	}

}
