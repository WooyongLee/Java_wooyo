package lab01;

import java.util.Random;

// ������ �������� ������ �� ���� �����ϴ� ������ �����ϴ� Ŭ����
public class RandomStrategy implements PlayingStrategy {
	private HandType myhand;
	
	public HandType nextHand() {
		int random = (int ) (Math.random() * 2); // 0, 1, 2 �����Բ�
		return myhand.valueOf(random);
	} // ���� ���� �����Ͽ� �� ���� ���� ���� �� ���� �����Ͽ� ��ȯ��.
	
	public void recordHistory(ResultType currResult) {};
	// �� �޼ҵ�� ������. �� �������� �ʿ����
}
