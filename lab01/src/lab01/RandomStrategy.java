package lab01;
// 무조건 랜덤으로 다음에 낼 손을 결정하는 전략을 구현하는 클래스
public class RandomStrategy implements PlayingStrategy{
	public HandType nextHand() {
		
	} // 랜덤 수를 생성하여 그 값에 따라 다음 낼 손을 생성하여 반환함.
	// HandType의 valueOf(int) 메소드를 활용하면 편리함

	public void recordHistory(ResultType currResult) {};
	// 빈 메소드로 구현함. 이 전략에서 필요없음
}
