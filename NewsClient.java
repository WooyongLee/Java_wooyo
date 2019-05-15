package lab02;

import java.util.Observable;
import java.util.Observer;

// 새로 발생된 뉴스를 받아보는 클래스임 
public class NewsClient {
	String id; // 클라이언트의 id를 나타냄. 
	public NewsClient(String id) {
		this.id = id;
	}
	
	public boolean equals(Object o ) { // o가 엉뚱한 값이 오더라도 논리적으로 아무런 값이 이상ㅁㄴ어리너ㅣㅇ;ㄹ
		if ( o == null || o.getClass() != getClass()) return false;
		if ( o == this) return true; // 주소가 같다고 되면 그냥 참이라고 넘겨버림
		NewsClient nc = (NewsClient)o;
		return id.equals(nc.id); // 멤버변수를 각각 비교하여 참을 판별함
	}

	public void update(Observable subject, Object data) {
		String latestFeed = (String)data;
		System.out.printf("%s : %s\n", id, latestFeed);
		 // • 사후조건: push방식으로 통보된 뉴스를 화면에 출력함
	}
}

// 바뀌었습니다
// !!!!!!!!!!!!!!
// 아아아아아아
