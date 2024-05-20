//Evelyn Sun
//115417946
import java.util.ArrayList;

public class Song implements Comparable <Song> {
	private String songName;
	private String artistName;
	private String duration;
	
	public Song (String songName, String artistName, String duration) {
		this.songName=songName;
		this.artistName=artistName;
		this.duration=duration;
	}
	
	public String getSongName() {
		return songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public String getDuration() {
		return duration;
	}
	public int compareTo(Song other) {
		int c= this.songName.compareTo(other.songName);
		if (c==0) {
			return this.artistName.compareTo(other.artistName);
		} else {
			return c;
		}
		
	}
	public String toString() {
		return songName+" by " + artistName + " (" + duration +")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
