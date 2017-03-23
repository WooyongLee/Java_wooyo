package lab02;

import java.util.Observable;
import java.util.Observer;

// java.util.Observable Ŭ������ ��ӹް� NewsPublisher �������̽��� �����Ͽ� ������
// �� ������ �߻��ϸ� �̸� Ŭ���̾�Ʈ���� �뺸�Ͽ� �ִ� Ŭ������ 
public class SportsNewsPublisher extends Observable implements NewsPublisher {
	private String latestFeed;

	public void setNewFeed(String newFeed) {
		latestFeed = newFeed;
		setChanged();
		notifyObservers(latestFeed);
	}
	
		
}