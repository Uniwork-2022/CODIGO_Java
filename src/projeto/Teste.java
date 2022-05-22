package projeto;

import java.util.ArrayList;

public class Teste {
	
	private int idTeste;
	private String nome;
	private String tipoTestes;
	public ArrayList<String> perguntas = new ArrayList<String>();
	public ArrayList<Integer> idUser = new ArrayList<Integer>();
	public ArrayList<Boolean> userResposta = new ArrayList<Boolean>();
	
	
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
			
		}else {
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
	public long getIdTeste() {
		return idTeste;
	}
	
	public void setIdTeste(int idTeste) {
		this.idTeste = idTeste;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipoTestes() {
		return tipoTestes;
	}
	
	public void setTipoTestes(String tipoTestes) {
		this.tipoTestes = tipoTestes;
	}
	
	public ArrayList<String> getPerguntas() {
		return perguntas;
	}
	
	public void setPerguntas(ArrayList<String> perguntas) {
		this.perguntas = perguntas;
	}
	
	public ArrayList<Integer> getIdUser() {
		return idUser;
	}
	
	public void setIdUser(ArrayList<Integer> idUser) {
		this.idUser = idUser;
	}
	
	public ArrayList<Boolean> getUserResposta() {
		return userResposta;
	}
	
	public void setUserResposta(ArrayList<Boolean> userResposta) {
		this.userResposta = userResposta;
	}	
}

