package OOP;

public class Song_17 {
	private double length;
	private String title;
	private SongLyrics_17 lyrics;
	
	Song_17(){
		setLength(0);
		setTitle("");
	}
	
	Song_17(double length, String title, SongLyrics_17 lyrics){
		this.length = length;
		this.title = title;
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
}
