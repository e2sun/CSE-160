//Evelyn Sun
//115417946
import java.util.ArrayList;
import java.util.*;


public class Playlist {
	private  String title;
	private  ArrayList<Song>Songs = new ArrayList<>();
	public Playlist(String title) {
		this.title=title;
	}
	public Playlist(String title, ArrayList<Song>Songs) {
		this.title=title;
		this.Songs=Songs;
	}
	public String getTitle() {
		return title;
	}
	public ArrayList<Song> getSongs(){
		return Songs;
	}
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void addSong(Song s) {
		if (!Songs.contains(s)) {
			Songs.add(s);
		}
	}
	public void removeSong(String title) {
		for (int i=0;i<Songs.size();i++) {
			if (title.equals(Songs.get(i).getSongName())){
				Songs.remove(i);
			}
			
		}
	}
	public void swapSongs(Song song1, Song song2) {
		if (Songs.contains(song1)&&Songs.contains(song2)) {
			int song1index = Songs.indexOf(song1);
			int song2index=Songs.indexOf(song2);
			
			Songs.set(song1index, song2);
			Songs.set(song2index, song1);

			
			
		}
		
	}
	public String getTotalTimeDuration() {
		int total=0;
		int min=0;
		int seconds=0;
		for (int i=0;i<Songs.size();i++) {
			String [] arr = Songs.get(i).getDuration().split(":");;
			min = Integer.parseInt(arr[0]);
			seconds = Integer.parseInt(arr[1]);
			total+=min*60+seconds;
			
		}
		int minutes=total/60;
		int sec = total%60;
		return minutes + " min, "+ sec + " sec";
	}
	public void sortSongs() {
		for (int i=1;i<Songs.size()-1;i++) {
			if (Songs.get(i).compareTo(Songs.get(i+1))==0) {
				Collections.sort(Songs);
			}
			else {
			Collections.sort(Songs);
				}
		}
	}
	public String toString() {
		String s="";
		s+=title + " - " + getTotalTimeDuration() + "\n";
		for (int i=0;i<Songs.size();i++) {
			s+=i+1 + ". " + Songs.get(i).getSongName() + " by " + Songs.get(i).getArtistName() + " ("+ Songs.get(i).getDuration()  +")"+  "\n";
		}
		return s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
