package laboratorio5.list;

public interface IList<T> {

	public void insert(T _data);
	public int size();
	public Object get(int posicion);
}
