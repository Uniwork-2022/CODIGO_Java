package projeto;
/**
 * @author mateus-cabral
 * @version 1.0
 */
public class Empresa extends Conta{
	
	private String nome;
	private String segmento;
	private String cnpj;
	private float trust;
	
	
	//Construtor
	public Empresa(String nome, int id, String login, String pwd, String email, String cel, String cnpj) {
		super(nome, id, login, pwd, email, cel);
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
							"Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "Não autenticado"));
		
	}
	
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


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public float getTrust() {
		return trust;
	}

	public void setTrust(float trust) {
		this.trust = trust;
	}
}
