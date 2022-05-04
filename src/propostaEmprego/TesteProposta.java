package propostaEmprego;

import java.util.Arrays;

public class TesteProposta {
	
	public static void main(String[] args) {
		PropostaEmprego p1 = new PropostaEmprego();
		
		p1.setIdHabilidade(new int []{300, 400, 200});
		System.out.println(Arrays.toString(p1.getIdHabilidade()));
		System.out.println(p1.getIdHabilidade()[0]);
		for (int i = 0; i <= 2; i++) {
			System.out.println(p1.getIdHabilidade()[i]);
		}
		
	}

}
