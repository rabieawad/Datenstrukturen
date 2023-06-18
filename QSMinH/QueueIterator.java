package QSMinH;

import java.util.Iterator;

public class QueueIterator<E extends Comparable<E>> implements Iterator<E> {

    Node<E> current;

    //Constructor
    QueueIterator(Queue<E> queue_object) {
        this.current = queue_object.front;
    }

    @Override
    public boolean hasNext() {
        return current.getNext() != null;
    }

    @Override
    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }
}
