package ArrayListEx;
import java.util.ArrayList;

public class ArrayListEx {

	// 제너릭으로 정의된 배열
	public static ArrayList<Integer> arrList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		arrList.add(40);
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
		
		for(int arr : arrList) {
			System.out.println(arr);
		}
	}

}
