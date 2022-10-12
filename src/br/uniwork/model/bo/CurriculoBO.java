package br.uniwork.model.bo;

import br.uniwork.model.vo.CurriculoVO;
import br.uniwork.model.vo.HabilidadeVO;

public class CurriculoBO {
	
	private CurriculoVO cv;

	/**
	 * Adiciona uma habilidade
	 * @param idHabilidade
	 */
	public void addHabilidade(HabilidadeVO h) {
		cv.getHabilidades().add(h);
	}
	
}
