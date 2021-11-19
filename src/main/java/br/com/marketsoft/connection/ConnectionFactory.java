package br.com.marketsoft.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//Criando a fabrica de conexões 
public class ConnectionFactory {
	//Fabrica de entity manager  *só podemos fazer isso atráves do persistence-unit que é definido lá no persistence.xml
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Marketsoft");

	//Criando o getConnection visando facilitar as operações
	public EntityManager getConnection() {
		return  emf.createEntityManager();	
		}
}
