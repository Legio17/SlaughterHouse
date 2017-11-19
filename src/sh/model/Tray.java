package sh.model;

import java.util.ArrayList;

public class Tray {
	private String typePart;
	private double capacity;
	private int trayNumber;
	private ArrayList<Part> listOfParts;
	
	public Tray(String typePart, double capacity, int trayNumber) {
		this.typePart = typePart;
		this.capacity = capacity;
		this.trayNumber = trayNumber;
		this.listOfParts = new ArrayList<Part>();
	}
	
	public Tray() {
		this.listOfParts = new ArrayList<Part>();
	}

	public String getTypePart() {
		return typePart;
	}

	public void setTypePart(String typePart) {
		this.typePart = typePart;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getTrayNumber() {
		return trayNumber;
	}

	public void setTrayNumber(int trayNumber) {
		this.trayNumber = trayNumber;
	}
	
	public double getCapacityLeft() {
		return capacity;
	}
	
	public void addPartToTray(Part part) {
		listOfParts.add(part);
	}
	
	public ArrayList<Part> getPartsInTray() {
		return listOfParts;
	}
	
	/*public Part takePartFromTray() {
		int lastIndex = listOfParts.size() - 1; // last index of item
		return listOfParts.remove(lastIndex);
	}*/
	
	
}
