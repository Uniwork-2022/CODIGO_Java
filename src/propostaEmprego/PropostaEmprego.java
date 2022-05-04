package propostaEmprego;

public class PropostaEmprego {
	
	private int idProposta;
	private int idEmpresa;
	private String nomeCargo;
	private String descritivo;
	private double salario;
	private String local;
	private int[] idHabilidade;
	public int getIdProposta() {
		return idProposta;
	}
	public void setIdProposta(int idProposta) {
		this.idProposta = idProposta;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	public String getDescritivo() {
		return descritivo;
	}
	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int[] getIdHabilidade() {
		return idHabilidade;
	}
	
	// Uso do set com array: setIdHabilidade(new int[]{<valores>})
	public void setIdHabilidade(int[] idHabilidade) {
		this.idHabilidade = idHabilidade;
	}
	
	

}
