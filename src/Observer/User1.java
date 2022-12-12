package Observer;

public class User1 extends Observer {
	public User1(String msg) {
		this.msg = msg; 
		// Observer를 상속하고 있기에
		// Observer의 필드인 msg 상속
	}
}

