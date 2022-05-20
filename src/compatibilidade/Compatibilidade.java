package compatibilidade;

import java.util.ArrayList;

public class Compatibilidade {
	
	private int idProposta;
	private int idConta;
	private float compatibilidade;
	
	
	//Construtor
	public Compatibilidade(int idProposta, int idUser) {
		this.setIdConta(idUser);
		this.setIdProposta(idProposta);
	}
	
	
	// Calculando a compatibilidade entre o usuário e a vaga
	public void compatibilidade(ArrayList<Integer> skillsCandidato, ArrayList<Integer> skillsProposta) {
		float compat = 0;
		int valor = (1 / skillsProposta.size());
		
		for(int i : skillsProposta) {
			for(int c : skillsCandidato) {
				if(skillsCandidato.get(c) == skillsProposta.get(i)) {
					compat += valor;
				}
			}
		}
		this.setCompatibilidade(compat);;
	}
	
	
	//Getters e Setters
	public long getIdProposta() {
		return idProposta;
	}

	public void setIdProposta(int idProposta) {
		this.idProposta = idProposta;
	}

	public long getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public float getCompatibilidade() {
		return compatibilidade;
	}

	public void setCompatibilidade(float compatibilidade) {
		this.compatibilidade = compatibilidade;
	}
	
	
	
}
