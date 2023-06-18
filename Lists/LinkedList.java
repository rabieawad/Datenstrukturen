package Listen;

public class LinkedList<T extends Comparable> implements SList<T>{
	public  Node<T> head;

	@Override
	public void add(T data) {
		 Node<T> temp = new Node<T>(data);
		 temp.next = head;
		 head = temp;
		
	}

	@Override
	public void remove(T data) {

		 if(head.data.compareTo(data) == 0) {
			 head = head.next;
		 }
		 else {
 			 Node<T> curr = head;
			 while(curr.next.data.compareTo(data) != 0 && curr.next != null){
				 curr = curr.next;

				 
			 }
                 if(curr.next != null)
				 curr.next = curr.next.next;
			 }
		 }
		


	@Override
	public void clear() {
		head = null;
 		
	}

	@Override
	public boolean isempty() {
		if(head == null)
			return true;
		return false;
			
		
	}

	@Override
	public void reverse() {
		Node<T> tmp;
        Node<T> next = null;
		Node<T> pre = head;
		while(pre != null) {
			tmp = pre.next;
			pre.next = next;
			next  = pre;
			pre = tmp;
			
			
		}
	}

  }
