package laboratorio5.list;


public class CList<T> extends AbstractList<T>{

	public CList() {
		SNode<T> nodoS = new SNode<T>();
		cabezera = fin = nodoS;
		size = 0;
	}

	@Override
	public void insert(T _data) {
		SNode<T> nodoS = new SNode<T>(_data);
		fin.setNext(nodoS);

		AbstractNode<T> inicio = cabezera.getNext();
		nodoS.setNext(inicio);
		
		fin = nodoS;
		size++;
	}
	
}
