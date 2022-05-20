package empresa;

import conta.Conta;

public class Empresa extends Conta{
	
	private String nome;
	private String segmento;
	private long cnpj;
	private float trust;
	
	
	//Construtor
	public Empresa(int id, String login, String pwd, String email, String cel, long cnpj) {
		super(id, login, pwd, email, cel);
		this.setCnpj(cnpj);
	}
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}


	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public float getTrust() {
		return trust;
	}

	public void setTrust(float trust) {
		this.trust = trust;
	}



	

}
