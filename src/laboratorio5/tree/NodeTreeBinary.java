package laboratorio5.tree;

public class NodeTreeBinary<T extends Comparable<T>> extends NodeTree<T>{
	
	private NodeTreeBinary<T> left;
	private NodeTreeBinary<T> right;
	
	public NodeTreeBinary(T _data) {
		super(_data);
		left = null;
		right = null;
	}

	public NodeTreeBinary<T> getLeft() {
		return left;
	}

	public void setLeft(NodeTreeBinary<T> left) {
		this.left = left;
	}

	public NodeTreeBinary<T> getRight() {
		return right;
	}
	

	public void setRight(NodeTreeBinary<T> right) {
		this.right = right;
	}
	
	
	
	
}
