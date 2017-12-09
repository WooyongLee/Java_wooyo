
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Composite("root");
		Node sub1 = new Composite("sub1");
		Node sub2 = new Composite("sub2");
		Node leaf1 = new Leaf("a1");
		Node leaf2 = new Leaf("b1");
		Node leaf3 = new Leaf("b2");
		Node leaf4 = new Leaf("c1");
		Node leaf5 = new Leaf("c2");
		Node leaf6 = new Leaf("c3");
		
		root.add(leaf1);
		root.add(sub1);
		root.add(leaf4);
		root.add(sub2);
		root.add(leaf2);
		
		
	}

}
