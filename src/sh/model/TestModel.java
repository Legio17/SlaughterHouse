package sh.model;

public class TestModel {

	public static void main(String[] args) {
		
		Animal animal = new Animal(1, 55.5, "cow");
		Part part = new Part(1, 22.2, "leg", 1);
		Tray tray = new Tray("legs", 100.0, 1);
		Product product = new Product(1);
		
		tray.addPartToTray(part);
		
		
		product.includeTray(tray);
		//System.out.println(product.addPartFromTray(tray));
		

	}

}
