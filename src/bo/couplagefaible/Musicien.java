package bo.couplagefaible;

public class Musicien {
	public String morceau;
	public Instrument instrument;
	
	public Musicien() {}
	
	public Musicien(String morceau, Instrument instrument) {
		super();
		this.morceau = morceau;
		this.instrument = instrument;
	}
	
	public void jouer() {
		instrument.afficher();
		System.out.print(" et je joue le morceau : " + morceau);
		instrument.jouer();
	}

	public String getMorceau() {
		return morceau;
	}

	public void setMorceau(String morceau) {
		this.morceau = morceau;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
