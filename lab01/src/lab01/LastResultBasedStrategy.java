package lab01;

public class LastResultBasedStrategy implements PlayingStrategy{
/*
 	- 이긴 경우: 같은 손을 다시 내지 않을 것이라고 가정하고 그것을 제외한 나머지 두 종류 중 하나를
	랜덤하게 결정함
	– 비긴 경우: 이긴 경우와 동일하게 처리함	
	– 진 경우: 상대방이 같은 손을 낼 것이라고 가정하고 그것을 이길 수 있는 손으로 결정함
 */
	
	public HandType nextHand() {
		
	} // prevHand와 prevResult를 이용하여 이 전략에 맞게 손을 결정하여 반환하여야 하며,
	// 최종 반환된 값은 다음 게임을 위해 prevHand에 대입되어야 함

	public void recordHistory(ResultType currResult) { 
		
		
	} // currResult: 지난 게임의 승,무,패 결과
	// 사전조건: result가 null이 아니어야 함. 이 사전조건은 고려할 필요없음
	// 사후조건: prevResult에 주어진 인자를 대입함


	
}

