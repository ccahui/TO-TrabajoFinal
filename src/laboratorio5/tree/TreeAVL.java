package laboratorio5.tree;

public class TreeAVL<T extends Comparable<T>> extends TreeBinary<T>{

		
		@Override
		public void insert(T data) {
			root = insert(root, data);
		}

		private int height(NodeTreeBinary<T> nodeTreeBinary) { 
			if (nodeTreeBinary == null) 
				return 0; 

			NodeTreeAVL<T> nodeAVL = (NodeTreeAVL<T>)nodeTreeBinary;
			return nodeAVL.getHeight(); 
		} 

		private int max(int a, int b) { 
			return (a > b) ? a : b; 
		} 
		
		private NodeTreeBinary<T> rightRotate(NodeTreeBinary<T> root) { 
			
			NodeTreeAVL<T> x = (NodeTreeAVL<T>) root.getLeft(); 
			NodeTreeAVL<T> T2 = (NodeTreeAVL<T>) x.getRight(); 
			NodeTreeAVL<T> y = (NodeTreeAVL<T>) root; 
			
			x.setRight(y);
			y.setLeft(T2);
			
			
			y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);
			x.setHeight(max(height(x.getLeft()), height(x.getRight())) +1 );

			return x; 
		} 

		private NodeTreeBinary<T> leftRotate(NodeTreeBinary<T> root) { 
			NodeTreeAVL<T> y = (NodeTreeAVL<T>)root.getRight(); 
			NodeTreeAVL<T> T2 =(NodeTreeAVL<T>)y.getLeft(); 
			NodeTreeAVL<T> x = (NodeTreeAVL<T>) root;

			// Perform rotation 
			y.setLeft(x); 
			x.setRight(T2);

			// Update heights
			x.setHeight(max(height(x.getLeft()), height(x.getRight())) +1);
			y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);

			return y; 
		} 

		// Get Balance factor of node N 
		private int getBalance(NodeTreeBinary<T> N) { 
			if (N == null) 
				return 0; 
			
			return height(N.getLeft()) - height(N.getRight()); 
		} 

		private NodeTreeBinary<T> insert(NodeTreeBinary<T> node, T key) { 

			
			if (node == null) { 
				return new NodeTreeAVL<T>(key); 
			}
			if (comparar(node, key) > 0) {
				node.setLeft(insert(node.getLeft(), key));
				} 
			else if (comparar(node, key) < 0) { 
				/*TODO*/
				node.setRight(insert(node.getRight(), key));
				} 
			else { 
				return node; 
			}
			
			/* Actualizar Pesos */
			NodeTreeAVL<T>nodeAVL = (NodeTreeAVL<T>)node;
			nodeAVL.setHeight(1 + max(height(node.getLeft()), 
								height(node.getRight()))); 

			/* factor de balanceo */
			int balance = getBalance(node); 

			// Left Left Case 			
			if (balance > 1 && comparar(node.getLeft(), key) > 0) 
				return rightRotate(node); 

			// Right Right Case 
			if (balance < -1 && comparar(node.getRight(), key) < 0) 
				return leftRotate(node); 

			// Left Right Case 
			if (balance > 1 &&  comparar(node.getLeft(), key) < 0) { 
				node.setLeft(leftRotate(node.getLeft())); 
				return rightRotate(node); 
			} 

			// Right Left Case 
			if (balance < -1 &&  comparar(node.getRight(), key) > 0 ) { 
				node.setRight(rightRotate(node.getRight())); 
				return leftRotate(node); 
			} 

			/* return the (unchanged) node pointer */
			return node; 
		} 

		

}

