package GasStation;

public class Avante extends Car {
	

	public Avante (int fuelType, int fuelCapacity, int nowFuel) {
		super(fuelType, fuelCapacity, nowFuel);
	}
	
	@Override
	public void drive() {
		System.out.println("아반떼를 운전");
	}
	
	@Override
	public String toString() {
		return "Avante";
	}
	
	
}
