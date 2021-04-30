/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

import htl.Out;

/**
 *
 * @author Markus
 */
public class CD {

	String Artist;
	String Title;
	Track[] Tracklist;
	int sum;

	public CD() {

	}

	public CD(String Artist, String Title, Track[] Tracklist) {
		this.Artist = Artist;
		this.Title = Title;
		this.Tracklist = new Track[4];
	}

	public void add(Track[] Tracklist) {


	}

	public void print(Track[] Tracklist) {
		for (int i = 0; i < Tracklist.length; i++) {
			Out.println(Tracklist[i].toString());
		}
	}

	public int sumPlaytime(Track[] Tracklist, int sum) {

		for (int i = 0; i < Tracklist.length; i++) {
			sum += Tracklist[i-1].getPlaytime();
		}
		return sum;
	}

}
