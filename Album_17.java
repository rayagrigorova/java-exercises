package OOP;

import java.sql.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Album_17 {
	private Artist_17 artist;
	private Date releaseDate;
	private String name;
	private Genre_17 genre;
	private double length;
	private ArrayList <Song_17> songs;
	
	Album_17(){
		setName("");
		setLength(0);
	}
	
	Album_17(Artist_17 artist,Date releaseDate,String name,Genre_17 genre,double length,ArrayList <Song_17> songs){
		this.artist = artist;
		this.releaseDate = releaseDate;
		this.name= name;
		this.genre = genre;
		this.length = length;
		this.songs = songs; 
	}

	public Artist_17 getArtist() {
		return artist;
	}

	public void setArtist(Artist_17 artist) {
		this.artist = artist;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(long l) {
		this.releaseDate = new Date(l);
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public ArrayList <Song_17> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList <Song_17> songs) {
		this.songs = songs;
	}
	
	
}
