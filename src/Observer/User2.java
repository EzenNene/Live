package Observer;

public class User2 extends Observer {
	public User2(String msg) {
		this.msg = msg;
		// Observer를 상속하고 있기에
		// Observer의 필드인 msg 상속
	}
}
