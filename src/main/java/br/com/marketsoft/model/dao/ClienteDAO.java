package br.com.marketsoft.model.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.marketsoft.connection.ConnectionFactory;
import br.com.marketsoft.model.Cliente;

public class ClienteDAO {
	
	//Testando alguns métodos
	
	//Criando novo cliente
	public Cliente save(String email, String nome, String senha) {
		EntityManager em = new ConnectionFactory().getConnection();
		Cliente cliente= new Cliente();
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
					
		} catch (Exception e) {
			em.getTransaction().rollback();
			return null;
		}finally {
			em.close();
		}
		return cliente;
	}
	
	
	//Criando update 	
	public Cliente update(Cliente cliente) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			if(cliente.getEmail() == null) {
				em.persist(cliente);
			}else {
				em.merge(cliente);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return cliente;
	}
	
//	//Achando pelo Id
//	public Cliente findById(Integer Id_cliente) {
//		EntityManager em = new ConnectionFactory().getConnection();
//		Cliente cliente = null;
//		try {
//			cliente = em.find(Cliente.class, Id_cliente );
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			em.close();
//		}
//		return cliente;
//	}
	//Achando cliente pelo email
	public Cliente findByEmail(String email) {
		EntityManager em = new ConnectionFactory().getConnection();
		Cliente cliente = null;
		try {
			cliente = em.find(Cliente.class, email);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Email ou senha incorretos");
		}
		finally {
			em.close();
		}
		return cliente;
	}
	
	
	
	
	
	//buscando todos os cliente  com  o query
	public List<Cliente>findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Cliente> cliente = null;
		try {
			cliente =  em.createQuery("from Cliente c").getResultList();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		return cliente;
	}
	
	//Método de login
	public Cliente login(String email, String senha) {
		EntityManager em = new ConnectionFactory().getConnection();
		Cliente cliente = null;
		//Algumas sinalizações para vizualizar no console
		System.out.println("Aqui##################################################");
		try {
			cliente = em.find(Cliente.class, email);
			if(cliente == null) {
				System.out.println("Email ou senha incorretos ===========");
				return null;
			}
			else if(senha.equals(cliente.getSenha())){
				System.out.println("Login válido");
				return cliente;
			}
			else {
				System.out.println("Email ou senha incorretos #####");
				return null;
			}
		
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Login não realizado");
			return null;
		}
		finally {
			em.close();
		}
	}
	
	//Buscando dados de uma maneira diferente
	
	public Cliente buscarEmaileSenha(String email, String senha) {
		String jqpl = "SELECT c FROM Cliente c WHERE c.email = :email and c.senha = :senha";
		EntityManager em = new ConnectionFactory().getConnection();
		try { 
			System.out.println("======================================");
			System.out.println("##############################"); 
			return  em.createQuery(jqpl, Cliente.class)
					 .setParameter("email", email)
					 .setParameter("password", senha)
					 .getSingleResult();
			 

		}catch (Exception e ) {
			System.out.println();
	        return null;
	  }
	}
	
	

}
