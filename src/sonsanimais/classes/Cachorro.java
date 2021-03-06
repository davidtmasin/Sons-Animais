package sonsanimais.classes;

public class Cachorro extends Animal implements SonografiaAnimal{

	public Cachorro(String nomePopular, String nomeCientifico, String expectativaVida, String nomeDoPet) {
		super(nomePopular, nomeCientifico, expectativaVida, nomeDoPet);
	}
	
	public String toString() {
		return "Ol?, amiguinho(a), eu me chamo " + getNomeDoPet() + ".\nPopularmente sou chamado de " + getNomePopular() + ", mas, pela ci?ncia sou conhecido como " + getNomeCientifico()
				+ ".\nPosso viver de " + getExpectativaVida();
	}
	
	public String somAnimal() {
		return "\nComo sou um cachorro, eu me comunico pelo latido.";
	}	
	
	public String onomatopeiaSomAnimal() {
		return "\nEu fa?o Au-Au!";
	}
	
}
