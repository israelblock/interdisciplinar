/**
 * 
 */
package br.edu.uniopet.tds172a.heraldoisrael.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author heraldo
 *
 */
@Entity
@Table(name="TB_PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_sequence")
	@SequenceGenerator(name = "generator_sequence", sequenceName="seq_idProduto")
	@Column(name="IDTB_PROD", length = 15, nullable = false)
	private Integer id;
	
	@Column(name="MARCA_PROD_ID_MARCA", length = 15, nullable = false)
	private String marcaProduto;
	
	@Column(name="NOME_PROD", length = 50, nullable = false)
	private String nomeProd;
	
	@Column(name="DESC_PROD", length = 50, nullable = false)
	private String descricaoProduto;
	
	@Column(name="PRECO_PROD", length = 15, nullable = false)
	private double precoProduto;
	
	@Column(name="ALTURA_PROD", length = 15, nullable = false)
	private double alturaProduto;
	
	@Column(name="LARGURA_PROD", length = 15, nullable = false)
	private double larguraProduto;
	
	@Column(name="PESO__PROD", length = 15, nullable = false)
	private double pesoProduto;
	
	@Column(name="QTD_EM_ESTOQUE", length = 15, nullable = false)
	private int quantidadeProduto;
	
	/**
	 * 
	 */
	public Produto() {
		
	}
	
	
	/**
	 * @param id
	 * @param marcaProduto
	 * @param nomeProd
	 * @param descricaoProduto
	 * @param precoProduto
	 * @param alturaProduto
	 * @param larguraProduto
	 * @param pesoProduto
	 * @param quantidadeProduto
	 */
	public Produto(Integer id, String marcaProduto, String nomeProd, String descricaoProduto, double precoProduto,
			double alturaProduto, double larguraProduto, double pesoProduto, int quantidadeProduto) {
		super();
		this.id = id;
		this.marcaProduto = marcaProduto;
		this.nomeProd = nomeProd;
		this.descricaoProduto = descricaoProduto;
		this.precoProduto = precoProduto;
		this.alturaProduto = alturaProduto;
		this.larguraProduto = larguraProduto;
		this.pesoProduto = pesoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the marcaProduto
	 */
	public String getMarcaProduto() {
		return marcaProduto;
	}
	/**
	 * @param marcaProduto the marcaProduto to set
	 */
	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}
	/**
	 * @return the nomeProd
	 */
	public String getNomeProd() {
		return nomeProd;
	}
	/**
	 * @param nomeProd the nomeProd to set
	 */
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	/**
	 * @return the descricaoProduto
	 */
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	/**
	 * @param descricaoProduto the descricaoProduto to set
	 */
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	/**
	 * @return the precoProduto
	 */
	public double getPrecoProduto() {
		return precoProduto;
	}
	/**
	 * @param precoProduto the precoProduto to set
	 */
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	/**
	 * @return the alturaProduto
	 */
	public double getAlturaProduto() {
		return alturaProduto;
	}
	/**
	 * @param alturaProduto the alturaProduto to set
	 */
	public void setAlturaProduto(double alturaProduto) {
		this.alturaProduto = alturaProduto;
	}
	/**
	 * @return the larguraProduto
	 */
	public double getLarguraProduto() {
		return larguraProduto;
	}
	/**
	 * @param larguraProduto the larguraProduto to set
	 */
	public void setLarguraProduto(double larguraProduto) {
		this.larguraProduto = larguraProduto;
	}
	/**
	 * @return the pesoProduto
	 */
	public double getPesoProduto() {
		return pesoProduto;
	}
	/**
	 * @param pesoProduto the pesoProduto to set
	 */
	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}
	/**
	 * @return the quantidadeProduto
	 */
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	/**
	 * @param quantidadeProduto the quantidadeProduto to set
	 */
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	
 
}
