package laboratorio5.tree;

public abstract class NodeTree<T> {
	private T data;
	
	public NodeTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
