
import java.util.Random;

public class LastResultBasedStrategy implements PlayingStrategy {
	private static HandType prevhand = HandType.BO; // 이전에 낸 손
	private ResultType prevresult = ResultType.LOST; // 이전의 결과

	public LastResultBasedStrategy() { // 생성자에서는 지난 승패 결과에 대한 함수를 호출합니다.
		recordHistory(prevresult);
	}
	
	public HandType nextHand() {
		switch (prevresult) {
		case WON :
		case DRAWN :  // 이기거나 비긴 경우 이전꺼랑 다른 나머지 둘 중 하나 랜덤
			while ( true ) {
				Random seed = new Random();
				int random = seed.nextInt(3); // 0, 1, 2 나오게끔 조정
				 if ( HandType.valueOf(random) != prevhand ) { // 이전에 낸 손하고 다른거가 나온다면
					prevhand = HandType.valueOf(random); 
					return prevhand; // 이전과 다른 prevhand 반환
				 }
			}
		case LOST:  // 진 경우, 상대방이 한번 더 낼꺼라 생각하구 상대방의 이전꺼를 이기는 수를 둡니다.
			return prevhand.winValueOf().winValueOf(); 
		default :
			return prevhand;
		}
	} // prevHand와 prevResult를 이용하여 이 전략에 맞게 손을 결정하여 반환하여야 하며,
	// 최종 반환된 값은 다음 게임을 위해 prevHand에 대입되어야 함

	public void recordHistory(ResultType currResult) {
		this.prevresult = currResult; // 이전의 승패 결과에 대한 정보를 확보
	} 
	// 사후조건: prevResult에 주어진 인자를 대입함
}