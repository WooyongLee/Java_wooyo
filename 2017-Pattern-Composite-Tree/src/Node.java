
public abstract class Node {
	private String name;
	public Node(String name) {
		this.name = name;
	} // ����� �̸��� ����
	public abstract void add(Node node); // �ڽ��� �߰�
	public abstract void remove(Node node); // �ڽ��� ����
	public abstract Node getChild(int index); // Ư�� �ڽ��� ������
}
