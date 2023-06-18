package Listen;

public interface SList<T extends Comparable> extends List<T>{
	 class Node<T extends Comparable>{
		public Node(T data) {
			this.data = data;
		}
		public T data;
		public Node next;
	}
	
	 void add(T data);
	 void remove(T data);
	 void clear();
	 boolean isempty();
	 void reverse();
	

}
