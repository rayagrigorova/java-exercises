package OOP;

import java.sql.Date;
import java.util.ArrayList;

public class Copy_17 extends Album_17 {
	private String format;
	private String ISBN;
	double price;
	
	
	Copy_17(){
		format = "";
		ISBN = "";
		price = 0;
	}
	
	Copy_17(String format, String ISBN,double price, Album_17 album ){
		super(album.getArtist(), album.getReleaseDate(),album.getName()
				,album.getGenre(),album.getLength(),album.getSongs());
		this.format = format;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getFormat() {
		return format;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setPrive(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

}
