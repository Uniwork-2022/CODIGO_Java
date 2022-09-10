package br.uniwork.controller;
/**
 * Classe que abstrai uma proposta de emprego dentro do sistema.
 * @author mateus-cabral
 * @version 1.0
 */
import java.util.ArrayList;

public class PropostaEmprego {
	
	/**
	 * Id da proposta no banco de dados
	 */
	private int idProposta;
	
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
	 */
	private ArrayList<Integer> idHabilidade = new ArrayList<Integer>();
	
	/**
	 * Lista de candidatos candidatados
	 */
	private ArrayList<Integer> idCandidatos = new ArrayList<Integer>();
	
	/**
	 * Verifica se a proposta está ativa
	 */
	private boolean status;
	
	/**
	 * Construtor vazio
	 */
	public PropostaEmprego() {
		
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
	public PropostaEmprego(int idProposta, int idEmpresa, String nomeCargo, String descritivo, double salario, String local, ArrayList<Integer> skills) {
		this.setIdProposta(idProposta);
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
	public int getIdProposta() {
		return idProposta;
	}


	public void setIdProposta(int idProposta) {
		this.idProposta = idProposta;
	}


	public int getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getNomeCargo() {
		return nomeCargo;
	}


	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}


	public String getDescritivo() {
		return descritivo;
	}


	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public ArrayList<Integer> getIdHabilidade() {
		return idHabilidade;
	}


	public void setIdHabilidade(ArrayList<Integer> idHabilidade) {
		this.idHabilidade = idHabilidade;
	}


	public ArrayList<Integer> getIdCandidatos() {
		return idCandidatos;
	}


	public void setIdCandidatos(ArrayList<Integer> idCandidatos) {
		this.idCandidatos = idCandidatos;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

	
	

	
	

}
