package app;

import bo.couplagefaible.Musicien;
import bo.couplagefaible.Orchestre;
import bo.couplagefaible.Piano;
import bo.couplagefaible.Violon;

public class Application {
	public static void main(String[] args) {
		Orchestre orchestre = new Orchestre();
		
		Musicien pianiste = new Musicien("La 9e de Beethoven", new Piano());
		Musicien violoniste = new Musicien("La 9e de Beethoven", new Violon());
		
		orchestre.ajouter(violoniste);
		orchestre.ajouter(pianiste);
		
		orchestre.jouer();
	}
}
