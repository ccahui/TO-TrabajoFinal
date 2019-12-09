package laboratorio5.tree;


public class Main {

	public static void main(String[] args) {
		
		
		TreeBinary<Integer> tree = new TreeBinary<>();
		tree.insert(4);
		tree.insert(2);
		tree.insert(8);
		tree.inOrden();
		
		TreeBinary<Integer> treeAVL = new TreeAVL<>();
		treeAVL.insert(4);
		treeAVL.insert(2);
		treeAVL.insert(9);
		treeAVL.inOrden();
		
		TreeBinary<Integer> treeRB = new TreeRedBlack<>();
		treeRB.insert(4);
		treeRB.insert(2);
		treeRB.insert(1);		
		treeRB.inOrden();
		
		
	}
}
