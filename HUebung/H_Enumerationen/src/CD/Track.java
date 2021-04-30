/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

/**
 *
 * @author Markus
 */
public class Track {
	int trackno;
	String artist;
	String title;
	double playtime;
	Genre genre;

	public int getTrackno() {
		return trackno;
	}

	public String getArtist() {
		return artist;
	}

	public String getTitle() {
		return title;
	}

	public double getPlaytime() {
		return playtime;
	}

	public Genre getGenre() {
		return genre;
	}

	public Track(int trackno, String artist, String title, double playtime) {
		this.trackno = trackno;
		this.artist = artist;
		this.title = title;
		this.playtime = playtime;
	}

	@Override
	public String toString() {
		return "Track{" + "trackno=" + trackno + ", artist=" + artist + ", title=" + title + ", playtime=" + playtime + '}';
	}
	
}
