package laboratorio5.tree;

public class TreeNArios<T extends Comparable<T>> implements ITree<T>, PrinterTree {

	private NodeTreeN<T> root;
	
	@Override
	public void insert(T data) {
		System.out.println("Insertar Arbol N-ario");
	}

	@Override
	public void inOrden() {
		System.out.println("Arbol N-ario InOrden");
	}

	@Override
	public void preOrden() {
		System.out.println("Arbol N-ario PreOrden");
	}

	@Override
	public void postOrden() {
		System.out.println("Arbol N-ario PostOrden");
	}

}
