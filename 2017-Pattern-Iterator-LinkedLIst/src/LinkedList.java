import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList<T> implements Iterable<T> {
	private static class Node<T>{
		public T item;
		public Node<T> next = null;
	}
	//노드 내부클래스로 정의
	private class LinkedListIterator implements ListIterator<T>{
		private Node<T> curr = head;
		private Node<T> prev = null; // 두개의 포인터를 사용하게끔, 이전노드 현재노드
	//	private Node<T> prevprev = null;
		public boolean isIllegalState = true;
		
		@Override
		public boolean hasNext() {
			return curr != null; // 노드의 마지막일 경우
			/*
			 *  if ( curr == null ) return false;
			 *  else return true;
			 */
		}

		@Override
		public T next() {
			T item = curr.item;
			prev = curr; // 이전노드를 세팅
			curr = curr.next;
			isIllegalState = false;
			return item;
			// 기본적으로 현재 가지고 있는 아이템을 옮겨놓고
			// 다음에꺼를 옮겨놓고
			// 저장해둔 데이를 반환해주면 된다.
		}

		@Override
		public boolean hasPrevious() {
			throw new UnsupportedOperationException();
		}

		@Override
		public T previous() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int nextIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int previousIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove(){
			if ( head != null ) { // 공백 리스트 예외처리
				if ( prev == head) { // 첫 번째 노드를 삭제할 경우
					head = curr.next;
				}
				prev.next = curr.next;
				
				size--;
				isIllegalState = true; // 다음연산 Set 못하도록 막기
			}
		}

		@Override
		public void set(T item) {
			// illegal state인지 아닌지를 판단해야 할 필요가 있겠음
			// add, remove 호출 후
			if ( isIllegalState /* == true */ )
				throw new IllegalStateException();
			
			// next 호출 후
			// T item을 바꾸라는 법(prev의 item)
			else
				prev.item = item;
		}
 
		@Override
		public void add(T item) {
			Node<T> newNode = new Node<>(); // 템플릿으로 생성하였음
			System.out.println("add()");
			newNode.item = item;
			if (prev == null )  { // 첫번쨰 노드 생성할 경우
				head = newNode;	// head 를 지정
			}
			else {
				prev.next = newNode;
			}
			newNode.next = curr;
			// prevprev = prev;
			prev = newNode;
			size++;
			// 새로운 노드를 생성하여 값과 포인터를 집어넣음
			// prev와 curr의 next를 지정해줌
			
			isIllegalState = true; // 다음연산 Set 못하도록 막기
		}
	}
	public Node<T> head = null;
	public int size = 0;
	public boolean isEmpty(){
		return head==null;
	}
	public void add(T item){
		Node<T> newNode = new Node();
		newNode.item = item; // 데이터를 집어넣음
		newNode.next = head;
		head = newNode;
		++size; // 사이즈를 늘려주게 됨
	}
	public T remove(){
		if(isEmpty()) throw new IllegalStateException();
		T item = head.item;
		head = head.next;
		return item;
	}
	public String toString(){
		ArrayList<T> tmp = new ArrayList<>();
		// Iterator�쓽 hasNext�� next媛� �셿�꽦�릺�뼱�빞 �젙�긽 �룞�옉�븿
		for(T t: this)
			tmp.add(t);
		return tmp.toString();
	}
	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}
	public ListIterator<T> listIterator() {
		return new LinkedListIterator();
	}
}
