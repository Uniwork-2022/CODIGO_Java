package br.uniwork.model;
/**
 * Classe que abstrai uma proposta de emprego dentro do sistema.
 * @author mateus-cabral
 * @version 1.0
 */
import java.util.ArrayList;

import br.uniwork.model.vo.CandidatoVO;
import br.uniwork.model.vo.HabilidadeVO;

public class VagaEmprego {
	
	/**
	 * Id da proposta no banco de dados
	 */
	private int idVaga;
	
	/**
	 * Id da empresa no banco de dados
	 */
	private int idEmpresa;
	
	/**
	 * Nome do cargo
	 */
	private String nomeCargo;
	
	/**
	 * Descri��o do comportamento e responsabilidades esperados
	 */
	private String descritivo;
	
	/**
	 * Sal�rio
	 */
	private double salario;
	
	/**
	 * Localiza��o do cargo
	 */
	private String local;
	
	/**
	 * Lista de habilidades requisitadas
	 * @deprecated
	 */
	private ArrayList<HabilidadeVO> habilidades = new ArrayList<HabilidadeVO>();
	
	/**
	 * Lista de candidatos candidatados
	 * @deprecated
	 */
	private ArrayList<CandidatoVO> candidatos = new ArrayList<CandidatoVO>();
	
	/**
	 * Verifica se a proposta est� ativa
	 * @deprecated
	 */
	private boolean status;
	
	/**
	 * Construtor vazio
	 */
	public VagaEmprego() {
		
	}
	
	/**
	 * Construtor par�metrizado
	 * @param idProposta int
	 * @param idEmpresa int
	 * @param nomeCargo String
	 * @param descritivo String
	 * @param salario float
	 * @param local String
	 * @param skills ArrayList<Integer>
	 */
	public VagaEmprego(int idVaga, int idEmpresa, String nomeCargo, String descritivo, double salario, String local, ArrayList<HabilidadeVO> skills) {
		this.setIdVaga(idVaga);
		this.setIdEmpresa(idEmpresa);
		this.setNomeCargo(nomeCargo);
		this.setDescritivo(descritivo);
		this.setSalario(salario);
		this.setLocal(local);
		this.setHabilidades(skills);
		this.setStatus(true);
	}
	
	//Cadastro de usu�rios
	public void candidatar(CandidatoVO c) {
		this.getCandidatos().add(c);
	}
	
	/**
	 * M�todo para enviar dados pelo DAO
	 * @param vaga
	 */
	public void cadastrarVaga(VagaEmprego vaga) {
		
	}
	
	
	//Fechamento da vaga
	public void fecharProposta() {
		this.setStatus(false);
	}

	
	//Getters e Setters
	
	/**
	 * @return the idVaga
	 */
	public int getIdVaga() {
		return idVaga;
	}

	/**
	 * @param idVaga the idVaga to set
	 */
	public void setIdVaga(int idVaga) {
		this.idVaga = idVaga;
	}

	/**
	 * @return the idEmpresa
	 */
	public int getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the nomeCargo
	 */
	public String getNomeCargo() {
		return nomeCargo;
	}

	/**
	 * @param nomeCargo the nomeCargo to set
	 */
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	/**
	 * @return the descritivo
	 */
	public String getDescritivo() {
		return descritivo;
	}

	/**
	 * @param descritivo the descritivo to set
	 */
	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * @param local the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}

	/**
	 * @return the habilidades
	 */
	public ArrayList<HabilidadeVO> getHabilidades() {
		return habilidades;
	}

	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(ArrayList<HabilidadeVO> habilidades) {
		this.habilidades = habilidades;
	}

	/**
	 * @return the candidatos
	 */
	public ArrayList<CandidatoVO> getCandidatos() {
		return candidatos;
	}

	/**
	 * @param candidatos the candidatos to set
	 */
	public void setCandidatos(ArrayList<CandidatoVO> candidatos) {
		this.candidatos = candidatos;
	}

	
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}
