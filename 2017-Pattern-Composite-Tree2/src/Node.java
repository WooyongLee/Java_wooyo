
public abstract class Node implements Iterable<Node> {
	private String name;
	public Node(String name) {
		this.name = name;
	} // 노드의 이름을 정의;
	public String toString() {
		return name;
	}
	public abstract void add(Node node); // 자식의 추가
	public abstract void remove(Node node); // 자식의 제거
	public abstract Node getChild(int index); // 특정 자식을 가져옴
}
