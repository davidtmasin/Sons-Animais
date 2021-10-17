package sonsanimais.classes;

public class Cachorro extends Animal implements SonografiaAnimal{

	private String nomeDoPet;
	
	public Cachorro(String nomePopular, String nomeCientifico, String expectativaVida, String nomeDoPet) {
		super(nomePopular, nomeCientifico, expectativaVida);
		this.nomeDoPet = nomeDoPet;
	}
	
	public String toString() {
		return "Olá, amiguinho(a), eu me chamo " + nomeDoPet + ".\nNome popular: " + getNomePopular() + "\nNome científico: " + getNomeCientifico()
				+ "\nExpectativa de vida: " + getExpectativaVida();
	}

	public String getNomeDoPet() {
		return nomeDoPet;
	}

	public void setNomeDoPet(String nomeDoPet) {
		this.nomeDoPet = nomeDoPet;
	}
	
	public String somAnimal() {
		return "\nComo sou um cachorro, eu me comunico pelo latido.";
	}	
	
	public String onomatopeiaSomAnimal() {
		return "\nEu faço Au-Au!";
	}
	
}
