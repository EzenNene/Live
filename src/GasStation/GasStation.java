package GasStation;

import java.util.Scanner;

//======================================================

class Driver {
	
	public int balance = 200000;
	public Driver() {
		
	}
	
}

//======================================================

class Car {
	
	public int fuelType;
	public int fuelCapacity;
	public int nowFuel;
	
	public Car(int fuelType, int fuelCapacity, int nowFuel) {
		
	}
	
	public void drive() {
		
	}
}

//======================================================

class GasPump {
	
	public int gasolineLeft = 100000;
	public int dieselLeft = 50000;
	
	public int gasPrice = 1700;
	public int dieselPrice = 1800;
	
	public GasPump () {

	}
	
	public void refueling() {
		
	}
	
}

//======================================================

public class GasStation {
		
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		// 주유할 차종 입력받아 생성하기
		Scanner scanner = new Scanner(System.in);
		int carChoice = scanner.nextInt();
		
		if(carChoice == 1) {
			Car avante = new Avante(1, 60, 20);						
		} else if (carChoice == 2) {
			Car k3 = new K3(2, 50, 30);			
		}
		
		
		GasPump gaspump = new GasPump();

		GasPump.refueling();
		Car.drive();

	}

}
