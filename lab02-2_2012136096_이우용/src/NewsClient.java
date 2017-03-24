import java.util.Observable;
import java.util.Observer;

//새로 발생된 뉴스를 받아보는 클래스임 
public class NewsClient implements Observer {
	private String id;
	
	// NewsClient에서 생성자를 한번 더 호출해 줍니다.
	public NewsClient(String id) {
		this.id = id; // 클라이언트의 id를 나타냄.
		
	}
	// equals 메소드 오버로드
	@Override
	public boolean equals(Object o){
		if(o==null||o.getClass()!=getClass()) return false;
		if(o==this) return true; // 주소가 같다고 되면 그냥 참이라고 넘겨버림
		NewsClient nc = (NewsClient)o;
		return id.equals(nc.id); // 멤버변수를 각각 비교하여 참을 판별함
	}
	
	public void update(String data) {
		String latestFeed = data;
		System.out.printf("%s: %s\n", id, latestFeed);
		 //push방식으로 통보된 뉴스를 화면에 출력함
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
