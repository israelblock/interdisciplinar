package br.edu.uniopet.tds172a.heraldoisrael.model;

import java.util.List;

import br.edu.uniopet.tds172a.heraldoisrael.dao.ClienteDAO;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Produto;

public class ClienteModel {

	private ClienteDAO clienteDAO;

	public ClienteModel() {
		this.clienteDAO = new ClienteDAO();
	}

	/**
	 * fun��o que insere o cliente e retorna se foi efetuado ou n�o
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean inserirCliente(Cliente cliente) {
		return clienteDAO.inserirCliente(cliente);
	}

	/**
	 * metodo para excluir o cliente.
	 * 
	 * @param cpfCliente
	 * @return
	 */
	public boolean excluirCliente(Cliente cliente) {

		return this.clienteDAO.excluirCliente(cliente);
	}

	/**
	 * fun��o que altera o cliente e retorna se foi efetuado ou n�o
	 * 
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public boolean alterarCliente(Cliente cliente) {

		return this.clienteDAO.alterarCliente(cliente);
	}

	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public Cliente efetuarLogin(Cliente cliente) {

		return this.clienteDAO.efetuarLogin(cliente);
	}

	/**
	 * metodo de listagem dos produtos
	 * 
	 * @return
	 */
	public List<Produto> listarProdutos() {
		return this.clienteDAO.listarProdutos();

	}
	
	public Cliente buscaCliente(Cliente cliente) {
		return this.clienteDAO.buscaCliente(cliente);
	}

}
