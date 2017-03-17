
public interface PlayingStrategy {
	HandType nextHand();
	// 다음 가위바위보 값을 결정하여 주는 메소드
	
	void recordHistory(ResultType currResult);
	 //  다음 가위바위보 값을 결정하기 위해 보조하는 메
	 // 소드로 지난 게임의 결과(승, 무, 패 여부)를 인자로 전달받음
}
