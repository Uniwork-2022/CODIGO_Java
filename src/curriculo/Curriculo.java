package curriculo;

import java.util.ArrayList;

public class Curriculo{

	private int id;
	private ArrayList<Integer> habilidades = new ArrayList<Integer>();
	
	
	public Curriculo(int id) {
		this.setId(id);
	}
	
	
	//Adicionar habilidades
	public void addHabilidade(int idHabilidade) {
		this.getHabilidades().add(idHabilidade);
	}
	
	
	//Verifica a existência da habilidade
	public boolean verifica(int idHabilidade) {
		boolean verificado = false;
		for(int element : this.getHabilidades()) {
			if(idHabilidade == element) {
				verificado = true;
			}
		}
		return verificado;
	}
	
	
	//Getters e Setters
	public ArrayList<Integer> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<Integer> habilidades) {
		this.habilidades = habilidades;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
