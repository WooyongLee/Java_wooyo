
// 가위바위보 게임에서 각 사용자 또는 컴퓨터 역할을 수행
public class Player {
	private int[] resultCount = new int[3];
	private PlayingStrategy strategy;
	
	public Player(PlayingStrategy strategy) {
		setStrategy(strategy);
	} // 주어진 전략으로 내부 상태 strategy를 초기화함

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
	 } // 주어진 전략으로 내부 상태 strategy를 변경함

	 public HandType nextHand() {
		 return strategy.nextHand();
	 } // strategy의 nextHand를 호출하여 다음 가위바위보 값을 반환함

	 public String toString() {
		 return "게임수 : " + getGameCount() + " 승수 : " +  resultCount[0] + " 패수 : " + resultCount[2];
	 } // 현재 게임 진행 상태를 보여줌(게임수, 승수, 패수)
	 
	 public int getGameCount() {
			int sum = 0;
			for(int i: resultCount) sum += i;
			return sum; 
	 }
}

