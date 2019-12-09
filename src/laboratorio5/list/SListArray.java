package laboratorio5.list;

public  class SListArray<T> implements IList<T>{

	private int SIZE = 10;
	Object[] array;
	int posicion;
	
	public SListArray() {
		posicion = 0;
		array = new Object[SIZE];
	}
	
	private Object[] resize() {
		Object[] arrayResize;
		SIZE = SIZE * 2;
		
		arrayResize = copy(array);
		return arrayResize;
	}
	
	private Object[] copy(Object[]array) {
		Object[] arrayCopy = new Object[SIZE]; 
		for(int i = 0; i < posicion; i++) {
			arrayCopy[i] = array[i];
		}
		return arrayCopy;
	}
	
	@Override
	public void insert(T _data) {
		if(isOverflow()) {
			array = resize();
		}
		
		array[posicion] = _data;
		posicion++;
	}

	private boolean isOverflow() {
		if(posicion == SIZE) {
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
		if (posicion >= 0 && posicion < SIZE) {
				data = array[posicion];
			
		}
		return data;
	}
}

