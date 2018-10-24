
package br.edu.uniopet.tds172a.heraldoisrael.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.uniopet.tds172a.heraldoisrael.controller.ClienteController;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;

@ManagedBean(name = "cadastroBean")
@SessionScoped
public class CadastroBean implements Serializable {

	private ClienteController clienteController;
	private Cliente cliente = new Cliente();
	private static final long serialVersionUID = 2166274126620784954L;

	/**
	 * Inializa��o de cliente e clientecontroller
	 */
	public CadastroBean() {

		this.setCliente(new Cliente());

		this.setClienteController(new ClienteController());
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Metodo de inser��o de clientes e devidas mensagens de informa��o.
	 * 
	 * @return
	 */
	public String inserirCliente() {

		FacesContext contexto = FacesContext.getCurrentInstance();

		boolean deuCerto;
		deuCerto = this.clienteController.inserirCliente(cliente);

		if (deuCerto == false) {

			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Cliente n�o cadastrado, verifique os dados e tente novamente!", null));

			return "/pages/cadastro";

		} else {

			contexto.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente cadastrado com sucesso!", null));
			return "/pages/resumo";
		}

	}

	/**
	 * m�todo do bot�o voltar para retornar ao login.
	 * 
	 * @return
	 */
	public String voltarLogin() {
		this.cliente = new Cliente();

		return "/pages/login";

	}

	/*
	 * 
	 * metodo para encaminha para a area de exclusao do cliente
	 */
	public String excluirCadastroProprio() {

		return "pages/exclusaoadastro";
	}

	/**
	 * construtor da controler para utiliza��o
	 * 
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

	/**
	 * metodo para excluir o cliente.
	 * 
	 * @param cpfCliente
	 * @return
	 */
	public String excluirCliente() {

		FacesContext contexto = FacesContext.getCurrentInstance();

		this.cliente = this.clienteController.efetuarLogin(cliente);

		if (cliente == null) {

			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Cliente n�o deletado, verifique e tente novamente!", null));

			return "/pages/resumo";

		} else {

			contexto.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente deletado com sucesso!", null));
			return "/pages/login";
		}

	}

	/**
	 * 
	 * Metodo de altera��o de cliente
	 * 
	 * @return
	 */
	public String alterarCliente() {

		FacesContext contexto = FacesContext.getCurrentInstance();

		this.cliente = this.clienteController.alterarCliente(cliente);

		if (cliente == null) {

			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Cliente n�o Alterado, verifique e tente novamente!", null));

			return "/pages/resumo";

		} else {

			contexto.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente alterado com sucesso!", null));
			return "/pages/resumo";
		}

	}

}