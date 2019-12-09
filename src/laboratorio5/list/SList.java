package laboratorio5.list;

public class SList<T> extends AbstractList<T> {
	
	public SList() {
		SNode<T> nodoS = new SNode<T>();
		cabezera = fin = nodoS;
		size = 0;
	}

	@Override
	public void insert(T _data) {
		SNode<T> nodoS = new SNode<T>(_data);
		fin.setNext(nodoS);
		fin = nodoS;
		size++;
	}
	


}
