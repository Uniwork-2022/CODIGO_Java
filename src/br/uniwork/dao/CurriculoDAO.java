package br.uniwork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.uniwork.model.Factory.ConectionFactory;
import br.uniwork.model.vo.CandidatoVO;
import br.uniwork.model.vo.CurriculoVO;

/**
 * Classe que gerencia a as operações de CRUD da classe Curriculo
 * @see #CurriculoVO
 * @author Mateus Cabral
 * @version 1.0
 */
public class CurriculoDAO {
	private Connection conn = null;
	
	public CurriculoDAO() throws SQLException {
		this.conn = new ConectionFactory().getConn();
	}
	
	/**
	 * Insere um novo registro na tabela
	 * @param cvo
	 * @param cdvo
	 * @throws SQLException
	 */
	public void insert(CurriculoVO cvo, CandidatoVO cdvo) throws SQLException {
		String sql = "INSERT INTO T_UW_CURRICULO "
				+ "(id_usuario, ds_objetivo_profissional, ds_experiencia_profissional, vl_pretencao_salarial) "
				+ "VALUES (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, cdvo.getId());
		ps.setString(2, cvo.getObjetivoProfissional());
		ps.setString(3, cvo.getExperienciaProfissional());
		ps.setInt(4, cvo.getPretensaoSalarial());
		ps.executeUpdate();
		ps.close();
		conn.close();
		
	}
	
	public List<CurriculoVO> select() throws SQLException {
		List<CurriculoVO> curriculos = new ArrayList<CurriculoVO>();
		String sql = "SELECT * FROM T_UW_CURRICULO";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		CurriculoVO cvo = new CurriculoVO();
		
		while(rs.next()) {
			int idCandidato = rs.getInt("id_usuario");
			int idCurriculo = rs.getInt("id_curriculo");
			String objetivo = rs.getString("ds_objetivo_profissional");
			String formacao = rs.getString("ds_formacao_academica");
			String experiencia = rs.getString("ds_experiencia_profissional");
			int pretensao = rs.getInt("vl_pretencao_salarial");
			
			cvo.setExperienciaProfissional(formacao);
			cvo.setId(idCurriculo);
			cvo.setObjetivoProfissional(objetivo);
			cvo.setFormacaoAcademica(formacao);
			cvo.setPretensaoSalarial(pretensao);
			cvo.setExperienciaProfissional(experiencia);
			cvo.setIdCandidato(idCandidato);
			
			curriculos.add(cvo);
		}
		
		ps.close();
		rs.close();
		conn.close();
		
		return curriculos;
		
	}
}
