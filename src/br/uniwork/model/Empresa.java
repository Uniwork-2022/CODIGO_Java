package br.uniwork.model;
/**
 * Classe que abstrai Conta de empresas no sistema.
 * @author mateus-cabral
 * @version 1.0
 */
public class Empresa extends Conta{
	
	/**
	 * Nome da empresa
	 */
	private String nome;
	
	/**
	 * Segmento de atua��o da empresa
	 */
	private String segmento;
	
	/**
	 * Cnpj vinculado � empresa
	 */
	private String cnpj;
	
	/**
	 * Valor de confiabilidade da empresa
	 */
	private float trust;
	
	
	/**
	 * Construtor vazio
	 */
	public Empresa() {

	}
	
	/**
	 * Construtor par�metrizado
	 * @param nome
	 * @param id
	 * @param login
	 * @param pwd
	 * @param email
	 * @param cel
	 * @param cnpj
	 */
	public Empresa(String nome, int id, String login, String pwd, String email, String cel, String endereco, String cnpj) {
		super(nome, id, login, pwd, email, cel, endereco);
		this.setCnpj(cnpj);
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
							"CNPJ: " + this.getCnpj() + "\n" + 
							"Status: " + (this.isStatus() ? "Ativa" : "Desativada") + 
							"Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "N�o autenticado"));
		
	}
	
	/**
	 * M�todo para enviar dados pelo DAO
	 * @param empresa
	 */
	@Override
	public void cadastrarConta(Conta empresa) {
		
	}

	//Getters e Setters
	
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
	 * @return the segmento
	 */
	public String getSegmento() {
		return segmento;
	}

	/**
	 * @param segmento the segmento to set
	 */
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the trust
	 */
	public float getTrust() {
		return trust;
	}

	/**
	 * @param trust the trust to set
	 */
	public void setTrust(float trust) {
		this.trust = trust;
	}
	
	
}
