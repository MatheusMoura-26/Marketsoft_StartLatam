package br.com.marketsoft.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.dao.ClienteDAO;

//Passando a anottacion e o nome pelo qual podemos chamar o managed benas 
@ManagedBean(name = "loginbean")
@SessionScoped
public class LoginBean implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//private ClienteDAO clientedao = new ClienteDAO();
	
	//private Cliente cliente = new Cliente();
	
	//Passando alguns objetos
	@Inject
	private Cliente cliente = new Cliente();
	private ClienteDAO clientedao= new ClienteDAO();
	
	private Cliente email = new Cliente();
	
	
	
	
	public String logar(){
		//System.out.println("aqui================================");
		//Cliente clienteconsultar = clientedao.buscarEmaileSenha(cliente.getEmail(), cliente.getSenha());
		Cliente clienteconsultar = clientedao.login(cliente.getEmail(), cliente.getSenha());
		System.out.println("aqui================================");
		if(clienteconsultar == null) {
			cliente = clienteconsultar;
			System.out.println("Email ou senha incorretos");
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario nao encontrado!", "Erro no Login"));
			return "Login.xhtml";
		} else  {
			System.out.println();
			return "Principal.xhtml";
	}
		}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public ClienteDAO getClientedao() {
		return clientedao;
	}




	public void setClientedao(ClienteDAO clientedao) {
		this.clientedao = clientedao;
	}
	
	

	
	
	
	
	

	
	
}
