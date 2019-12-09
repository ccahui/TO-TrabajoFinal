package laboratorio5.stack;

public class StackArray<T> implements IStack<T> {

	private int MAX_SIZE = 100;
	private Object[] array;
	private int posicion;

	public StackArray() {
		array = new Object[MAX_SIZE];
		posicion = 0;
	}

	@Override
	public void push(T data) {

		if (isOverflow()) {
			array = resize();
		}
		array[posicion] = data;
		posicion++;
	}

	private Object[] resize() {

		Object[] arrayResize;
		MAX_SIZE = MAX_SIZE * 2;

		arrayResize = copy(array);
		return arrayResize;
	}

	private Object[] copy(Object[] array) {
		Object[] arrayCopy = new Object[MAX_SIZE];
		for (int i = 0; i < posicion; i++) {
			arrayCopy[i] = array[i];
		}
		return arrayCopy;
	}

	private boolean isOverflow() {
		if (posicion == MAX_SIZE) {
			return true;
		}
		return false;
	}

	@Override
	public T pop() {
		T data = null;
		if (!isEmpty()) {
			posicion--;
			data = (T) array[posicion];
		}
		return data;
	}

	public boolean isEmpty() {
		if (posicion == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return posicion;
	}

	@Override
	public Object get(int posicion) {
			Object data = null;
			if (posicion >= 0 && posicion < MAX_SIZE) {
					data = array[posicion];
			}
			return data;
		
	}
	
	
	

}
