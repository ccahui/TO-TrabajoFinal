package laboratorio5.stack;

public interface IStack<T> {

	public void push(T data);
	public T pop();
	public int size();
	public Object get(int posicion);
	
}
