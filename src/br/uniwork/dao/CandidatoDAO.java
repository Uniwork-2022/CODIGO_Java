package br.uniwork.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.uniwork.model.Factory.ConectionFactory;
import br.uniwork.model.vo.CandidatoVO;
/**
 * Classe que gerencia a as opera��es de CRUD da classe Candidato
 * @see #CandidatoVO()
 * @see #CandidatoBO()
 * @author Mateus Cabral
 * @version 1.0
 */

public class CandidatoDAO {
	
	private Connection conn = null;
	
	public CandidatoDAO() throws SQLException {
		this.conn = new ConectionFactory().getConn();
	}
	
	/**
	 * Insere um candidato no sistema, precisa de todos os campos
	 * @param cvo
	 * @throws SQLException
	 */
	public void insert(CandidatoVO cvo) throws SQLException {
		String sql = "INSERT INTO T_UW_USUARIO "
				+ "(nm_usuario, nr_rg, nr_cpf, nr_telefone, dt_nascimento, ds_email, fl_genero, nm_user, nm_senha) VALUES "
				+ "(?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cvo.getNome());
		ps.setString(2, cvo.getRg());
		ps.setInt(3, cvo.getCpf());
		ps.setInt(4, Integer.parseInt(cvo.getCelular()));
		ps.setDate(5, (Date) cvo.getDataNasc());
		ps.setString(6, cvo.getEmail());
		ps.setString(7, cvo.getGenero());
		ps.setString(8, cvo.getLogin());
		ps.setString(9, cvo.getPwd());
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
	
	
	/**
	 * Get by ID
	 * Retorna um candidato do banco de dados partir do ID
	 * @param id inteiro para busca
	 * @return cvo CandidatoVO 
	 * @throws SQLException
	 */
	public CandidatoVO select(int id) throws SQLException {	
		String sql = "SELECT * FROM T_UW_USUARIO WHERE ID_USUARIO = (?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		CandidatoVO cvo = new CandidatoVO();
		while(rs.next()) {
			String nome = rs.getString("nm_usuario");
			String rg = rs.getString("nr_rg");
			int cpf = rs.getInt("nr_cpf");
			int celular = rs.getInt("nr_telefone");
			Date dt_nascimento = rs.getDate("dt_nascimento");
			String email = rs.getString("ds_email");
			String genero = rs.getString("fl_genero");
			String login = rs.getString("nm_user");
			String senha = rs.getString("nm_senha");
			cvo.setNome(nome);
			cvo.setRg(rg);
			cvo.setCpf(cpf);
			cvo.setCelular(Integer.toString(celular));
			cvo.setDataNasc(dt_nascimento);
			cvo.setEmail(email);
			cvo.setGenero(genero);
			cvo.setLogin(login);
			cvo.setPwd(senha);
		}
		ps.close();
		rs.close();
		conn.close();
		
		return cvo;
	}
	
	/**
	 * Get all
	 * Retorna todos os candidato do banco de dados
	 * @return
	 * @throws SQLException
	 */
	public List<CandidatoVO> select() throws SQLException {
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
		ps.close();
		rs.close();
		conn.close();
		
		return candidatos;
		
	}
	
	public void update(int id, String novoNome) throws SQLException {
		String sql = "UPDATE T_UW_USUARIO SET NM_USUARIO = ? WHERE ID_USUARIO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, novoNome);
		ps.setInt(2, id);
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
	
	public void updatePwd(int id, String novaSenha) throws SQLException {
		String sql = "UPDATE T_UW_USUARIO SET NM_SENHA = ? WHERE ID_USUARIO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, novaSenha);
		ps.setInt(2, id);
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
	
	
	
	public void delete(int id) throws SQLException {
		String sql = "DELETE FROM T_UW_USUARIO WHERE ID_USUARIO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
		conn.close();
	}
	


}
