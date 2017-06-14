import java.util.Iterator;

public abstract class TreeNode implements Iterable<TreeNode>{
	private String name;
	public TreeNode(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void add(TreeNode node) {
		throw new UnsupportedOperationException();
	}
	public void remove(TreeNode node) {
		throw new UnsupportedOperationException();
	}
	public TreeNode getChild(int index) {
		throw new UnsupportedOperationException();
	}
	public int numberOfChilds(){
		return 0;
	}
	@Override
	public boolean equals(Object o){
		if(o==null||o.getClass()!=getClass()) return false;
		if(this==o) return true;
		TreeNode node = (TreeNode)o;
		return node.name.equals(name);
	}
	public TreeNode getRearranged(){
		throw new UnsupportedOperationException();
	}
	public Iterator<TreeNode> iterator() {
		return new NullIterator();
	}
}