package lab01;

import java.util.Random;

// 무조건 랜덤으로 다음에 낼 손을 결정하는 전략을 구현하는 클래스
public class RandomStrategy implements PlayingStrategy {
	private HandType myhand;
	
	public HandType nextHand() {
		int random = (int ) (Math.random() * 2); // 0, 1, 2 나오게끔
		return myhand.valueOf(random);
	} // 랜덤 수를 생성하여 그 값에 따라 다음 낼 손을 생성하여 반환함.
	
	public void recordHistory(ResultType currResult) {};
	// 빈 메소드로 구현함. 이 전략에서 필요없음
}
