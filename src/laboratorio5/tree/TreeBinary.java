package laboratorio5.tree;

public class TreeBinary <T extends Comparable<T>> implements ITree<T>, PrinterTree {

	NodeTreeBinary<T> root;
	public TreeBinary() {
		root = null;
	}

	@Override
	public void insert(T _data) {
		root = addRecursive(root, _data);
	}
	
	private NodeTreeBinary<T> addRecursive(NodeTreeBinary<T> root, T _data) {
		if(root == null)
			return new NodeTreeBinary<T>(_data);
		else {	
			if(comparar(root, _data) > 0) {
				NodeTreeBinary<T> left = addRecursive(root.getLeft(), _data);
				root.setLeft(left);
			} else {
				NodeTreeBinary<T> right = addRecursive(root.getRight(), _data);
				root.setRight(right);
			}
		}	
		return root;
	}
	
	protected int comparar(NodeTreeBinary<T> node, T _data) {
		return node.getData().compareTo(_data);
	}

	@Override
	public void inOrden() {
		this.inOrden(root);	
		System.out.println();
	}

	public void preOrden() {
		this.preOrden(root);
		System.out.println();
	}

	@Override
	public void postOrden() {
		postOrden(root);
		
		System.out.println();
	}
	
	protected void preOrden(NodeTreeBinary<T> node) {
			if(node != null) {
				System.out.print(node.getData()+" - ");
				preOrden(node.getLeft());
				preOrden(node.getRight());
			}
	}
	protected void inOrden(NodeTreeBinary<T> node) {
		if(node != null) {
			preOrden(node.getLeft());
			System.out.print(node.getData()+" - ");
			preOrden(node.getRight());
		}
	}
	public void postOrden(NodeTreeBinary<T> node) {
		if(node != null) {
			
			preOrden(node.getLeft());
			preOrden(node.getRight());
			System.out.print(node.getData()+" - ");
		}
	}
	
}
