package lab02;

import java.util.Observable;
import java.util.Observer;

//Subject 인터페이스를 상속받아 정의함 
public interface NewsPublisher extends Subject {
	public void setNewFeed(String newFeed);
}
