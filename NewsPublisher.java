package lab02;

import java.util.Observable;
import java.util.Observer;

//Subject �������̽��� ��ӹ޾� ������ 
public interface NewsPublisher extends Subject {
	public void setNewFeed(String newFeed);
}
