
public class Closed implements DoorState {
	@Override
	public boolean open() {
		System.out.println("문이 열림");
		// 상태변화 (->열림)
		return true;
	}

	@Override
	public boolean close() {
		System.out.println("문이 이미 닫혀 있음");
		return false;
	}

	@Override
	public boolean lock() {
		System.out.println("문이 잠김");
		// 상태변화 (->잠김)
		return true;
	}

	@Override
	public boolean unlock() {
		System.out.println("문이 잠겨 있지 않음");
		return false;
	}

}
