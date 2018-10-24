package br.edu.uniopet.tds172a.heraldoisrael.vo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_sequence")
	@SequenceGenerator(name = "generator_sequence", sequenceName="TB_CLIENTE_AUTO_INCR")
	@Column(name="IDTB_CLI", length = 38, nullable = false)
	private int idCliente;
	
	@Column(name="NM_CLI", length = 50, nullable = false)
	private String nomeCliente;

	@Column(name="CPF_CLI", length = 15, nullable = false)
	private long cpfCliente;
	
	@Column(name="END_CLI", length = 80, nullable = false)
	private String enderecoCliente;
		
	@Column(name="DATA_NASC_CLI", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date dataNascCliente;
	
	@Column(name="DDD_TELCEL", length = 3, nullable = false)
	private int dddCelCliente;
	
	@Column(name="DDD_TELFIXO", length = 3, nullable = false)
	private int dddFixoCliente;
	
	@Column(name="TELCEL_CLI", length = 15, nullable = false)
	private int telCelCliente;
	
	@Column(name="TELFIXO_CLI", length = 15, nullable = false)
	private int telFixoCliente;
	
	@Column(name="NM_USUARIO", length = 15, nullable = false)
	private String nomeUsuario;
	
	@Column(name="SENHA_USUARIO", length = 20, nullable = false)
	private String senhaUsuario;
	

	@OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="TIPO_USUARIO",
    joinColumns={@JoinColumn(name="TIPO_USUARIO_IDTIPO_USUARIO", referencedColumnName="TIPO_USUARIO_IDTIPO_USUARIO")},
    inverseJoinColumns={@JoinColumn(name="IDTIPO_USUARIO", referencedColumnName="IDTIPO_USUARIO")})
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
	public Cliente(int idCliente, String nomeCliente, long cpfCliente, String enderecoCliente, Date dataNascCliente, int dddCelCliente,
			int dddFixoCliente, int telCelCliente, int telFixoCliente, String nomeUsuario, String senhaUsuario,
			int tipoCliente) {
		super();
		setIdCliente(idCliente);
		setNomeCliente(nomeCliente);
		setCpfCliente(cpfCliente);
		setEnderecoCliente(enderecoCliente);
		setDataNascCliente(dataNascCliente);
		setDddCelCliente(dddCelCliente);
		setDddFixoCliente(dddFixoCliente);
		setTelCelCliente(telCelCliente);
		setTelFixoCliente(telFixoCliente);
		setNomeUsuario(nomeUsuario);
		setSenhaUsuario(senhaUsuario);
		setTipoCliente(tipoCliente);
	}

	/**
	 * 
	 * @param cliente
	 */
	public Cliente(Cliente cliente) {
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

}
