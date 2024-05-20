//Evelyn Sun
//115417946
import java.util.ArrayList;

public class User {
	private String username;
	private ArrayList<Playlist> Playlists = new ArrayList<>();
	
	public User(String username) {
		this.username=username;
	}
	public User(String username, ArrayList<Playlist>Playlists) {
		this.username=username;
		this.Playlists=Playlists;
	}
	
	public String getUsername() {
		return username;
	}
	public ArrayList<Playlist> getPlaylists(){
		return Playlists;
	}
	public void addPlaylist(Playlist p) {
		Playlists.add(p);
	}
	public void removePlaylists(String title) {
		for (int i=0;i<Playlists.size();i++) {
			if (title.equals(Playlists.get(i).getTitle()));
				Playlists.remove(i);
			}
			
		}
	
	public Playlist getPlaylist(String title) {
		for (int i=0;i<Playlists.size();i++) {
			if (title.equals(Playlists.get(i).getTitle()))
				return Playlists.get(i);
			}
			
		
		return null;
	}
	
	public void makeCollaborativePlaylist(String playlistTitle, User friend) {
		for (int i=0;i<Playlists.size();i++) {
			if (Playlists.get(i).getTitle().equals(playlistTitle)){
				friend.addPlaylist(Playlists.get(i));
			
		}
		
			
		}
	}
	
	
	
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
