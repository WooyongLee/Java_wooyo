
public class Door {
	private final DoorState openedState = new Opened();
	private final DoorState closedState = new Closed();
	private final DoorState lockedState = new Locked();
	private DoorState currentState = closedState;
	// changeTo 메소드들 삭제
	
	// boolean 타입으로 반환된 값으로
	// open, close, lock 각각의 메소드 안의
	// if문을 통해 문의 열림, 닫힘, 잠김상태를 제어한다. 
	public void open(){
		if ( currentState.open() )
			currentState = openedState;
	}
	public void close(){
		if ( currentState.close())
			currentState = closedState;
	}
	public void lock(){
		if ( currentState.lock())
			currentState = lockedState;
	}
	public void unlock(){
		if ( currentState.unlock())
			currentState = closedState;
	}
}
