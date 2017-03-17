
public enum HandType {
	GAWI {
		public String toString() { return "����"; }
		
		public HandType winValueOf() {
			return BAWI; // ������ �̱� �� �ִ� ���� ����
		} // ���� ���� �̱� �� �ִ� ������ ���� ��ȯ��.
	},
	BAWI {
		public String toString() { return "����"; }
		
		public HandType winValueOf() {
			return BO; // ������ �̱� �� �ִ� ���� ��
		} // ���� ���� �̱� �� �ִ� ������ ���� ��ȯ��.
	},
	BO {
		public String toString() { return "��"; }
		
		public HandType winValueOf() {
			return GAWI; // ���� �̱� �� �ִ� ���� ����
		} // ���� ���� �̱� �� �ִ� ������ ���� ��ȯ��.		
	};
	public abstract HandType winValueOf();
	public static HandType valueOf(int n) { // n�� 0, 1 �Ǵ� 2 �� �ϳ��̾�� ��. ���������� �˻����� �ʾƵ� ��
		return HandType.values()[n];
	}// �־��� n�� �ش�Ǵ� ������ ���� ��ȯ��. 
	
	
}
