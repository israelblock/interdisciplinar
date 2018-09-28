package br.edu.uniopet.tds172a.heraldoisrael.model;

import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;
/**
 * interface que contem os metodos padr�es a serem utilizados 
 * @author heraldo
 *
 */
public interface ICliente {

	/**
	 * fun��o que insere cliente
	 * @param cliente
	 * @return
	 */
	public abstract boolean inserirCliente(Cliente cliente);

	/**
	 * fun��o que altera o cliente.
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public abstract Cliente alterarCliente(Cliente cliente);

}
