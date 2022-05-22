package projeto;

import java.util.ArrayList;

public class PropostaEmprego {
	
	private int idProposta;
	private int idEmpresa;
	private String nomeCargo;
	private String descritivo;
	private double salario;
	private String local;
	private ArrayList<Integer> idHabilidade = new ArrayList<Integer>();
	private ArrayList<Integer> idCandidatos = new ArrayList<Integer>();
	private boolean status;
	
	
	//Construtor parâmetrizado
	//id habilidades deve receber o id das habilidades necessárias
	public PropostaEmprego(int idProposta, int idEmpresa, String nomeCargo, String descritivo, double salario, String local, ArrayList<Integer> skills) {
		this.setIdProposta(idProposta);
		this.setIdEmpresa(idEmpresa);
		this.setNomeCargo(nomeCargo);
		this.setDescritivo(descritivo);
		this.setSalario(salario);
		this.setLocal(local);
		this.setIdHabilidade(skills);
		this.setStatus(true);
	}
	
	//Cadastro de usuários
	public void candidatar(int idCandidato) {
		this.getIdCandidatos().add(idCandidato);
	}
	
	
	//Fechamento da vaga
	public void fecharProposta() {
		this.setStatus(false);
	}
	
	
	//Getters e Setters
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


	public ArrayList<Integer> getIdHabilidade() {
		return idHabilidade;
	}


	public void setIdHabilidade(ArrayList<Integer> idHabilidade) {
		this.idHabilidade = idHabilidade;
	}


	public ArrayList<Integer> getIdCandidatos() {
		return idCandidatos;
	}


	public void setIdCandidatos(ArrayList<Integer> idCandidatos) {
		this.idCandidatos = idCandidatos;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

	
	

	
	

}
