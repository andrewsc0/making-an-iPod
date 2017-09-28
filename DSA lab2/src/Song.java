
public class Song {
	
	String name;
	String artist;
	double playtime;

	Song(String name, String artist, float playtime){
		
		this.name = name;
		this.artist = artist;
		this.playtime = playtime;
		
	}
	
	public String toString(){
		
		return getSongName() + ", " + getPlayTime() + ": " + getPlayTime();
		
	}
	
	public double getPlayTime(){
		
		return playtime;
		
	}
	
	public String getArtist(){
		
		return artist;
		
	}
	
	public String getSongName(){
		
		return name;
		
	}
	
	public boolean equals(Song s){
		
		if(s.equals(Song)){
			
			return true;
			
			
		}
		
	}
}
