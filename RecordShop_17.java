package OOP;

import java.util.ArrayList;

public class RecordShop_17 {
	private String name;
	private ArrayList <Copy_17> VHS_tapes;
	private ArrayList <Copy_17> CDs;
	private ArrayList <Copy_17> vinyls;
	private String address;

	
	public RecordShop_17(){
		name = "";
		address = "";
	}
	
	public RecordShop_17(String name, ArrayList <Copy_17> VHS_tapes, ArrayList <Copy_17> CDs, ArrayList <Copy_17> vinyls, String address) {
		this.name = name;
		this.VHS_tapes = VHS_tapes;
		this.CDs = CDs;
		this.vinyls = vinyls;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void addVHS(Copy_17 cp) {
		VHS_tapes.add(cp);
	}
	
	public void addCD(Copy_17 cp) {
		CDs.add(cp);
	}
	
	public void addVinyl(Copy_17 cp) {
		vinyls.add(cp);
	}
	
	public ArrayList<Copy_17> getCDs() {
		return this.CDs;
	}
	
	public ArrayList<Copy_17> getVHS_tapes() {
		return this.VHS_tapes;
	}
	
	public ArrayList<Copy_17> getVinyls() {
		return this.vinyls;
	}
	

}
