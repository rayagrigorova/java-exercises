package OOP;

public class Song_17 {
	private double length;
	private String title;
	private Album_17 album;
	private SongLyrics_17 lyrics;
	
	Song_17(){
		setLength(0);
		setTitle("");
	}
	
	Song_17(double length, String title, Album_17 album, SongLyrics_17 lyrics){
		this.length = length;
		this.title = title;
		this.album = album;
		this.lyrics = lyrics;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SongLyrics_17 getLyrics() {
		return lyrics;
	}

	public void setLyrics(SongLyrics_17 lyrics) {
		this.lyrics = lyrics;
	}

	public Album_17 getAlbum() {
		return album;
	}

	public void setAlbum(Album_17 album) {
		this.album = album;
	}
}
