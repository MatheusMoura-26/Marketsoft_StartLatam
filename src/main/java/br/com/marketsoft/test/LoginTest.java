package br.com.marketsoft.test;

import java.util.Scanner;

import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.dao.ClienteDAO;
////testando a o método de login e de buscarEmaileSenha que está na classe ClienteDAO
public class LoginTest {

	public static void main(String[] args) {
		//Usando o Scanner para passar as os dados referentes a senha e ao email
		Scanner sc = new Scanner(System.in);
		ClienteDAO dao = new ClienteDAO();
		System.out.println("Digite o email");
		String email = sc.next();
		System.out.println("Digite a senha");
		String senha = sc.next();
		
//		try {
//		System.out.println("Digite o seu email:");
//		Cliente c =dao.findByEmail(sc.next());
//		if(c.equals(null)) {
//			System.out.println("Email incorreto");
//		}
//		System.out.println("Digite a sua senha ");
//		String senha = sc.next();
//		
//		if(senha.equals(c.getSenha())) {
//			System.out.println("Login efetuado com sucesso.");
//		}
//		else {
//			System.out.println("Email ou senha incoretos");
//		}
//			
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println("Email ou senha incorretos");
//		}
		
		Cliente c = dao.buscarEmaileSenha(email, senha);
		//vendo as informações do cliente atráves do método login
		if(c != null) {
		System.out.println(c.getEmail());
		System.out.println(c.getSenha());
		System.out.println(c.getNome());}
		sc.close();

	}

}
