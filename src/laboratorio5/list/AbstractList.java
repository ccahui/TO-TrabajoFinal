package laboratorio5.list;

public abstract class AbstractList<T> implements IList<T> {

	protected AbstractNode<T> cabezera;
	protected AbstractNode<T> fin;
	protected int size;

	public AbstractList() {
		cabezera = null;
		fin = null;
		size = 0;
	}

	@Override
	public abstract void insert(T _data);

	@Override
	public int size() {
		return size;
	}

	public Object get(int posicion) {

		Object data = null;
		if (posicion >= 0 && posicion < size) {
			AbstractNode<T> aux = cabezera.getNext();
			for (int i = 0; i < size && i < posicion; i++) {
				aux = aux.getNext();
			}
			
				data = aux.getData();
			
		}
		return data;
	}

}
