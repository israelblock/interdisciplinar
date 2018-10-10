package br.edu.uniopet.tds172a.heraldoisrael.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.uniopet.tds172a.heraldoisrael.controller.ClienteController;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;


@SuppressWarnings("deprecation")
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	// criando controller do cliente para utiliza-la e iniciando o cliente

	private ClienteController clienteController;
	private Cliente cliente;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4884858708612322188L;

	public LoginBean() {
		this.setCliente(new Cliente());

		this.clienteController = new ClienteController();

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
	 * metodo para efetuar o login 
	 * @return
	 */
	public String efetuarLogin() {
		
		FacesContext contexto = FacesContext.getCurrentInstance();

		this.cliente = this.clienteController.efetuarLogin(cliente);

		if (this.cliente == null) {

			this.cliente = new Cliente();
			System.out.println("erro no metodo efetuar login dentro do if");
			
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "LOGIN INVÁLIDO!", "VERIFIQUE OS DADOS"));
			
			// se der algum erro no login vai continuar na pagina de login
			return "/pages/login";


		} else {
			// caso de tudo certo com o login, ser� redirecionado para a pagina de resumo do
			// cliente
			
			return "/pages/resumo";

		}

		
	}
	/**
	 * metodo que encaminha para a pagina de cadastro.
	 * @return
	 */
	public String efetuarCadastro() {

		return "/pages/cadastro";
		
	}
}
