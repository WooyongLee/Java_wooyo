import java.util.Iterator;

public class Leaf extends Node {

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Node node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Node node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	@Override
	public Node getChild(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
		// ���̻� Ž�� �� �ʿ䰡 ����. 
	}

}
