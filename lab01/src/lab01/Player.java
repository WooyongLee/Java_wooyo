
// ���������� ���ӿ��� �� ����� �Ǵ� ��ǻ�� ������ ����
public class Player {
	private int[] resultCount = new int[3];
	private PlayingStrategy strategy;
	
	public Player(PlayingStrategy strategy) {
		setStrategy(strategy);
	} // �־��� �������� ���� ���� strategy�� �ʱ�ȭ��

	 public void setResult(ResultType resultType) {
		 // ++gameCount;
		 ++resultCount[resultType.ordinal()];
		 switch (resultType) {
		 case WON :
			 strategy.recordHistory(ResultType.WON);
			 break;
		 case DRAWN :
			 strategy.recordHistory(ResultType.DRAWN);
			 break;
		 case LOST :
			 strategy.recordHistory(ResultType.LOST);
			 break;
		 default : break;
		 }
	 } 
	 
	 public void setStrategy(PlayingStrategy strategy) {
		 this.strategy = strategy;
	 } // �־��� �������� ���� ���� strategy�� ������

	 public HandType nextHand() {
		 return strategy.nextHand();
	 } // strategy�� nextHand�� ȣ���Ͽ� ���� ���������� ���� ��ȯ��

	 public String toString() {
		 return "���Ӽ� : " + getGameCount() + " �¼� : " +  resultCount[0] + " �м� : " + resultCount[2];
	 } // ���� ���� ���� ���¸� ������(���Ӽ�, �¼�, �м�)
	 
	 public int getGameCount() {
			int sum = 0;
			for(int i: resultCount) sum += i;
			return sum; 
	 }
}

