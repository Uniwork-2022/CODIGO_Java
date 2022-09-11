package br.uniwork.model;
/**
 * Classe que abstrai o currículo do candidato, de acordo com as habilidades do sistema.
 * Deve começar sem habilidades
 * @author mateus-cabral
 * @version 1.0
 */
import java.util.ArrayList;

public class Curriculo{

	/**
	 * Id do currículo no banco de dados
	 */
	private int id;
	
	private Candidato candidato;
	
	/**
	 * Lista de habilidades do candidatoa
	 */
	private ArrayList<Habilidade> habilidades = new ArrayList<Habilidade>();
	
	/**
	 * Construtor vazio
	 */
	public Curriculo() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 */
	public Curriculo(int id, Candidato candidato) {
		this.setId(id);
		this.setCandidato(candidato);
	}
	
	
	/**
	 * Adiciona uma habilidade
	 * @param idHabilidade
	 */
	public void addHabilidade(Habilidade h) {
		this.getHabilidades().add(h);
	}
	
	/**
	 * Método para enviar dados pelo DAO
	 * @param cv
	 */
	public void cadastrarCurriculo(Curriculo cv) {
		
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
	public ArrayList<Habilidade> getHabilidades() {
		return habilidades;
	}


	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(ArrayList<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	/**
	 * @return the candidato
	 */
	public Candidato getCandidato() {
		return candidato;
	}

	/**
	 * @param candidato the candidato to set
	 */
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
}
