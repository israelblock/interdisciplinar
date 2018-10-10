package br.edu.uniopet.tds172a.heraldoisrael.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.uniopet.tds172a.heraldoisrael.model.ICliente;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Cliente;
import br.edu.uniopet.tds172a.heraldoisrael.vo.Produto;

/**
 * classe DAO que implementa a interface ICliente, efetua as devidas conex�es
 * com o banco de dados e efetua as a��es necessarias
 * 
 * @author heraldo
 *
 */
public class ClienteDAO implements ICliente {
	/**
	 * metodos estaticos para informa��es de acesso ao banco que sempre ser�o as
	 * mesmas
	 */
	private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private static final String DB_USER = "adminter";
	private static final String DB_PASSWORD = "adminter123";

	/**
	 * 
	 */
	public ClienteDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo de inser��o do cliente no banco de dados
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean inserirCliente(Cliente cliente) {

		Connection connection = null;

		boolean deuCerto;
		try {
			// abrir a conexao
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// inicio o controle transacional
			connection.setAutoCommit(false);

			PreparedStatement pstmt = null;
			// preparar a query
			pstmt = connection.prepareStatement("INSERT INTO TB_CLIENTE"
					+ "(IDTB_CLI,NM_CLI,CPF_CLI,END_CLI,DATA_NASC_CLI,TELCEL_CLI,TELFIXO_CLI,NM_USUARIO,SENHA_USUARIO,DDD_TELFIXO,DDD_TELCEL,TIPO_USUARIO_IDTIPO_USUARIO)"
					+ "VALUES(TB_CLIENTE_AUTO_INCR.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)");

			pstmt.setString(1, cliente.getNomeCliente());
			pstmt.setLong(2, cliente.getCpfCliente());
			pstmt.setString(3, cliente.getEnderecoCliente());
			pstmt.setDate(4, new java.sql.Date(cliente.getDataNascCliente().getTime()));
			pstmt.setInt(5, cliente.getTelCelCliente());
			pstmt.setInt(6, cliente.getTelFixoCliente());
			pstmt.setString(7, cliente.getNomeUsuario());
			pstmt.setString(8, cliente.getSenhaUsuario());
			pstmt.setInt(9, cliente.getDddFixoCliente());
			pstmt.setInt(10, cliente.getDddCelCliente());
			pstmt.setInt(11, 2);

			// executar
			pstmt.executeUpdate();
			connection.commit();
			connection.setAutoCommit(true);
			deuCerto = true;
		} catch (SQLException e) {

			try {
				if (connection != null && !connection.isClosed()) {
					connection.rollback();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			deuCerto = false;
		} finally {

			try {
				// fechar a conexao
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return deuCerto;

	}

	/**
	 * * metodo de recupera dos clientes no banco de dados
	 * 
	 */
	public List<Produto> listarProdutos() {

		Connection connection = null;
		List<Produto> listaProdutosRecuperado = null;

		try {
			// abrir a conexao
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			PreparedStatement pstmt = null;
			// preparar a query
			pstmt = connection.prepareStatement("SELECT * FROM TB_PRODUTO");

			ResultSet resultSet = pstmt.executeQuery();

			listaProdutosRecuperado = new ArrayList<Produto>();

			while (resultSet.next()) {
				// long cpfCliente = resultSet.getInt("CPF_CLI");

				String marcaProduto = resultSet.getString("MARCA_PROD_ID_MARCA");
				String nomeProduto = resultSet.getString("NOME_PROD");
				String descricaoProduto = resultSet.getString("DESC_PROD");
				double precoProduto = resultSet.getDouble("PRECO_PROD");
				double alturaProduto = resultSet.getDouble("ALTURA_PROD");
				double larguraProduto = resultSet.getDouble("LARGURA_PROD");
				double pesoProduto = resultSet.getDouble("PESO__PROD");
				int quantidadeProduto = resultSet.getInt("QTD_EM_ESTOQUE");

				/**
				 * cria��o do objeto e inser��o na lista
				 */
				listaProdutosRecuperado.add(new Produto(marcaProduto, nomeProduto, descricaoProduto, precoProduto,
						alturaProduto, larguraProduto, pesoProduto, quantidadeProduto));

			}
			return listaProdutosRecuperado;

		} catch (SQLException e) {

			try {
				if (connection != null && !connection.isClosed()) {
					connection.rollback();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return null;
		} finally {

			try {
				// fechar a conexao
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	/**
	 * metodo de exclus�o do cliente no banco de dados pelo CPF
	 */
	public String excluirCliente(String cpfCliente) {

		Connection connection = null;

		try {
			// abrir a conexao
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// inicio o controle transacional
			connection.setAutoCommit(false);

			PreparedStatement pstmt = null;
			// preparar a query
			pstmt = connection.prepareStatement("DELETE FROM TB_CLIENTE WHERE CPF_CLI = ?");
			/*
			 * atencao, este � o cpf do cliente/usuario se atentar para que nao seja
			 * possivel inserir dois clientes/usuarios com mesmo cpf
			 */

			pstmt.setString(1, cpfCliente);

			// executar
			pstmt.executeUpdate();
			connection.commit();
			connection.setAutoCommit(true);
			cpfCliente = null;
			return cpfCliente;

		} catch (SQLException e) {

			try {
				if (connection != null && !connection.isClosed()) {
					connection.rollback();
				}
			} catch (SQLException e1) {
				// e1.printStackTrace();
				System.out.println("N�o Foi Possivel Excluir o Cliente!");
			}
			e.printStackTrace();
			return cliente(new Cliente());
		} finally {

			try {
				// fechar a conexao
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	private String cliente(Cliente cliente) {
		return null;
	}

	/**
	 * metodo de altera��o do cliente no banco de dados pelo CPF
	 */
	public Cliente alterarCliente(Cliente cliente) {
		Connection connection = null;

		try {
			// abrir a conexao
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// inicio o controle transacional
			connection.setAutoCommit(false);

			PreparedStatement pstmt = null;
			// preparar a query
			String sqlALterar = ("UPDATE TB_CLIENTE SET NM_CLI = ?, END_CLI = ?,DATA_NASC_CLI = ?,TELCEL_CLI = ?, TELFIXO_CLI = ?, NM_USUARIO = ?,SENHA_USUARIO = ?, DDD_TELFIXO = ?, DDD_TELCEL = ?, TIPO_USUARIO_IDTIPO_USUARIO = ? WHERE CPF_CLI=?");
			pstmt = connection.prepareStatement(sqlALterar);
			/*
			 * numera��o come�a em dois, pois est� com auto increment no bdd
			 */
			pstmt.setString(1, cliente.getNomeCliente());
			// pstmt.setLong(2, cpfClienteParaAlterar);
			pstmt.setString(2, cliente.getEnderecoCliente());
			pstmt.setDate(3, new java.sql.Date(cliente.getDataNascCliente().getTime()));
			pstmt.setInt(4, cliente.getTelCelCliente());
			pstmt.setInt(5, cliente.getTelFixoCliente());
			pstmt.setString(6, cliente.getNomeUsuario());
			pstmt.setString(7, cliente.getSenhaUsuario());
			pstmt.setInt(8, cliente.getDddFixoCliente());
			pstmt.setInt(9, cliente.getDddCelCliente());
			pstmt.setInt(10, cliente.getTipoCliente());

			System.out.println("Tipo cliente identificado" + cliente.getTipoCliente());
			
			
			// executar
			pstmt.executeUpdate();
			connection.commit();
			connection.setAutoCommit(true);
			return cliente;

		} catch (SQLException e) {

			try {
				if (connection != null && !connection.isClosed()) {
					connection.rollback();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return null;
		} finally {

			try {
				// fechar a conexao
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	/**
	 * m�todo para confirmar se o cliente existe, e efetuar o login do mesmo.
	 * 
	 * @param cliente
	 * @return
	 */
	public Cliente efetuarLogin(Cliente cliente) {
		Connection connection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// abrir a conexao
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// inicio o controle transacional

			PreparedStatement pstmt = null;
			// preparar a query
			pstmt = connection.prepareStatement("SELECT * FROM TB_CLIENTE WHERE NM_USUARIO = ? AND SENHA_USUARIO = ?");

			pstmt.setString(1, cliente.getNomeUsuario());
			pstmt.setString(2, cliente.getSenhaUsuario());
			// executar

			ResultSet resultSet = pstmt.executeQuery();

			Cliente clienteRecuperado = null;
			while (resultSet.next()) {

				String nomeCliente = resultSet.getString("NM_CLI");
				long cpfCliente = resultSet.getLong("CPF_CLI");
				String enderecoCliente = resultSet.getString("END_CLI");
				java.sql.Date dataNascCliente = resultSet.getDate("DATA_NASC_CLI");
				int telCelCliente = resultSet.getInt("TELCEL_CLI");
				int telFixoCliente = resultSet.getInt("TELFIXO_CLI");
				String nomeUsuario = resultSet.getString("NM_USUARIO");
				String senhaUsuario = resultSet.getString("SENHA_USUARIO");
				int dddFixoCliente = resultSet.getInt("DDD_TELFIXO");
				int dddCelCliente = resultSet.getInt("DDD_TELCEL");
				int tipoCliente = resultSet.getInt("TIPO_USUARIO_IDTIPO_USUARIO");

				clienteRecuperado = new Cliente(nomeCliente, cpfCliente, enderecoCliente, dataNascCliente,
						dddCelCliente, dddFixoCliente, telCelCliente, telFixoCliente, nomeUsuario, senhaUsuario,
						tipoCliente);
			}
			return clienteRecuperado;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} finally {

			try {
				// fechar a conexao
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
