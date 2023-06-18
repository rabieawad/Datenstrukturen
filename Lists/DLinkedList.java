package Listen;

import Listen.SList.Node;

public class DLinkedList<T extends Comparable> implements DList<T> {

	public Node<T> head ;
	@Override
	public void add(T data) {
		if(head == null){
		head = new Node<T>(data);
		}else {
		Node<T> tmp = new Node<T>(data);
		head.pre = tmp;
		tmp.next = head;
		head = tmp;}
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
			    curr.next.next.pre = curr;
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

}
