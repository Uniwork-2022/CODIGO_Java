package br.uniwork.model.bo;

import br.uniwork.model.vo.TesteVO;

public class TesteBO {
	
	private TesteVO t;
	
	// Calcula a nota baseado na lista de respostas
	public float calcularNota() {
		float nota = 0;
		float valor = 10 / t.getPerguntas().size();
		for(Boolean r : t.getUserResposta()) {
			if(r) {
				nota+= valor;
			}
		}
		return nota;
	}

}
