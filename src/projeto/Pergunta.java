package projeto;

public class Pergunta {

	private int idPergunta;
	private String descricao;
	private String tipo;
	private String[] alternativas;
	private int[] respostas;
	
	
	//Getters e Setters
	public long getIdPergunta() {
		return idPergunta;
	}
	public void setIdPergunta(int idPergunta) {
		this.idPergunta = idPergunta;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String[] getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}
	public int[] getRespostas() {
		return respostas;
	}
	public void setRespostas(int[] respostas) {
		this.respostas = respostas;
	}
	
}
