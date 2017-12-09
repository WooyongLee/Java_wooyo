import java.util.Iterator;
import java.util.Stack;

public class TreeDFSIterator implements Iterator<Node> {
	private Stack<Iterator<Node>> stack = new Stack<>();
	// 스택에는 자식들이 들간다...?
	TreeDFSIterator(Iterator<Node> iterator) {
		stack.push(iterator); // 처음에 받은 iterator를 스택에다가 표시해주는 것
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if ( stack.isEmpty()) return false;
		else { // 스택이 비어있지 않으면
			Iterator<Node> iterator = stack.peek();
			if ( iterator.hasNext()) return true; // 다음이 있으면 그냥
			else {
				stack.pop(); // 맨위에 있는거 제거해주기
				return hasNext();
			}
		}
		// 처음에 root노드에 있는 자식들을 추가했고여
	}

	@Override
	public Node next() {
		// TODO Auto-generated method stub
		Iterator<Node> iterator = stack.peek();
		Node node = iterator.next();
		if (node instanceof Composite ) { // 중간 노드가 있을 경우 스택에 넣어주어야 함
			stack.push(node.iterator());
			return next();
		}
		else // 단말노드일 경우
			return node;
		// 리스트가 단말일 경우에만
	}
	
}
