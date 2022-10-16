package br.uniwork.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.uniwork.model.Factory.ConectionFactory;

/**
 * Descontinuado
 * @author Mateus Cabral
 * @deprecated
 */
public class TesteDAO {
	private Connection conn = null;
	
	public TesteDAO() {
		this.conn = new ConectionFactory().getConn();
	}
	
	public void insert() throws SQLException{
		String sql = "INSERT INTO T_UW_HABILIDADE (nm_habilidade, ds_habilidade, tp_habilidade) "
				+ "VALUES (?,?,?,?)";
	}
	
	public void select() throws SQLException{
		
	}
	
	public void select(int ID) throws SQLException{
		
	}
	
	public void update() throws SQLException{
		
	}
	
	public void delete() throws SQLException{
		
	}
}
