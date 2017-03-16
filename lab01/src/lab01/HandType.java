package lab01;

public enum HandType {
	GAWI {
		public String toString() { return "가위"; }
		
		public static HandType valueOf(int n) { // n은 0, 1 또는 2 중 하나이어야 함. 사전조건을 검사하지 않아도 됨
			switch (n) {
			case 0 : return GAWI;
			case 1 : return BAWI;
			case 2 : return BO;
			}
		} // 주어진 n에 해당되는 열거형 값을 반환함. 
		
		public HandType winValueOf() {
			return BAWI; // 가위를 이길 수 있는 것은 바위
		} // 현재 값을 이길 수 있는 열거형 값을 반환함.
	},
	BAWI {
		public String toString() { return "바위"; }
		
		public static HandType valueOf(int n) { // n은 0, 1 또는 2 중 하나이어야 함. 사전조건을 검사하지 않아도 됨
			switch (n) {
			case 0 : return GAWI;
			case 1 : return BAWI;
			case 2 : return BO;
			}
		} // 주어진 n에 해당되는 열거형 값을 반환함. 
		
		public HandType winValueOf() {
			return BO; // 바위를 이길 수 있는 것은 보
		} // 현재 값을 이길 수 있는 열거형 값을 반환함.
	},
	BO {
		public String toString() { return "보"; }
		
		public static HandType valueOf(int n) { // n은 0, 1 또는 2 중 하나이어야 함. 사전조건을 검사하지 않아도 됨
			switch (n) {
			case 0 : return GAWI;
			case 1 : return BAWI;
			case 2 : return BO;
			}
		} // 주어진 n에 해당되는 열거형 값을 반환함. 
		
		public HandType winValueOf() {
			return GAWI; // 보를 이길 수 있는 것은 가위
		} // 현재 값을 이길 수 있는 열거형 값을 반환함.		
	};
}
