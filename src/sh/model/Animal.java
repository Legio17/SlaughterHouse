package sh.model;

public class Animal {
	
	private int animalRegNr;
	private double weight;
	private String specie;
	
	public Animal(int animalRegNr, double weight, String specie) {
		this.animalRegNr = animalRegNr;
		this.weight = weight;
		this.specie = specie;
	}

	public int getAnimalRegNr() {
		return animalRegNr;
	}

	public void setAnimalRegNr(int animalRegNr) {
		this.animalRegNr = animalRegNr;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	

}
