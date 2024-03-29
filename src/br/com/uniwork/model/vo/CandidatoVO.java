package br.com.uniwork.model.vo;



/**
 * Classe que abstrai candidatos do sistema.
 * @author mateus-cabral
 * @version 2.0
 */


import br.com.uniwork.model.Conta;

public class CandidatoVO extends Conta{
	
	/**
	 * Cpf do candidato
	 */
	private int cpf;
	
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
	private int idade;
	
	/**
	 * Currículo do usuário
	 */
	private CurriculoVO cv;
	

	
	
	/**
	 * Construtor vazio
	 */
	public CandidatoVO() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 * @param nome
	 * @param id
	 * @param login
	 * @param pwd
	 * @param email
	 * @param celular
	 * @param cpf
	 * @param rg
	 * @param idade
	 * @param genero
	 */
	public CandidatoVO(String nome, int id, String login, String pwd, String email, Long celular, int cpf, String rg, int idade, String genero) {
		super(nome, id, login, pwd, email, celular);
		this.setCpf(cpf);
		this.setGenero(genero);
		this.setRg(rg);
		this.setIdade(idade);
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
				"Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "N�o autenticado"));
	}
	

	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
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
	 * @return the cv
	 */
	public CurriculoVO getCv() {
		return cv;
	}

	/**
	 * @param cv the cv to set
	 */
	public void setCv(CurriculoVO cv) {
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

	@Override
	public boolean login(String login, String pwd) {
		
		return false;
	}

	@Override
	public boolean logout() {
		
		return false;
	}
	
	

}
