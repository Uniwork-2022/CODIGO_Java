package br.uniwork.controller;
/**
 * Classe que calcula a compatibilidade de um candidato com uma vaga.
 * @author mateus-cabral
 * @version 1.0
 */
import java.util.ArrayList;

public class Compatibilidade {
	
	/**
	 * Id da proposta no banco de dados
	 */
	private int idProposta;
	
	/**
	 * Id da conta no banco de dados
	 */
	private int idConta;
	
	/**
	 * Valor de compatibilidade entre candidato e vaga. Entre 0 e 1
	 */
	private float compatibilidade;
	
	/**
	 * Construtor vazio
	 */
	public Compatibilidade() {
		
	}
	
	/**
	 * Construtor parâmetrizado 
	 * @param idProposta
	 * @param idUser
	 */
	public Compatibilidade(int idProposta, int idUser) {
		this.setIdConta(idUser);
		this.setIdProposta(idProposta);
	}
	
	
	// Calculando a compatibilidade entre o usuário e a vaga
	public void compatibilidade(ArrayList<Integer> skillsCandidato, ArrayList<Integer> skillsProposta) {
		int tamanhoProposta = skillsProposta.size();
		int tamanhoCandidato = skillsCandidato.size();
		float compat = 0;
		float valor = (100 / tamanhoProposta);		
		for(int i = 0; i < tamanhoProposta; i++) {
			for(int c = 0; c < tamanhoCandidato; c++) {
				if(skillsCandidato.get(c) == skillsProposta.get(i)) {
					compat = compat + valor;
				}
			}
		}
		this.setCompatibilidade(compat);;
	}

	//Getters e Setters
	
	/**
	 * @return the idProposta
	 */
	public int getIdProposta() {
		return idProposta;
	}

	/**
	 * @param idProposta the idProposta to set
	 */
	public void setIdProposta(int idProposta) {
		this.idProposta = idProposta;
	}

	/**
	 * @return the idConta
	 */
	public int getIdConta() {
		return idConta;
	}

	/**
	 * @param idConta the idConta to set
	 */
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	/**
	 * @return the compatibilidade
	 */
	public float getCompatibilidade() {
		return compatibilidade;
	}

	/**
	 * @param compatibilidade the compatibilidade to set
	 */
	public void setCompatibilidade(float compatibilidade) {
		this.compatibilidade = compatibilidade;
	}
	
}
