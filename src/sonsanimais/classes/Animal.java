package sonsanimais.classes;

public class Animal {
	
	private String nomePopular;
	private String nomeCientifico;
	private int expectativaVida;
	
	public Animal(String nomePopular, String nomeCientifico, int expectativaVida) {
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
		this.expectativaVida = expectativaVida;
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

	public int getExpectativaVida() {
		return expectativaVida;
	}

	public void setExpectativaVida(int expectativaVida) {
		this.expectativaVida = expectativaVida;
	}
	
	

}
