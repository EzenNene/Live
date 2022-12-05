package GasStation;

public class K3 extends Car {


	public K3(int fuelType, int fuelCapacity, int nowFuel) {
		super(fuelType, fuelCapacity, nowFuel);
	}
	
	@Override
	public void drive() {
		System.out.println("K3를 운전");
	}
	
}
