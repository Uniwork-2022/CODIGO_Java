package projeto;
/**
 * @author mateus-cabral
 * @version 1.0
 */
public abstract class Conta {
	
	private String nome;
	private int id;
	private String login;
	private String pwd;
	private String email;
	private String celular;
	private boolean statusEmail;
	private boolean status;
	
	
	//Construtor parâmetrizado
	public Conta(String nome, int id, String login, String pwd, String email, String cel) {
		this.setNome(nome);
		this.setId(id);
		this.setLogin(login);
		this.setPwd(pwd);
		this.setEmail(email);
		this.setCelular(cel);
		this.setStatus(true);
		this.setStatusEmail(false);
	}
	
	
	//Verificação de email - só será autenticado caso a conta esteja ativa
	public void autenticarEmail() {
		if(this.isStatus()) {
			if(this.isStatusEmail()) {
				System.out.println("Erro: Conta já autenticada");
			}	else   {
				this.setStatusEmail(true);
			}
		}	else  {
			System.out.println("Erro: Conta Desativada");
		}
		
	}
	
	
	//Fechamento de Conta
	public void fecharConta(String login, String pwd) {
		if(this.getLogin() == login && this.getPwd() == pwd){
			this.setStatus(false);
		}	else {
			System.out.println("Credenciais inválidas");
		}
	}
	
	
	//Alteração e reset de senha
	public void resetSenha() {
		if(this.isStatus()) {
			this.setPwd("Padrao");
		}   else  {
			System.out.println("Erro: Conta Desativada");
		}
		
	};
	
	public void alterarSenha(String novaPwd) {
		if(this.isStatus()) {
			this.setPwd(novaPwd);
		}	else {
			System.out.println("Erro: Conta Desativada");
		}
		
	};
	
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(boolean statusEmail) {
		this.statusEmail = statusEmail;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
