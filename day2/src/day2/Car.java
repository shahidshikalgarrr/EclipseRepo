package day2;

public class Car {
	
	private String model;
	private String[] features;
	
	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for(String f: features)
			System.out.println(f);
	}
	
	public static void main(String args[]) {
		
		Car P = new Car("Comfortable", "Super", "Fast" , "Manual");
		P.specs();
	}
}

