/**
 * 
 */
package br.edu.uniopet.tds172a.heraldoisrael.vo;

/**
 * @author heraldo
 *
 */
public class Produto {
	
	private String marcaProduto;
	private String nomeProd;
	private String descricaoProduto;
	private double precoProduto;
	private double alturaProduto;
	private double larguraProduto;
	private double pesoProduto;
	private int quantidadeProduto;
	
	/**
	 * 
	 */
	public Produto() {
		
	}
	
	
	/**
	 * @param marcaProduto
	 * @param nomeProd
	 * @param descricaoProduto
	 * @param precoProduto
	 * @param alturaProduto
	 * @param larguraProduto
	 * @param pesoProduto
	 * @param quantidadeProduto
	 */
	public Produto(String marcaProduto, String nomeProd, String descricaoProduto, double precoProduto,
			double alturaProduto, double larguraProduto, double pesoProduto, int quantidadeProduto) {
		super();
		this.marcaProduto = marcaProduto;
		this.nomeProd = nomeProd;
		this.descricaoProduto = descricaoProduto;
		this.precoProduto = precoProduto;
		this.alturaProduto = alturaProduto;
		this.larguraProduto = larguraProduto;
		this.pesoProduto = pesoProduto;
		this.quantidadeProduto = quantidadeProduto;
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
