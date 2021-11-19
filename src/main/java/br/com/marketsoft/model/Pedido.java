package br.com.marketsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Mapeando tabela Pedido
@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Pedido;
	
	@Column
	private String Data;
	
	@Column
	private double Valor;

	@Column
	private String Hora;
	
	@Column
	private String Status;
	
	
	@ManyToOne
	private Cliente cliente;
	
	
	//Criando gets e setters
	public Integer getId_Pedido() {
		return Id_Pedido;
	}

	public void setId_Pedido(Integer id_Pedido) {
		Id_Pedido = id_Pedido;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

//	//public Integer getId_Cliente() {
//		return Id_Cliente;
//	}
//
//	public void setId_Cliente(Integer id_Cliente) {
//		Id_Cliente = id_Cliente;
//	}
//	
	
	

	
	
	
	
}
