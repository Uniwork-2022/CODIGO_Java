package br.uniwork.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.uniwork.model.vo.CandidatoVO;
import oracle.jdbc.datasource.impl.OracleDataSource;

public class CandidatoDAO {
	
	private String connString = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private Connection conn;
	
	public CandidatoDAO() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL(connString);
		ods.setUser(Dados.USER);
		ods.setPassword(Dados.PWD);
		
		conn = ods.getConnection();
	}
	
	public void insert(CandidatoVO c) throws SQLException {
		String sql = "INSERT INTO T_UW_USUARIO "
				+ "(nm_usuario, nr_rg, nr_cpf, nr_telefone, dt_nascimento, ds_email, "
				+ " fl_genero, nm_user, nm_senha) VALUES "
				+ "(?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setString(2, c.getRg());
		ps.setInt(3, c.getCpf());
		ps.setInt(4, Integer.parseInt(c.getCelular()));
		ps.setDate(5, (Date) c.getDataNasc());
		ps.setString(6, c.getEmail());
		ps.setString(7, c.getGenero());
		ps.setString(8, c.getLogin());
		ps.setString(9, c.getPwd());
		ps.execute();
	}
	
	public CandidatoVO get(int id) throws SQLException {	
		String sql = "SELECT FROM T_UW_USUARIO WHERE ID_USUARIO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		String nome = rs.getString(1);
		String rg = rs.getString(2);
		int cpf = rs.getInt(3);
		int celular = rs.getInt(4);
		Date dt_nascimento = rs.getDate(5);
		String email = rs.getString(6);
		String genero = rs.getString(7);
		String login = rs.getString(8);
		String senha = rs.getString(9);
		CandidatoVO cv = new CandidatoVO(nome, id, login, senha, email, Integer.toString(celular), cpf, rg, genero, dt_nascimento);
		return cv;
	}
	
	public List<CandidatoVO> get() throws SQLException {
		List<CandidatoVO> candidatos = new ArrayList<CandidatoVO>();
		
		String sql = "SELECT * FROM T_UW_USUARIO";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			String rg = rs.getString(3);
			int cpf = rs.getInt(4);
			int celular = rs.getInt(5);
			Date dt_nascimento = rs.getDate(6);
			String email = rs.getString(7);
			String genero = rs.getString(8);
			String login = rs.getString(9);
			String senha = rs.getString(10);
			
			candidatos.add(new CandidatoVO(nome, id, login, senha, email, Integer.toString(celular), cpf, rg));
			
		}
		
		return candidatos;
		
	}
	
	public void update(int id, String novoNome) throws SQLException {
		String sql = "UPDATE T_UW_USUARIO SET NM_USUARIO = ? WHERE ID_USUARIO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, novoNome);
		ps.setInt(2, id);
		ps.execute();
	}
	
	public void updatePwd(int id, String novaSenha) throws SQLException {
		String sql = "UPDATE T_UW_USUARIO SET NM_SENHA = ? WHERE ID_USUARIO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, novaSenha);
		ps.setInt(2, id);
		ps.execute();
	}
	
	
	
	public void delete(int id) throws SQLException {
		String sql = "DELETE FROM T_UW_USUARIO WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
	}
	
	public void encerrarConexao() throws SQLException {
		conn.close();
	}

}