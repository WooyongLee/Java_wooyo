import java.util.Observable;
//java.util.Observable Ŭ������ ��ӹް� NewsPublisher �������̽��� �����Ͽ� ������
//�� ������ �߻��ϸ� �̸� Ŭ���̾�Ʈ���� �뺸�Ͽ� �ִ� Ŭ������ 
public class SportsNewsPublisher extends Observable implements NewsPublisher {
	private String latestFeed;
	@Override
	public void setNewFeed(String newFeed) {
		latestFeed = newFeed;
		setChanged();
		notifyObservers(latestFeed);
	}
}
