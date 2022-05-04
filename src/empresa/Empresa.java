package empresa;

public class Empresa {
	
	private int idEmpresa;
	private String nome;
	private String segmento;
	private String login;
	private String pwd;
	private String celular;
	private String email;
	private long cnpj;
	private float trust;
	
	public Empresa() {
		
	}
	
	public Empresa(int id, String nome, String segmento, long cnpj) {
		this.idEmpresa = id;
		this.nome = nome;
		this.segmento = segmento;
		
	}
	
	public boolean cadastroConta(String nome, String senha) {
		this.nome = nome;
		this.pwd = senha;
		
		return true;
	}
	
	// Cadastrar proposta será movida para a classe Propostas
	// Método "cadastrar contato" será adicionado
	
	public void cadastroContato(String celular, String email) {
		this.celular = celular;
		this.email = email;
		
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
