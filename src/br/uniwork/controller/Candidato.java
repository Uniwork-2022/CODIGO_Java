package br.uniwork.controller;
/**
 * Classe que abstrai candidatos do sistema.
 * @author mateus-cabral
 * @version 1.0
 */

import java.util.Date;

public class Candidato extends Conta{
	/**
	 * Idade do candidato
	 */
	private int idade;
	
	/**
	 * Cpf do candidato
	 */
	private String cpf;
	
	/**
	 * Gênero do candidato
	 */
	private String genero;
	
	/**
	 * Data de nascimento
	 */
	private Date dataNasc;
	
	
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
	public Candidato(String nome, int id, String login, String pwd, String email, String celular, int idade, String cpf) {
		super(nome, id, login, pwd, email, celular);
		this.setIdade(idade);
		this.setCpf(cpf);
	}
	
	
	//Getters e Setters
	@Override
	public String toString() {
		return ("Nome: " + this.getNome() + "    " + 
				"Celular: " + this.getCelular() + 
				"\nLogin: " + this.getLogin() + "    " + 
				"Senha: " + this.getPwd() + "\n" + 
				"ID: " + this.getId() + 
				"    " + "Email: " + this.getEmail() + "\n" + 
				"CPF: " + this.getCpf() + "\n" + 
				"Status: " + (this.isStatus() ? "Ativa" : "Desativada") + "\n" +
				"Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "Não autenticado"));
	}


	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}


	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
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
	
	

}
