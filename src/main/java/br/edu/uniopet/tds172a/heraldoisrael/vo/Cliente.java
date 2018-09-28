package br.edu.uniopet.tds172a.heraldoisrael.vo;

import java.util.Date;

public class Cliente {

	private String nomeCliente;
	private long cpfCliente;
	private String enderecoCliente;
	private Date dataNascCliente;
	private int dddCelCliente;
	private int dddFixoCliente;
	private int telCelCliente;
	private int telFixoCliente;
	private String nomeUsuario;
	private String senhaUsuario;
	private int tipoCliente;

	/**
	 * 
	 */
	public Cliente() {

	}

	/**
	 * @param nomeCliente
	 * @param cpfCliente
	 * @param enderecoCliente
	 * @param dataNascCliente
	 * @param dddCelCliente
	 * @param dddFixoCliente
	 * @param telCelCliente
	 * @param telFixoCliente
	 * @param nomeUsuario
	 * @param senhaUsuario
	 */
	public Cliente(String nomeCliente, long cpfCliente, String enderecoCliente, Date dataNascCliente, int dddCelCliente,
			int dddFixoCliente, int telCelCliente, int telFixoCliente, String nomeUsuario, String senhaUsuario,
			int tipoCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.dataNascCliente = dataNascCliente;
		this.dddCelCliente = dddCelCliente;
		this.dddFixoCliente = dddFixoCliente;
		this.telCelCliente = telCelCliente;
		this.telFixoCliente = telFixoCliente;
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.tipoCliente = tipoCliente;
	}

	/**
	 * @return the tipoCliente
	 */
	public int getTipoCliente() {
		return tipoCliente;
	}

	/**
	 * @param tipoCliente
	 *            the tipoCliente to set
	 */
	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	/**
	 * 
	 * @param cliente
	 */
	public Cliente(Cliente cliente) {
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @param nomeCliente
	 *            the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @return the cpfCliente
	 */
	public long getCpfCliente() {
		return cpfCliente;
	}

	/**
	 * @param cpfCliente
	 *            the cpfCliente to set
	 */
	public void setCpfCliente(long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	/**
	 * @return the enderecoCliente
	 */
	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	/**
	 * @param enderecoCliente
	 *            the enderecoCliente to set
	 */
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	/**
	 * @return the dataNascCliente
	 */
	public Date getDataNascCliente() {
		return dataNascCliente;
	}

	/**
	 * @param dataNascCliente
	 *            the dataNascCliente to set
	 */
	public void setDataNascCliente(Date dataNascCliente) {
		this.dataNascCliente = dataNascCliente;
	}

	/**
	 * @return the dddCelCliente
	 */
	public int getDddCelCliente() {
		return dddCelCliente;
	}

	/**
	 * @param dddCelCliente
	 *            the dddCelCliente to set
	 */
	public void setDddCelCliente(int dddCelCliente) {
		this.dddCelCliente = dddCelCliente;
	}

	/**
	 * @return the dddFixoCliente
	 */
	public int getDddFixoCliente() {
		return dddFixoCliente;
	}

	/**
	 * @param dddFixoCliente
	 *            the dddFixoCliente to set
	 */
	public void setDddFixoCliente(int dddFixoCliente) {
		this.dddFixoCliente = dddFixoCliente;
	}

	/**
	 * @return the telCelCliente
	 */
	public int getTelCelCliente() {
		return telCelCliente;
	}

	/**
	 * @param telCelCliente
	 *            the telCelCliente to set
	 */
	public void setTelCelCliente(int telCelCliente) {
		this.telCelCliente = telCelCliente;
	}

	/**
	 * @return the telFixoCliente
	 */
	public int getTelFixoCliente() {
		return telFixoCliente;
	}

	/**
	 * @param telFixoCliente
	 *            the telFixoCliente to set
	 */
	public void setTelFixoCliente(int telFixoCliente) {
		this.telFixoCliente = telFixoCliente;
	}

	/**
	 * @return the nomeUsuario
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * @param nomeUsuario
	 *            the nomeUsuario to set
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * @return the senhaUsuario
	 */
	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	/**
	 * @param senhaUsuario
	 *            the senhaUsuario to set
	 */
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

}
