package Observer;

public class Observer {
	public String msg;
	
	// receive 함수를 가져다 쓰면 
	// 기존 유저든, 새로만들어진 유저든 공지사항을 받을 수 있다
	public void receive(String msg) {
		System.out.println(this.msg + "에서 메시지를 받음: " + msg);
	}
}


