package OOP;

import java.sql.Date;
import java.util.ArrayList;

public class Copy_17 {
	private String format;
	private String ISBN;
	private RecordShop_17 recordShop;
	double price;
	Album_17 album;
	
	
	Copy_17(){
		format = "";
		ISBN = "";
		price = 0;
	}
	
	Copy_17(String format, String ISBN,RecordShop_17 recordShop,double price, Album_17 album ){
		this.format = format;
		this.ISBN = ISBN;
		this.setRecordShop(recordShop);
		this.price = price;
		this.album = album;
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
	
	public void setAlbum(Album_17 album) {
		this.album = album;
	}
	
	public Album_17 getAlbum() {
		return this.album;
	}

	public RecordShop_17 getRecordShop() {
		return recordShop;
	}

	public void setRecordShop(RecordShop_17 recordShop) {
		this.recordShop = recordShop;
	}
}
