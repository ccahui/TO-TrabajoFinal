package laboratorio5.tree;

public class NodeTreeAVL<T extends Comparable<T>> extends NodeTreeBinary<T>{
	private int height; 
	
	public NodeTreeAVL(T _data) {
		super(_data);
		height = 1;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	
}
