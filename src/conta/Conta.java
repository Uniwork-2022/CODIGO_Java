package conta;

public abstract class Conta {
	
	private long id;
	private String login;
	private String pwd;
	private String email;
	private long celular;
	private boolean statusEmail;
	private boolean status;
	
	
	//Construtor parâmetrizado
	public Conta(String login, String pwd, String email, long cel) {
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
		}
	}
	
	
	//Alteração de senha
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
	
	
	//Login e Logout
	public boolean login(String login, String pwd) {
		
		boolean verificado = false;
		
		if(this.getLogin() == login) {
			verificado = true;
		}	else {
			verificado = false;
		}
		
		return verificado;
	}
	
	public boolean logout() {
		return true;
	}
	
	
	//Getters e Setters
	public void getStatusConta() {
		System.out.println("Login: " + this.getLogin() + "    " + "Senha: " + this.getPwd() + "\n" + "idConta: " + this.getId() + 
				"    " + "Email: " + this.getEmail() + "\n" + "Status: " + (this.isStatus() ? "Ativa" : "Desativada" ));
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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


	public long getCelular() {
		return celular;
	}


	public void setCelular(long celular) {
		this.celular = celular;
	}

}
