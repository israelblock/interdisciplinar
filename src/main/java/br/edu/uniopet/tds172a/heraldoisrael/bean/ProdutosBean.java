/**
 * 
 */
package br.edu.uniopet.tds172a.heraldoisrael.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.edu.uniopet.tds172a.heraldoisrael.controller.ClienteController;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Produto;

@ManagedBean(name = "produtosBean")
@SessionScoped
/**
 * @author heraldo
 *
 */
public class ProdutosBean implements Serializable {

	private static final long serialVersionUID = 8916050504249682558L;
	
	private ClienteController clienteController;
	private Produto produto;

	public ProdutosBean() {
		
		this.setProduto(new Produto());
		this.setClienteController(new ClienteController());
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

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * 
	 * @return
	 */
	public String voltarResumo() {
		return "/pages/resumo";
		
	}
	
	/**
	 * Meetodo que retorna a pagina de altera��o
	 * @return
	 */
	public String alterarCadastro() {
		
		return "/pages/alteracadastro";
		
	}
	
	/**
	 * metodo de listagem dos produtos
	 * 
	 * @return
	 */
	public List<Produto> listarProdutos() {
		
		FacesContext contexto = FacesContext.getCurrentInstance();

		List<Produto> listaProdutosRecuperado = new ArrayList<>();

		listaProdutosRecuperado = clienteController.listarProdutos();
		
		if (listaProdutosRecuperado == null) {

			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Lista de produtos n�o pode ser recuperada.", null));

		}
		return listaProdutosRecuperado;

	}

}
