package lab01;
// ���������� ���ӿ��� �� ����� �Ǵ� ��ǻ�� ������ ����
public class Player implements PlayingStrategy {
	private int wonCount;
	private int drawnCount;
	private int lossCount;
	
	private static int gameCount = 0;
	
	public Player(PlayingStrategy strategy) {
		strategy 
	} // �־��� �������� ���� ���� strategy�� �ʱ�ȭ��

	 public void setResult(ResultType resultType) {
		 
	 } // �־��� ���� �̿��Ͽ� �����ϰ� gameInfo �迭�� ������
	 
	 public void setStrategy(PlayingStrategy strategy) {
		 
	 } // �־��� �������� ���� ���� strategy�� ������

	 public HandType nextHand() {
 
	 } // strategy�� nextHand�� ȣ���Ͽ� ���� ���������� ���� ��ȯ��

	 public String toString() {
		 
	 } // ���� ���� ���� ���¸� ������(���Ӽ�, �¼�, �м�)
}

