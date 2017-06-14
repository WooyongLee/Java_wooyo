import java.util.ArrayList;
import java.util.Iterator;

public class NonLeaf extends TreeNode {
	private ArrayList<TreeNode> childs = new ArrayList<>(); 
	public NonLeaf(String name){
		super(name); 
	}
	@Override
	public void add(TreeNode node) {
		childs.add(node);
	}
	@Override
	public void remove(TreeNode node) {
		childs.remove(node);
	}
	@Override
	public TreeNode getChild(int index) {
		if(index>=0&&index<childs.size())
			return childs.get(index);
		else throw new IllegalArgumentException("해당 색인에 해당되는 노드가 없음");
	}
	@Override
	public int numberOfChilds(){
		return childs.size();
	}
	@Override
	public NonLeaf getRearranged(){
		NonLeaf newNode = new NonLeaf(getName()); // 객체 하나 추가
		newNode.childs.addAll(childs); // childs에 모든 arrayList에 있는거들 불러와서 추가
		newNode.childs.sort((a, b)->{
			if ( a instanceof NonLeaf && b instanceof Leaf) return -1;
			if ( a instanceof Leaf && b instanceof NonLeaf) return 1;
			return a.getName().compareTo(b.getName()); // folder들간, file들 간에 이름 순서대로 sorting이 가능하도록
		});
		return newNode;
	}
	@Override
	public boolean equals(Object o){
		if(!super.equals(o)) return false;
		NonLeaf node = (NonLeaf)o;
		return childs.equals(node.childs);
	}
	@Override
	public Iterator<TreeNode> iterator() {
		return new TreeIteratorDFS(childs.iterator());
		//return new TreeIteratorBFS(childs.iterator());
	}
}
