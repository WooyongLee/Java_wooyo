
public interface PlayingStrategy {
	HandType nextHand();
	// ���� ���������� ���� �����Ͽ� �ִ� �޼ҵ�
	
	void recordHistory(ResultType currResult);
	 //  ���� ���������� ���� �����ϱ� ���� �����ϴ� ��
	 // �ҵ�� ���� ������ ���(��, ��, �� ����)�� ���ڷ� ���޹���
}
