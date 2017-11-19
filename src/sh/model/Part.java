package sh.model;

public class Part {
	
	private int partRegNr;
	private double weight;
	private String type;
	private int animalRegNr;
	
	public Part(int partRegNr, double weight, String type, int animalRegNr){
		this.partRegNr = partRegNr;
		this.weight = weight;
		this.type = type;
		this.animalRegNr = animalRegNr;
	}

	public int getPartRegNr() {
		return partRegNr;
	}

	public void setPartRegNr(int partRegNr) {
		this.partRegNr = partRegNr;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAnimalRegNr() {
		return animalRegNr;
	}

	public void setAnimalRegNr(int animalRegNr) {
		this.animalRegNr = animalRegNr;
	}
	
	public String toString() {
		return "Part: " + partRegNr;
	}
	
	

}
