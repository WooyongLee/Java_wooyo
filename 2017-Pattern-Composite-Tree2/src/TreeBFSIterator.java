import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class TreeBFSIterator implements Iterator<Node> {
	private Queue<Iterator<Node>> queue = new ArrayDeque<>();
	// ���ÿ��� �ڽĵ��� �鰣��...?
	TreeBFSIterator(Iterator<Node> iterator) {
		queue.add(iterator); // ó���� ���� iterator�� ���ÿ��ٰ� ǥ�����ִ� ��
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if ( queue.isEmpty()) return false;
		else { // ������ ������� ������
			Iterator<Node> iterator = queue.peek();
			if ( iterator.hasNext()) return true; // ������ ������ �׳�
			else {
				queue.poll(); // ������ �ִ°� �������ֱ�
				return hasNext();
			}
		}
		// ó���� root��忡 �ִ� �ڽĵ��� �߰��߰�
	}

	@Override
	public Node next() {
		// TODO Auto-generated method stub
		Iterator<Node> iterator = queue.peek();
		Node node = iterator.next();
		if (node instanceof Composite ) { // �߰� ��尡 ���� ��� ���ÿ� �־��־�� ��
			queue.add(node.iterator());
			if ( !iterator.hasNext()) queue.poll();
			return next();
		}
		else // �ܸ������ ���
			return node;
		// ����Ʈ�� �ܸ��� ��쿡��
	}
	
}
