package lab01;
// 가위바위보 게임에서 각 사용자 또는 컴퓨터 역할을 수행
public class Player implements PlayingStrategy {
	private int wonCount;
	private int drawnCount;
	private int lossCount;
	
	private static int gameCount = 0;
	
	public Player(PlayingStrategy strategy) {
		strategy 
	} // 주어진 전략으로 내부 상태 strategy를 초기화함

	 public void setResult(ResultType resultType) {
		 
	 } // 주어진 값을 이용하여 적절하게 gameInfo 배열을 갱신함
	 
	 public void setStrategy(PlayingStrategy strategy) {
		 
	 } // 주어진 전략으로 내부 상태 strategy를 변경함

	 public HandType nextHand() {
 
	 } // strategy의 nextHand를 호출하여 다음 가위바위보 값을 반환함

	 public String toString() {
		 
	 } // 현재 게임 진행 상태를 보여줌(게임수, 승수, 패수)
}

