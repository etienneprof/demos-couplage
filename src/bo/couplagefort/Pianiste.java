package bo.couplagefort;

public class Pianiste {
	public String morceau;
	public Piano piano;
	
	public Pianiste(String morceau, Piano piano) {
		super();
		this.morceau = morceau;
		this.piano = piano;
	}
	
	public void jouer() {
		piano.afficher();
		System.out.print(" et je joue le morceau : " + morceau);
		piano.jouer();
	}
}
