package laboratorio5.list;

public abstract class AbstractNode<T> {
	
	protected  T data;
	protected AbstractNode<T> next;

	public AbstractNode(T _data){
		this.data = _data;
		this.next = null;
	}
	
	public T getData(){
		return data;
	}

	public void setData(T _data){
		this.data = _data;
	}

	public AbstractNode<T> getNext(){
		return next;	 	
	}

	public void setNext(AbstractNode<T> _next){
		this.next = _next;
	}


}
