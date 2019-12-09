package laboratorio5.tree;

public class NodeTreeRB<T extends Comparable<T>> extends NodeTreeBinary<T> {
    
	public static final boolean RED = true;
    public static final boolean BLACK = false;
    
    private boolean color;
    private int size;
    
	public NodeTreeRB(T _data, boolean color) {
		super(_data);
		this.color = color;
		size = 1;
	}

	public void setColor(boolean color) {
		this.color = color;
	}
	public boolean getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
