class Vehicle {

	int numberWeels;
	String engineName;
	int enginePower;
	int gearsNumber;

	public Vehicle() {} // generated for free
	public Vehicle(int numberWeels, String engineName, int enginePower, int gearsNumber) {
		this.numberWeels = numberWeels;
		this.engineName = engineName;
		this.enginePower = enginePower;
		this.gearsNumber = gearsNumber;
	}

	public void getVehiculeDetails() {
		System.out.println(String.format("number of weels: %s\nengine name: %s\nengine power: %s\nnumber of gears %s",
		numberWeels, engineName, enginePower, gearsNumber)); 
	}
}

class Truck extends Vehicle {
	int loadSupported;
	public Truck() {} // generated for free
	public Truck(int numberWeels, String engineName, int enginePower, int gearsNumber, int loadSupported) {
		super(numberWeels, engineName, enginePower, gearsNumber);
		this.loadSupported = loadSupported;
	}

	//overriding
	public void getVehiculeDetails() {
		super.getVehiculeDetails();
		System.out.println(String.format("supported load: %s", loadSupported));
	}
}

public class Inheritance {
  public static void main(String[] args) {
		Truck truck = new Truck(10, "D7F", 100, 12, 1200);
		truck.getVehiculeDetails();
  }
}