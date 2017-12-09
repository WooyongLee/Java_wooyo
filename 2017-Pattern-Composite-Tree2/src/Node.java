
public abstract class Node implements Iterable<Node> {
	private String name;
	public Node(String name) {
		this.name = name;
	} // ����� �̸��� ����;
	public String toString() {
		return name;
	}
	public abstract void add(Node node); // �ڽ��� �߰�
	public abstract void remove(Node node); // �ڽ��� ����
	public abstract Node getChild(int index); // Ư�� �ڽ��� ������
}
