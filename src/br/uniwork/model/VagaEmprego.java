package br.uniwork.model;
/**
 * Classe que abstrai uma proposta de emprego dentro do sistema.
 * @author mateus-cabral
 * @version 1.0
 */
import java.util.ArrayList;

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
	 * Descrição do comportamento e responsabilidades esperados
	 */
	private String descritivo;
	
	/**
	 * Salário
	 */
	private double salario;
	
	/**
	 * Localização do cargo
	 */
	private String local;
	
	/**
	 * Lista de habilidades requisitadas
	 * @deprecated
	 */
	private ArrayList<Integer> idHabilidade = new ArrayList<Integer>();
	
	/**
	 * Lista de candidatos candidatados
	 * @deprecated
	 */
	private ArrayList<Integer> idCandidatos = new ArrayList<Integer>();
	
	/**
	 * Verifica se a proposta está ativa
	 * @deprecated
	 */
	private boolean status;
	
	/**
	 * Construtor vazio
	 */
	public VagaEmprego() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 * @param idProposta int
	 * @param idEmpresa int
	 * @param nomeCargo String
	 * @param descritivo String
	 * @param salario float
	 * @param local String
	 * @param skills ArrayList<Integer>
	 */
	public VagaEmprego(int idVaga, int idEmpresa, String nomeCargo, String descritivo, double salario, String local, ArrayList<Integer> skills) {
		this.setIdVaga(idVaga);
		this.setIdEmpresa(idEmpresa);
		this.setNomeCargo(nomeCargo);
		this.setDescritivo(descritivo);
		this.setSalario(salario);
		this.setLocal(local);
		this.setIdHabilidade(skills);
		this.setStatus(true);
	}
	
	//Cadastro de usuários
	public void candidatar(int idCandidato) {
		this.getIdCandidatos().add(idCandidato);
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
	 * @return the idHabilidade
	 */
	public ArrayList<Integer> getIdHabilidade() {
		return idHabilidade;
	}

	/**
	 * @param idHabilidade the idHabilidade to set
	 */
	public void setIdHabilidade(ArrayList<Integer> idHabilidade) {
		this.idHabilidade = idHabilidade;
	}

	/**
	 * @return the idCandidatos
	 */
	public ArrayList<Integer> getIdCandidatos() {
		return idCandidatos;
	}

	/**
	 * @param idCandidatos the idCandidatos to set
	 */
	public void setIdCandidatos(ArrayList<Integer> idCandidatos) {
		this.idCandidatos = idCandidatos;
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
