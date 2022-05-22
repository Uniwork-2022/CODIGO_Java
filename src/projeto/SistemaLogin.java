package projeto;

public class SistemaLogin {

	private int id;
	private boolean status;
	private String login;
	private String pwd;
	
	//construtor
	public SistemaLogin() {
		
	}

	//Login e Logout
	public void login(String login, String pwd) {
		boolean verificado;
		
		if(this.getLogin().equals(login) && this.getPwd().equals(pwd)) {
			verificado = true;
			System.out.println("Você está Logado.");
		}else {
			verificado = false;	
			System.out.println("Credenciais incorretas, tente novamente.");
		}
			
		this.setStatus(verificado);
	}
	
	public void logout() {
		this.setStatus(false);
	}


	//Getters e Setters
	public boolean isStatus() {
		return status;

	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
