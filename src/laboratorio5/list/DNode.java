package laboratorio5.list;

public class DNode<T> extends AbstractNode<T>{
	private DNode<T> prev;
	
	public DNode(T _data){
			super(_data);
			prev = null;
	}
	public DNode() {
		super(null);
	}
	
	public void setPrev(DNode<T> _prev){
			this.prev = _prev;
	}

	public DNode<T> getPrev(){
		return prev;
	}
}
