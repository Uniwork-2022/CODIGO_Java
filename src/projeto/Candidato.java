package projeto;
/**
 * @author mateus-cabral
 * @version 1.0
 */

import java.util.Date;

public class Candidato extends Conta{
	
	private int idade;
	private String cpf;
	private String genero;
	private Date dataNasc;
	
	
	//Construtor
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
	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}	

}
