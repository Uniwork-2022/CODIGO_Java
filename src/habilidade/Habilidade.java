package habilidade;

public class Habilidade {
	
	private int id;
	private String nome;
	private String descricao;
	private String tipo;
	
	
	//Construtor
	public Habilidade(int id, String nome, String descricao, String tipo) {
		this.setDescricao(descricao);
		this.setId(id);
		this.setNome(nome);
		this.setTipo(tipo);
	}
	
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

}
