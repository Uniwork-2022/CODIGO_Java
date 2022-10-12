package br.uniwork.model.bo;

import java.util.ArrayList;

import br.uniwork.model.vo.CompatibilidadeVO;

public class CompatibilidadeBO {
	private CompatibilidadeVO cp;
	
	// Calculando a compatibilidade entre o usuário e a vaga
		public void compatibilidade(ArrayList<Integer> skillsCandidato, ArrayList<Integer> skillsProposta) {
			float compat = 0;
			float valor = (100 / skillsProposta.size());		
			for (Integer i : skillsProposta) {
				for (Integer i2 : skillsCandidato) {
					if(i == i2) {
						compat = compat + valor;
					}
				}
			}
			
			cp.setCompatibilidade(compat);;
		}

}
