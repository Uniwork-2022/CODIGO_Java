package br.uniwork.model.vo;

/**
 * Classe que abstrai o currículo do candidato, de acordo com as habilidades do sistema.
 * Deve começar sem habilidades
 * @author mateus-cabral
 * @version 1.0
 */

import java.util.ArrayList;

public class CurriculoVO{

	/**
	 * Id do currículo no banco de dados
	 */
	private int id;
	
	private CandidatoVO candidato;
	
	/**
	 * Lista de habilidades do candidatoa
	 */
	private ArrayList<HabilidadeVO> habilidades = new ArrayList<HabilidadeVO>();
	
	/**
	 * Objetivo profissional do candidato, dentro de uma lista de possíveis opções
	 */
	private String objetivoProfissional;
	
	/**
	 * Construtor vazio
	 */
	public CurriculoVO() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 */
	public CurriculoVO(int id, CandidatoVO candidato) {
		this.setId(id);
		this.setCandidato(candidato);
	}
	
	

	
	/**
	 * Método para enviar dados pelo DAO
	 * @param cv
	 */
	public void cadastrarCurriculo(CurriculoVO cv) {
		
	}

	//Getters e Setters

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the candidato
	 */
	public CandidatoVO getCandidato() {
		return candidato;
	}

	/**
	 * @param candidato the candidato to set
	 */
	public void setCandidato(CandidatoVO candidato) {
		this.candidato = candidato;
	}

	/**
	 * @return the objetivoProfissional
	 */
	public String getObjetivoProfissional() {
		return objetivoProfissional;
	}

	/**
	 * @param objetivoProfissional the objetivoProfissional to set
	 */
	public void setObjetivoProfissional(String objetivoProfissional) {
		this.objetivoProfissional = objetivoProfissional;
	}
	
}
