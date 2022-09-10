package br.uniwork.controller;
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
	
	/**
	 * Lista de habilidades do candidatoa
	 */
	private ArrayList<Integer> habilidades = new ArrayList<Integer>();
	
	/**
	 * Construtor vazio
	 */
	public Curriculo() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 */
	public Curriculo(int id) {
		this.setId(id);
	}
	
	
	/**
	 * Adiciona uma habilidade
	 * @param idHabilidade
	 */
	public void addHabilidade(int idHabilidade) {
		this.getHabilidades().add(idHabilidade);
	}
	
	/**
	 * Adiciona uma lista de habilidades 
	 * @param idHabilidades
	 */
	public void addHabilidade(int[] idHabilidades) {
		for (int i : idHabilidades) {
			this.getHabilidades().add(i);
		}
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
	public ArrayList<Integer> getHabilidades() {
		return habilidades;
	}


	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(ArrayList<Integer> habilidades) {
		this.habilidades = habilidades;
	}
	
}
