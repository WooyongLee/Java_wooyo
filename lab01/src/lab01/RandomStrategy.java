package lab01;

import java.util.Random;

// ������ �������� ������ �� ���� �����ϴ� ������ �����ϴ� Ŭ����
public class RandomStrategy implements PlayingStrategy {
	public HandType nextHand() {
		int random = (int ) (Math.random() * 2); // 0, 1, 2 �����Բ�
		return HandType.valueOf(random);
	} // ���� ���� �����Ͽ� �� ���� ���� ���� �� ���� �����Ͽ� ��ȯ��.
	
	public void recordHistory(ResultType currResult) {};
	// �� �޼ҵ�� ������. �� �������� �ʿ����
}
