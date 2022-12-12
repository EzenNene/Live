package Observer;

public class Main {

	public static void main(String[] args) {
		Notice notice = new Notice();
		User1 user1 = new User1("유저1");
		User2 user2 = new User2("유저2");
		
		// 공지사항 받을 유저 추가
		notice.attach(user1);
		notice.attach(user2);
		
		String msg = "공지사항입니다";
		
		// 모든 옵저버에게 공지사항 전파
		notice.notifyObservers(msg);
		
		notice.detach(user1); // user1 공지사항 받는 대상에서 제거
		msg = "안녕하세요";
		notice.notifyObservers(msg);
	}

}
