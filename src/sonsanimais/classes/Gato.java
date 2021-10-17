package sonsanimais.classes;

public class Gato extends Animal implements SonografiaAnimal{
	
	public Gato(String nomePopular, String nomeCientifico, String expectativaVida, String nomeDoPet) {
		super(nomePopular, nomeCientifico, expectativaVida, nomeDoPet);
	}
	
	public String toString() {
		return "Olá, amiguinho(a), eu me chamo " + getNomeDoPet() + ".\nPopularmente sou chamado de " + getNomePopular() + ", mas, pela ciência sou conhecido como " + getNomeCientifico()
				+ ".\nPosso viver de " + getExpectativaVida();
	}
	
	public String somAnimal() {
		return "\nComo sou um gato, eu me comunico pelo miado.";
	}	
	
	public String onomatopeiaSomAnimal() {
		return "\nEu faço Miau!";
	}
	
}