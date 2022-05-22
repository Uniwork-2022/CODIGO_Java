package projeto;

import java.util.Date;

public class Candidato extends Conta{
	
	private int idade;
	private String cpf;
	private String genero;
	private Date dataNasc;
	
	
	//Construtor
	public Candidato(String nome, int id, String login, String pwd, String email, String celular, int idade, String cpf) {
		super(nome, id, login, pwd, email, celular);
		this.setIdade(idade);
		this.setCpf(cpf);
	}
	
	
	//Getters e Setters
	@Override
	public void getStatusConta() {
		System.out.println("Nome: " + this.getNome() + "    " + "Celular: " + this.getCelular() + "\nLogin: " + this.getLogin() + "    " + "Senha: " + this.getPwd() + "\n" + "ID: " + this.getId() + 
							"    " + "Email: " + this.getEmail() + "\n" + "CPF: " + this.getCpf() + "\n" + 
							"Status: " + (this.isStatus() ? "Ativa" : "Desativada"));
		System.out.println("Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "Não autenticado"));
		System.out.println();
		
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
