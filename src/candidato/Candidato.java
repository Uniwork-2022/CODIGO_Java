package candidato;

import java.util.Date;

import conta.Conta;

public class Candidato extends Conta{
	
	private int idade;
	private String cpf;
	private String genero;
	private Date dataNasc;
	
	
	//Construtor
	public Candidato(int id, String login, String pwd, String email, String celular, int idade, String cpf) {
		super(id, login, pwd, email, celular);
		this.setIdade(idade);
		this.setCpf(cpf);
	}
	
	
	//Getters e Setters
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
