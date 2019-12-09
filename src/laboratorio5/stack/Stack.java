package laboratorio5.stack;

import laboratorio5.list.*;

public class Stack<T> implements IStack<T>{

	private SNode<T> inicio;
	private int size = 0;
	
	public Stack() {
		inicio = null;
		size = 0;
	}
		
	@Override
	public void push(T _data) {
		SNode<T> node = new SNode<T>(_data);
		node.setNext(inicio);
		
		inicio = node;
		size++;
	}

	@Override
	public T pop() {
		T data = null;
		if(inicio!=null) {
			data = inicio.getData();
			inicio = (SNode<T>)inicio.getNext();
			
			size--;
		}
		return data;
	}

	
	@Override
	public int size() {
		return size;
	}

	@Override
	public Object get(int posicion) {
		Object data = null;
		if (posicion >= 0 && posicion < size) {
			AbstractNode<T> aux = inicio;
			for (int i = 0; i < size && i < posicion; i++) {
				aux = aux.getNext();
			}
				data = aux.getData();
			
		}
		return data;
	}
	
}
