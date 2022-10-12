package br.uniwork.model.vo;
/**
 * Perguntas que ser�o utilizadas na classe teste.
 * @author mateus-cabral
 * @version 1.0
 */
public class PerguntaVO {

	/**
	 * Id da pergunta no banco de dados
	 */
	private int idPergunta;

	/**
	 * Descri��o da pergunta
	 */
	private String descricao;

	/**
	 * Tipo/Categoria da pergunta
	 */
	private String tipo;

	/**
	 * Lista de perguntas
	 */
	private String[] alternativas;

	/**
	 * Lista com as respostas corretas
	 */
	private int[] respostas;

	public PerguntaVO() {
		
	}
	
	/**
	 * Construtor par�metrizado
	 * @param idPergunta int
	 * @param descricao String
	 * @param tipo String
	 * @param alternativas String[]
	 * @param respostas int[]
	 */
	public PerguntaVO(int idPergunta, String descricao, String tipo, String[] alternativas, int[] respostas) {
		super();
		this.idPergunta = idPergunta;
		this.descricao = descricao;
		this.tipo = tipo;
		this.alternativas = alternativas;
		this.respostas = respostas;
	}

	/**
	 * M�todo para enviar dados pelo DAO
	 * @param pergunta
	 */
	public void cadastrarPergunta(PerguntaVO pergunta) {
		
	}

	//Getters e Setters
	
	/**
	 * @return the idPergunta
	 */
	public int getIdPergunta() {
		return idPergunta;
	}

	/**
	 * @param idPergunta the idPergunta to set
	 */
	public void setIdPergunta(int idPergunta) {
		this.idPergunta = idPergunta;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the alternativas
	 */
	public String[] getAlternativas() {
		return alternativas;
	}

	/**
	 * @param alternativas the alternativas to set
	 */
	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}

	/**
	 * @return the respostas
	 */
	public int[] getRespostas() {
		return respostas;
	}

	/**
	 * @param respostas the respostas to set
	 */
	public void setRespostas(int[] respostas) {
		this.respostas = respostas;
	}
	
}
