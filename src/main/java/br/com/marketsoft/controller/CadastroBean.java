package br.com.marketsoft.controller;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.marketsoft.model.Cliente;
import br.com.marketsoft.model.dao.ClienteDAO;

@ManagedBean(name = "cadastrobean")
@SessionScoped
public class CadastroBean {
	
	@Inject
	private Cliente cliente = new Cliente();
	private ClienteDAO clientedao= new ClienteDAO();
	
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

	
	
	public String cadastro() {
		Cliente clienteadastrar = clientedao.save(cliente.getEmail(),cliente.getNome(), cliente.getSenha());
		if(clienteadastrar == null) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "algo deu errado encontrado!", "Erro no cadastro"));
			return "Cadastro.xhtml";
		}else {
			System.out.println("Cadastro feito com sucesso!");
			return "Login.xhtml";
		}
	}

}
