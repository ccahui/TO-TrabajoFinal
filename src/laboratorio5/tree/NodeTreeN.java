package laboratorio5.tree;

import java.util.ArrayList;
import java.util.List;

public class NodeTreeN<T extends Comparable<T>> extends NodeTree<T>{
   private List<NodeTreeN<T>> childs;
   
	public NodeTreeN(T data) {
		super(data);
		childs = new ArrayList<>();
		
	}
	
	public List<NodeTreeN<T>> getChilds() {
		return childs;
	}

	public void setChilds(List<NodeTreeN<T>> childs) {
		this.childs = childs;
	}
	
	
	
}

