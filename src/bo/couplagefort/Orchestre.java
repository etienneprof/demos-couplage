package bo.couplagefort;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
	private List<Object> musiciens;
	
	public Orchestre() {
		musiciens = new ArrayList<>();
	}
	
	public void ajouter(Object musicien) {
		musiciens.add(musicien);
	}
	
	public void jouer() {
		for (Object current : musiciens) {
			if (current instanceof Pianiste) {
				((Pianiste)current).jouer();
			}
			if (current instanceof Violoniste) {
				((Violoniste)current).jouer();
			}
		}
	}
}
