import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class TreeBFSIterator implements Iterator<Node> {
	private Queue<Iterator<Node>> queue = new ArrayDeque<>();
	// 스택에는 자식들이 들간다...?
	TreeBFSIterator(Iterator<Node> iterator) {
		queue.add(iterator); // 처음에 받은 iterator를 스택에다가 표시해주는 것
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if ( queue.isEmpty()) return false;
		else { // 스택이 비어있지 않으면
			Iterator<Node> iterator = queue.peek();
			if ( iterator.hasNext()) return true; // 다음이 있으면 그냥
			else {
				queue.poll(); // 맨위에 있는거 제거해주기
				return hasNext();
			}
		}
		// 처음에 root노드에 있는 자식들을 추가했고여
	}

	@Override
	public Node next() {
		// TODO Auto-generated method stub
		Iterator<Node> iterator = queue.peek();
		Node node = iterator.next();
		if (node instanceof Composite ) { // 중간 노드가 있을 경우 스택에 넣어주어야 함
			queue.add(node.iterator());
			if ( !iterator.hasNext()) queue.poll();
			return next();
		}
		else // 단말노드일 경우
			return node;
		// 리스트가 단말일 경우에만
	}
	
}
