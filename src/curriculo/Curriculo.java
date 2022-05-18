package curriculo;

import java.util.ArrayList;

import candidato.Candidato;

public class Curriculo extends Candidato{

	private ArrayList<Integer> habilidades = new ArrayList<Integer>();
	
	public Curriculo(String login, String pwd, String email, long celular, int idade, String cpf) {
		super(login, pwd, email, celular, idade, cpf);
	}

	
	//Adicionar habilidades
	public void addHabilidade(int idHabilidade) {
		this.getHabilidades().add(idHabilidade);
	}
	
	
	public ArrayList<Integer> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<Integer> habilidades) {
		this.habilidades = habilidades;
	}
	
	
	
}
