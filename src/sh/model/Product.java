package sh.model;

import java.util.ArrayList;

public class Product {
	private int productRegNr;
	private ArrayList<Tray> trays;
	
	public Product(int productRegNr) {
		this.productRegNr = productRegNr;
		this.trays = new ArrayList<Tray>(); // Is it okay to keep Array of Objects instead of ints?
	}
	
	public Product() {
		this.trays = new ArrayList<Tray>();
	}

	public int getProductRegNr() {
		return productRegNr;
	}

	public void setProductRegNr(int productRegNr) {
		this.productRegNr = productRegNr;
	}
	
	public ArrayList<Tray> getTraysIncluded() {
		return trays;
	}
	
	public void includeTray(Tray tray) {
		trays.add(tray); // Do we need to include tray or it is just some kind of overhead?
	}
	
	/*public Part addPartFromTray(Tray tray) {
		for(int i = 0; i < trays.size(); i++) {
			if(trays.get(i) == tray) {
				return trays.get(i).takePartFromTray();
			}
		}
		
		return null;
	}*/
	
	
	
	
	
}
