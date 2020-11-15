package OOP;

import java.util.ArrayList;

public class Genre_17 {
	private String name;
	private Artist_17 firstArtist;
	private ArrayList <String> commonInstruments;
	private Album_17 firstAlbum;
	
	Genre_17(){
		setName("");
	}
	
	Genre_17(String name, Artist_17 firstArtist, ArrayList <String> commonInstruments, Album_17 firstAlbum){
		this.setName(name);
		this.setFirstArtist(firstArtist);
		this.setCommonInstruments(commonInstruments);
		this.setFirstAlbum(firstAlbum);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist_17 getFirstArtist() {
		return firstArtist;
	}

	public void setFirstArtist(Artist_17 firstArtist) {
		this.firstArtist = firstArtist;
	}

	public ArrayList <String> getCommonInstruments() {
		return commonInstruments;
	}

	public void setCommonInstruments(ArrayList <String> commonInstruments) {
		this.commonInstruments = commonInstruments;
	}

	public Album_17 getFirstAlbum() {
		return firstAlbum;
	}

	public void setFirstAlbum(Album_17 firstAlbum) {
		this.firstAlbum = firstAlbum;
	}
}
