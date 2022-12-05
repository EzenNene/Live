package Lamda;

public class LamdaEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.run((a, b) -> {
			int result = a + b;
			return result;
		});

		car.run((a, b) -> a + b);
	}

}
