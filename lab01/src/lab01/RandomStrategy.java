
import java.util.Random;

// ������ �������� ������ �� ���� �����ϴ� ������ �����ϴ� Ŭ����
public class RandomStrategy implements PlayingStrategy {
	private Random seed = new Random();
	public HandType nextHand() {
		int random = seed.nextInt(3); // 0, 1, 2 �����Բ�
		return HandType.valueOf(random);
	} // ���� ���� �����Ͽ� �� ���� ���� ���� �� ���� �����Ͽ� ��ȯ��.
	
	public void recordHistory(ResultType currResult) {};
	// �� �޼ҵ�� ������. �� �������� �ʿ����
}
