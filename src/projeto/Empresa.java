package projeto;

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
	public void getStatusConta() {
		System.out.println("Nome: " + this.getNome() + "    " + "Celular: " + this.getCelular() + "\nLogin: " + this.getLogin() + "    " + "Senha: " + this.getPwd() + "\n" + "ID: " + this.getId() + 
				"    " + "Email: " + this.getEmail() + "\n" + "CNPJ: " + this.getCnpj() + "\n" + 
				"Status: " + (this.isStatus() ? "Ativa" : "Desativada"));
		System.out.println("Status Email: " + (this.isStatusEmail() ? "Autenticado" :  "Não autenticado"));
		System.out.println();
		
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
