package br.edu.uniopet.tds172a.heraldoisrael.controller;

import java.util.List;

import br.edu.uniopet.tds172a.heraldoisrael.model.ClienteModel;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Produto;

/**
 * 
 * @author heraldo
 *
 */
public class ClienteController {

	private ClienteModel clienteModel;

	public ClienteController() {
		this.clienteModel = new ClienteModel();
	}

	/**
	 * fun��o que insere o cliente e retorna se foi efetuado ou n�o
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean inserirCliente(Cliente cliente) {
		return this.clienteModel.inserirCliente(cliente);
	}

	/**
	 * fun��o que exclui o cliente e retorna se foi efetuado ou n�o
	 * @param cliente 
	 * 
	 * @return
	 */
	public boolean excluirCliente(Cliente cliente) {
		return this.clienteModel.excluirCliente(cliente);
	}

	/**
	 * fun��o que altera o cliente e retorna se foi efetuado ou n�o
	 * 
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public boolean alterarCliente(Cliente cliente) {
		return this.clienteModel.alterarCliente(cliente);
	}

	/**
	 * meotodo de efetuar o login
	 * @param cliente
	 * @return
	 */
	public Cliente efetuarLogin(Cliente cliente) {
		return this.clienteModel.efetuarLogin(cliente);
	}

	/**
	 * metodo de listagem dos produtos
	 * 
	 * @return
	 */
	public List<Produto> listarProdutos() {
		return clienteModel.listarProdutos();
	}
	
	public Cliente buscaCliente(Cliente cliente) {
		return clienteModel.buscaCliente(cliente);
	}

}
