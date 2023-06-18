package Listen;

import Listen.SList.Node;

public interface DList<T extends Comparable> extends List<T>{
	class Node<T>{
		public Node(T data) {
			this.data = data;
		}
		public T data;
		public Node<T> pre;
		public Node<T>next;
	}
	
	public void add(T data);
	public void remove(T data);
	public void clear();
	public boolean isempty();
 	

}
