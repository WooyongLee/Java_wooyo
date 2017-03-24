import java.util.Observable;
import java.util.Observer;

//���� �߻��� ������ �޾ƺ��� Ŭ������ 
public class NewsClient implements Observer {
	private String id;
	
	// NewsClient���� �����ڸ� �ѹ� �� ȣ���� �ݴϴ�.
	public NewsClient(String id) {
		this.id = id; // Ŭ���̾�Ʈ�� id�� ��Ÿ��.
		
	}
	// equals �޼ҵ� �����ε�
	@Override
	public boolean equals(Object o){
		if(o==null||o.getClass()!=getClass()) return false;
		if(o==this) return true; // �ּҰ� ���ٰ� �Ǹ� �׳� ���̶�� �Ѱܹ���
		NewsClient nc = (NewsClient)o;
		return id.equals(nc.id); // ��������� ���� ���Ͽ� ���� �Ǻ���
	}
	
	public void update(String data) {
		String latestFeed = data;
		System.out.printf("%s: %s\n", id, latestFeed);
		 //push������� �뺸�� ������ ȭ�鿡 �����
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
