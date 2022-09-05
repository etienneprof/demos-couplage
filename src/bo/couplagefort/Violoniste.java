package bo.couplagefort;

public class Violoniste {
	public String morceau;
	public Violon violon;
	
	public Violoniste(String morceau, Violon violon) {
		super();
		this.morceau = morceau;
		this.violon = violon;
	}

	public void jouer() {
		violon.afficher();
		System.out.print(" et je joue le morceau : " + morceau);
		violon.jouer();
	}
}
