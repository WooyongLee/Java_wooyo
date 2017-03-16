package lab01;

import java.util.Set;

// ���������� ���ӿ��� �� ����� �Ǵ� ��ǻ�� ������ ����
public class Player {
	private int wonCount;
	private int drawnCount;
	private int lossCount;
	
	private static int gameCount = 0;
	private PlayingStrategy strategy;
	
	public Player(PlayingStrategy strategy) {
		setStrategy(strategy);
	} // �־��� �������� ���� ���� strategy�� �ʱ�ȭ��

	 public void setResult(ResultType resultType) {
		 
	 } // �־��� ���� �̿��Ͽ� �����ϰ� gameInfo �迭�� ������
	 
	 public void setStrategy(PlayingStrategy strategy) {
		 this.strategy = strategy;
	 } // �־��� �������� ���� ���� strategy�� ������

	 public HandType nextHand() {
		 HandType nexthand;
		 
		 return nexthand;
	 } // strategy�� nextHand�� ȣ���Ͽ� ���� ���������� ���� ��ȯ��

	 public String toString() {
		 return "���Ӽ� : " + gameCount + "�¼� : " +  wonCount + "�м� : " + lossCount;
	 } // ���� ���� ���� ���¸� ������(���Ӽ�, �¼�, �м�)
	 
	    
	    
	 public int getGameCount() {
		 return gameCount;   
	 }
	 
	 public void setGameCount(int gameCount) {
		 this.gameCount = gameCount;
	 }
}

