import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends Node{
	private ArrayList<Node> childs = new ArrayList<>(); 
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Node node) {
		// TODO Auto-generated method stub
		childs.add(node);
	}

	@Override
	public void remove(Node node) {
		// TODO Auto-generated method stub
		childs.remove(node);
	}

	@Override
	public Node getChild(int index) {
		// TODO Auto-generated method stub
		if (index >= 0 && index < childs.size())
			return childs.get(index);
		else
			throw new IllegalArgumentException();
	}

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return new TreeDFSIterator(childs.iterator());
	}
}
