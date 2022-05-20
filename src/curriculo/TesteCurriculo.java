package curriculo;

public class TesteCurriculo {

	public static void main(String[] args) {
		Curriculo teste = new Curriculo(01);
		teste.addHabilidade(12);
		teste.addHabilidade(31);
		teste.addHabilidade(2);
		System.out.println(teste.getHabilidades());
		if(teste.verifica(42)) {
			System.out.println("Existe");
		}	else {
			System.out.println("Não existe");
		}
		
	}

}
