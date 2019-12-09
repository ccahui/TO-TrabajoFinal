package laboratorio5.tree;

public class TreeRedBlack<T extends Comparable<T>> extends TreeBinary<T> {

	private boolean isRed(NodeTreeBinary<T> x) {
		if(x == null)
			return NodeTreeRB.BLACK;
		return getColor(x) == NodeTreeRB.RED;
	}

	private int getSize(NodeTreeBinary<T> x) {
		if(x == null)
			return 0;
		NodeTreeRB<T> node = (NodeTreeRB<T>) x;
		return node.getSize();
	}

	/* TODO */
	public boolean getColor(NodeTreeBinary<T> x) {
		NodeTreeRB<T> node = (NodeTreeRB<T>) x;
		return node.getColor();
	}

	public void setColor(NodeTreeBinary<T> x, boolean color) {
		NodeTreeRB<T> node = (NodeTreeRB<T>) x;
		node.setColor(color);
	}

	public void setSize(NodeTreeBinary<T> x, int size) {
		NodeTreeRB<T> node = (NodeTreeRB<T>) x;
		node.setSize(size);
	}

	private NodeTreeBinary<T> rotateRight(NodeTreeBinary<T> h) {
		NodeTreeBinary<T> x = h.getLeft();

		h.setLeft(x.getRight());
		x.setRight(h);

		setColor(x, getColor(x.getRight()));
		setColor(x.getRight(), NodeTreeRB.RED);

		setSize(x, getSize(h));
		setSize(h, getSize(h.getLeft()) + getSize(h.getRight()) + 1);
		return x;
	}

	private NodeTreeBinary<T> rotateLeft(NodeTreeBinary<T> h) {
		// assert (h != null) && isRed(h.right);
		NodeTreeBinary<T> x = h.getRight();

		h.setRight(x.getLeft());
		x.setLeft(h);
		setColor(x, getColor(x.getLeft()));
		setColor(x.getLeft(), NodeTreeRB.RED);

		setSize(x, getSize(h));
		setSize(h, getSize(h.getLeft()) + getSize(h.getRight()) + 1);

		return x;
	}

	private void flipColors(NodeTreeBinary<T> h) {
		setColor(h, !getColor(h));
		setColor(h.getLeft(), !getColor(h.getLeft()));
		setColor(h.getRight(), !getColor(h.getRight()));
	}

	@Override
	public void insert(T data) {
		root = insert(root, data);
	}

	// insert the key-value pair in the subtree rooted at h
	private NodeTreeBinary<T> insert(NodeTreeBinary<T> h, T key) {
		if (h == null)
			return new NodeTreeRB<T>(key, NodeTreeRB.RED);

		int cmp = comparar(h, key);
		
		if (cmp > 0)
			h.setLeft(insert(h.getLeft(), key));
		else if (cmp > 0)
			h.setRight(insert(h.getRight(), key));
		else
			h.setData(key);
		
		if (isRed(h.getRight()) && !isRed(h.getLeft()))
			h = rotateLeft(h);
		if (isRed(h.getLeft()) && isRed(h.getLeft().getLeft()))
			h = rotateRight(h);
		if (isRed(h.getLeft()) && isRed(h.getRight()))
			flipColors(h);

		setSize(h, getSize(h.getLeft()) + getSize(h.getRight()) + 1);

		return h;
	}

}
