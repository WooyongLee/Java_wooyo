package lab01;

public enum HandType {
	GAWI {
		public String toString() { return "����"; }
		
		public static HandType valueOf(int n) { // n�� 0, 1 �Ǵ� 2 �� �ϳ��̾�� ��. ���������� �˻����� �ʾƵ� ��
			switch (n) {
			case 0 : return GAWI;
			case 1 : return BAWI;
			case 2 : return BO;
			}
		} // �־��� n�� �ش�Ǵ� ������ ���� ��ȯ��. 
		
		public HandType winValueOf() {
			return BAWI; // ������ �̱� �� �ִ� ���� ����
		} // ���� ���� �̱� �� �ִ� ������ ���� ��ȯ��.
	},
	BAWI {
		public String toString() { return "����"; }
		
		public static HandType valueOf(int n) { // n�� 0, 1 �Ǵ� 2 �� �ϳ��̾�� ��. ���������� �˻����� �ʾƵ� ��
			switch (n) {
			case 0 : return GAWI;
			case 1 : return BAWI;
			case 2 : return BO;
			}
		} // �־��� n�� �ش�Ǵ� ������ ���� ��ȯ��. 
		
		public HandType winValueOf() {
			return BO; // ������ �̱� �� �ִ� ���� ��
		} // ���� ���� �̱� �� �ִ� ������ ���� ��ȯ��.
	},
	BO {
		public String toString() { return "��"; }
		
		public static HandType valueOf(int n) { // n�� 0, 1 �Ǵ� 2 �� �ϳ��̾�� ��. ���������� �˻����� �ʾƵ� ��
			switch (n) {
			case 0 : return GAWI;
			case 1 : return BAWI;
			case 2 : return BO;
			}
		} // �־��� n�� �ش�Ǵ� ������ ���� ��ȯ��. 
		
		public HandType winValueOf() {
			return GAWI; // ���� �̱� �� �ִ� ���� ����
		} // ���� ���� �̱� �� �ִ� ������ ���� ��ȯ��.		
	};
}
