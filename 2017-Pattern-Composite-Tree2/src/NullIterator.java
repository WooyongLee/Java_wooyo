import java.util.Iterator;

public class NullIterator<E> implements Iterator<E>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
// 더미객체 정의
	
	
}
