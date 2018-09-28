/**
 * 
 */
package br.edu.uniopet.tds172a.heraldoisrael.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.uniopet.tds172a.heraldoisrael.controller.ClienteController;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;


@ManagedBean(name = "resumoBean")
@SessionScoped
public class ResumoBean implements Serializable {

	private ClienteController clienteController;
	private Cliente cliente;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2975115685667011660L;

	/**
	 * contrutor vazio do resumo bean
	 */
	public ResumoBean()
	{}
	
	/**
	 * constructor inicializando cliente e controler
	 * @param cliente
	 */
	public ResumoBean(Cliente cliente) {

		this.getCliente();

		this.setClienteController(new ClienteController());
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {

		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {

		this.cliente = cliente;
	}
	
	/**
	 * fun��o de retorno para ir para a parte de altera��o de cadastro
	 * @return
	 */
	public String alteraCadastro() {

		return "/pages/alteracadastro";
	}

	/**
	 * fun��o de retorno da pagina de produtos
	 * @return
	 */
	public String catalogoProdutos() {
		
		return "/pages/produtos";
	}

	/** metodo que retorna  pagina do login para o cliente
	 * 
	 * @return
	 */
	public String efetuarLogout() {

		return "/pages/login";

	}

	/**
	 * @return the clienteController
	 */
	public ClienteController getClienteController() {
		return clienteController;
	}

	/**
	 * @param clienteController the clienteController to set
	 */
	public void setClienteController(ClienteController clienteController) {
		this.clienteController = clienteController;
	}

}
