package sonsanimais.classes;

public abstract class Animal {
	
	private String nomePopular;
	private String nomeCientifico;
	private String expectativaVida;
	private String nomeDoPet;
	
	public Animal(String nomePopular, String nomeCientifico, String expectativaVida, String nomeDoPet) {
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
		this.expectativaVida = expectativaVida;
		this.nomeDoPet = nomeDoPet;
	}

	public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getExpectativaVida() {
		return expectativaVida;
	}

	public void setExpectativaVida(String expectativaVida) {
		this.expectativaVida = expectativaVida;
	}
	
	
	public String getNomeDoPet() {
		return nomeDoPet;
	}

	public void setNomeDoPet(String nomeDoPet) {
		this.nomeDoPet = nomeDoPet;
	}

	public abstract String toString();
	

}
