package OOP;

import java.util.*;

public class Artist_17 {
	private String name;
	private Genre_17 genre;
	private ArrayList <Album_17> albums;
	private int activeFrom;
	private int activeTo;
	
	Artist_17(){
		setName("");
		setActiveFrom(0);
		setActiveTo(0);
	}
	
	Artist_17(String name,Genre_17 genre,ArrayList <Album_17> albums,int activeFrom,int activeTo ){
		this.name = name;
		this.genre = genre;
		this.albums = albums;
		this.activeFrom = activeFrom;
		this.activeTo = activeTo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre_17 getGenre() {
		return genre;
	}

	public void setGenre(Genre_17 genre) {
		this.genre = genre;
	}

	public ArrayList <Album_17> getAlbums() {
		return albums;
	}

	public void setAlbums(ArrayList <Album_17> albums) {
		this.albums = albums;
	}

	public int getActiveFrom() {
		return activeFrom;
	}

	public void setActiveFrom(int activeFrom) {
		this.activeFrom = activeFrom;
	}

	public int getActiveTo() {
		return activeTo;
	}

	public void setActiveTo(int activeTo) {
		this.activeTo = activeTo;
	}
}
