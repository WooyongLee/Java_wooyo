import java.util.Iterator;
import java.util.Stack;

public class TreeDFSIterator implements Iterator<Node> {
	private Stack<Iterator<Node>> stack = new Stack<>();
	// ���ÿ��� �ڽĵ��� �鰣��...?
	TreeDFSIterator(Iterator<Node> iterator) {
		stack.push(iterator); // ó���� ���� iterator�� ���ÿ��ٰ� ǥ�����ִ� ��
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if ( stack.isEmpty()) return false;
		else { // ������ ������� ������
			Iterator<Node> iterator = stack.peek();
			if ( iterator.hasNext()) return true; // ������ ������ �׳�
			else {
				stack.pop(); // ������ �ִ°� �������ֱ�
				return hasNext();
			}
		}
		// ó���� root��忡 �ִ� �ڽĵ��� �߰��߰�
	}

	@Override
	public Node next() {
		// TODO Auto-generated method stub
		Iterator<Node> iterator = stack.peek();
		Node node = iterator.next();
		if (node instanceof Composite ) { // �߰� ��尡 ���� ��� ���ÿ� �־��־�� ��
			stack.push(node.iterator());
			return next();
		}
		else // �ܸ������ ���
			return node;
		// ����Ʈ�� �ܸ��� ��쿡��
	}
	
}
