package GasStation;

import java.util.Scanner;

//======================================================

public class GasStation {

	Driver driver = new Driver();
	GasPump gasPump = new GasPump();
//	Scanner scanner = new Scanner(System.in); //클래스에 적용?
	
	public static void main(String[] args) {

		// 주유할 차종 입력받아 생성하기,
		// 생성한 차에 맞는 연료로 주유하기 (휘발유, 디젤)
		makeCar();
		refuelingCar();

		// 생성한 차 운전하기

	}

	public static void makeCar() {

		int carCount = 0;

		while (carCount < 1) {
			
			System.out.println("기름을 넣을 차종 입력하기");
			System.out.println("아반떼: 1, K3 : 2");
			System.out.println();

			Scanner scanner = new Scanner(System.in);
			int carChoice = scanner.nextInt();

			if (carChoice == 1) {
				Car car = new Avante(1, 60, 20);
				System.out.println();
				System.out.println("=== 아반떼를 뽑았습니다 ===");
				System.out.println();
			} else if (carChoice == 2) {
				Car car = new K3(2, 50, 30);
				System.out.println();
				System.out.println("=== K3를 뽑았습니다 ===");
				System.out.println();
			} else {
				System.out.println("다시 입력해 주세요");
				System.out.println();
				continue;
			}

			carCount++;

		} // while 끝

	}

	public static void refuelingCar() {
		
	}

}

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
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.nowFuel = nowFuel;
	}

	public void drive() {
		System.out.println("운전합니다");
	}

}

//======================================================

class GasPump {
	
	Scanner scanner = new Scanner(System.in);

	public int gasolineLeft = 100000;
	public int dieselLeft = 50000;

	public int gasPrice = 1700;
	public int dieselPrice = 1800;

	public GasPump() {

	}

	public int refuelingGas(Driver driver) {
		System.out.println("휘발유 주유");
		System.out.println("몇 리터를 넣으시겠습니까");
		int payMoney = scanner.nextInt();
		return (this.gasolineLeft - (driver.balance / gasPrice));
	}

	public int refuelingDiesel(Driver driver) {
		System.out.println("디젤 주유");
		System.out.println("몇 리터를 넣으시겠습니까");
		int payMoney = scanner.nextInt();
		return (this.dieselLeft - (driver.balance / dieselPrice));
	}
}

//======================================================
