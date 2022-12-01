package AutoBoxing_UnBoxing;

public class AutoBoxing_UnBoxing {

	public static void main(String[] args) {
//		Integer num1 = new Integer(7);
//		Integer num2 = new Integer(3);
		
		// 오토박싱 : 자동으로 기본타입의 데이터를 래퍼클래스의 인스턴스로 변환
		// new 사용안해도됨
		
		Integer num1 = 7;
		Integer num2 = 3;
		
		int int1 = num1.intValue();
		int int2 = num2.intValue();
		
		Integer result1 = num1+num2;
		Integer result2 = int1-int2;
		int result3 = num1 * int2;
				
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
