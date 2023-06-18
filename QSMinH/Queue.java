package QSMinH;

import java.util.Iterator;

public class Queue<E extends Comparable<E>> implements AbstractQueue<E>, Iterable<E>, Comparable<E>{


    // front-element represents the first element in the queue
    Node<E> front;
    // last-element represents the last element in the queue
    public Node<E> last;

    //Constructor for the class QSMinH.Queue
    public Queue(){
        this.front = null;
    }

    @Override
    //implementation of the enqueue method from QSMinH.AbstractQueue
    public void enqueue(E data) {
        Node<E> new_node = new Node<>(data);
        if(this.isEmpty()){
            this.front = new_node;
        } else {
            this.last.setNext(new_node);
            this.last.getNext().setPrev(this.last);
        }
        this.last = new_node;
    }

    @Override
    //implementation of the dequeue method from QSMinH.AbstractQueue
    public E dequeue() {
        if(this.front == null){
            return null;
        }
        if(this.front.getNext() == null){
            this.front = null;
            return null;
        }
        Node<E> tmp = this.front;

        this.front = tmp.getNext();
        this.front.setPrev(null);
        return tmp.getData();
    }

    @Override
    //implementation of the peek method from QSMinH.AbstractQueue
    public E peek() {
        if(this.front == null){
            return null;
        }
        return this.front.getData();
    }

    @Override
    //implementation of the isEmpty method from QSMinH.AbstractQueue
    public boolean isEmpty() {
        return this.front == null;
    }

    @Override
    //implementation of the size method from QSMinH.AbstractQueue
    public int size() {
        int i = 0;
        if(this.isEmpty()){
            return i;
        }
        Node<E> node = front;
        i = 1;
        while(node.getNext() != null){
            i++;
            node = node.getNext();
        }
        return i;
    }


    @Override
    public Iterator<E> iterator() {
        return new QueueIterator<>(this);
    }

    @Override
    public int compareTo(E o) {
        if(o.compareTo(this.front.getData()) >= 1){
            return 1;
        } else {
            return -1;
        }
    }
}
