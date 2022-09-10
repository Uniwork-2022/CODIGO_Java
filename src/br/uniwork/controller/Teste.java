package br.uniwork.controller;
/**
 * Classe que abstrai os testes (provas) que serão feitas pelo candidato
 * @author mateus-cabral
 * @version 1.0
 */
import java.util.ArrayList;

public class Teste {
	/**
	 * ID do teste no banco de dados
	 */
	private int idTeste;
	
	/**
	 * Nome do teste
	 */
	private String nome;
	
	/**
	 * Tipo/Categoria do teste
	 */
	private String tipoTestes;
	
	/**
	 * Lista de perguntas do teste
	 */
	public ArrayList<String> perguntas = new ArrayList<String>();
	
	/**
	 * Lista de Usuários que fizeram o teste
	 */
	public ArrayList<Integer> idUser = new ArrayList<Integer>();
	
	/**
	 * Lista de respostas de um candidato
	 */
	public ArrayList<Boolean> userResposta = new ArrayList<Boolean>();
	
	/**
	 * Construtor vazio
	 */
	public Teste() {
		
	}
	
	/**
	 * Construtor parâmetrizado
	 * @param id
	 * @param nome
	 */
	public Teste(int id, String nome) {
		this.setIdTeste(id);
		this.setNome(nome);
	}
	
	
	//Adiciona o acerto ou erro do usuário à uma lista
	public void responder(int respostaUser, int resposta) {
		boolean certo;
		if (respostaUser == resposta) {
			certo = true;
			this.getUserResposta().add(certo);
			System.out.println("Correto");
			
		} else {
			certo = false;
			this.getUserResposta().add(certo);
			System.out.println("Errado");
		}
	}
	
	
	// Cadastro de usuarios
	public void cadastrarUser(int idUser) {
		this.getIdUser().add(idUser);
	}
	
	
	// Cadastro de perguntas
	public void cadastrarPergunta(String idPergunta) {
		this.getPerguntas().add(idPergunta);
	}
	

	// Calcula a nota baseado na lista de respostas
	public float calcularNota() {
		float nota = 0;
		float valor = 10 / this.getPerguntas().size();
		for (int i = 0; i < this.getUserResposta().size();i++) {
			if(this.getUserResposta().get(i)) {
				nota += valor;
			}
		}
		return nota;
	}

	
	//Getters e Setters
	
	/**
	 * @return the idTeste
	 */
	public int getIdTeste() {
		return idTeste;
	}

	/**
	 * @param idTeste the idTeste to set
	 */
	public void setIdTeste(int idTeste) {
		this.idTeste = idTeste;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tipoTestes
	 */
	public String getTipoTestes() {
		return tipoTestes;
	}

	/**
	 * @param tipoTestes the tipoTestes to set
	 */
	public void setTipoTestes(String tipoTestes) {
		this.tipoTestes = tipoTestes;
	}

	/**
	 * @return the perguntas
	 */
	public ArrayList<String> getPerguntas() {
		return perguntas;
	}

	/**
	 * @param perguntas the perguntas to set
	 */
	public void setPerguntas(ArrayList<String> perguntas) {
		this.perguntas = perguntas;
	}

	/**
	 * @return the idUser
	 */
	public ArrayList<Integer> getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(ArrayList<Integer> idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the userResposta
	 */
	public ArrayList<Boolean> getUserResposta() {
		return userResposta;
	}

	/**
	 * @param userResposta the userResposta to set
	 */
	public void setUserResposta(ArrayList<Boolean> userResposta) {
		this.userResposta = userResposta;
	}
	

}

