package bo.couplagefaible;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
	private List<Musicien> musiciens;
	
	public Orchestre() {
		musiciens = new ArrayList<>();
	}
	
	public void ajouter(Musicien musicien) {
		musiciens.add(musicien);
	}
	
	public void jouer() {
		for (Musicien current : musiciens) {
			current.jouer();
		}
	}

	public List<Musicien> getMusiciens() {
		return musiciens;
	}

	public void setMusiciens(List<Musicien> musiciens) {
		this.musiciens = musiciens;
	}
}
