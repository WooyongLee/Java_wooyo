import java.util.Observable;
//java.util.Observable 클래스를 상속받고 NewsPublisher 인터페이스를 구현하여 정의함
//새 뉴스가 발생하면 이를 클라이언트에게 통보하여 주는 클래스임 
public class SportsNewsPublisher extends Observable implements NewsPublisher {
	private String latestFeed;
	@Override
	public void setNewFeed(String newFeed) {
		latestFeed = newFeed;
		setChanged();
		notifyObservers(latestFeed);
	}
}
