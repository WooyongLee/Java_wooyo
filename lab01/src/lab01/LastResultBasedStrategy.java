
import java.util.Random;

public class LastResultBasedStrategy implements PlayingStrategy {
	private static HandType prevhand = HandType.BO; // ������ �� ��
	private ResultType prevresult = ResultType.LOST; // ������ ���

	public LastResultBasedStrategy() { // �����ڿ����� ���� ���� ����� ���� �Լ��� ȣ���մϴ�.
		recordHistory(prevresult);
	}
	
	public HandType nextHand() {
		switch (prevresult) {
		case WON :
		case DRAWN :  // �̱�ų� ��� ��� �������� �ٸ� ������ �� �� �ϳ� ����
			while ( true ) {
				Random seed = new Random();
				int random = seed.nextInt(3); // 0, 1, 2 �����Բ� ����
				 if ( HandType.valueOf(random) != prevhand ) { // ������ �� ���ϰ� �ٸ��Ű� ���´ٸ�
					prevhand = HandType.valueOf(random); 
					return prevhand; // ������ �ٸ� prevhand ��ȯ
				 }
			}
		case LOST:  // �� ���, ������ �ѹ� �� ������ �����ϱ� ������ �������� �̱�� ���� �Ӵϴ�.
			return prevhand.winValueOf().winValueOf(); 
		default :
			return prevhand;
		}
	} // prevHand�� prevResult�� �̿��Ͽ� �� ������ �°� ���� �����Ͽ� ��ȯ�Ͽ��� �ϸ�,
	// ���� ��ȯ�� ���� ���� ������ ���� prevHand�� ���ԵǾ�� ��

	public void recordHistory(ResultType currResult) {
		this.prevresult = currResult; // ������ ���� ����� ���� ������ Ȯ��
	} 
	// ��������: prevResult�� �־��� ���ڸ� ������
}