package laboratorio5.list;


public class DList<T> extends AbstractList<T> {

	public DList() {
		DNode<T> nodoD = new DNode<T>();
		cabezera = fin = nodoD;
		size = 0;
	}
	
	@Override
	public void insert(T _data) {
		DNode<T> nuevo = new DNode<T>(_data);
		nuevo.setPrev((DNode<T>)fin);
		
		fin.setNext(nuevo);
		fin = nuevo;
		
		size++;
	}
	
}
