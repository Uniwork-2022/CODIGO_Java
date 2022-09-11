package br.uniwork.model;
/**
 * Classe que abstrai candidatos do sistema.
 * @author mateus-cabral
 * @version 1.0
 */

import java.util.Date;

public class Candidato extends Conta{
	/**
	 * Idade do candidato - não será mais utilizado
	 */
//	private int idade;
	
	/**
	 * Cpf do candidato
	 */
	private String cpf;
	
	/**
	 * Número do RG
	 */
	private String rg;
	
	/**
	 * Gênero do candidato
	 */
	private String genero;
	
	/**
	 * Data de nascimento
	 */
	private Date dataNasc;
	
	/**
	 * Currículo do usuário
	 */
	private Curriculo cv;
	

	
	
	/**
	 * Construtor vazio
	 */
	public Candidato() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 * @param nome nome do candidato
	 * @param id id do banco de dados
	 * @param login login do candidato no sistema
	 * @param pwd pwd do candidato no sistema
	 * @param email email do candidato no sistema
	 * @param celular celular cadastrado
	 * @param idade idade do candidato
	 * @param cpf cpf vinculado ao candidato
	 */
	public Candidato(String nome, int id, String login, String pwd, String email, String celular, String endereco, String cpf, String rg) {
		super(nome, id, login, pwd, email, celular, endereco);
		this.setCpf(cpf);
		this.setRg(rg);
	}
	
	
	//Getters e Setters
	@Override
	public String toString() {
		return ("Nome: " + this.getNome() + "    " + 
				"Celular: " + this.getCelular() + 
				"\nLogin: " + this.getLogin() + "    " + 
				"Senha: " + this.getPwd() + "\n" + 
				"ID: " + this.getId() + "    " + 
				"Email: " + this.getEmail() + "\n" + 
				"CPF: " + this.getCpf() + "\n" + 
				"Status: " + (this.isStatus() ? "Ativa" : "Desativada") + "\n" +
				"Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "Não autenticado"));
	}
	
	/**
	 * Método para enviar dados pelo DAO
	 * @param candidato
	 */
	@Override
	public void cadastrarConta(Conta candidato) {
		
	}



	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/**
	 * @return the dataNasc
	 */
	public Date getDataNasc() {
		return dataNasc;
	}


	/**
	 * @param dataNasc the dataNasc to set
	 */
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	/**
	 * @return the cv
	 */
	public Curriculo getCv() {
		return cv;
	}

	/**
	 * @param cv the cv to set
	 */
	public void setCv(Curriculo cv) {
		this.cv = cv;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
