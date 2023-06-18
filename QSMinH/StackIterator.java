package QSMinH;

import java.util.Iterator;

public class StackIterator<E extends Comparable<E>> implements Iterator<E> {

    Node<E> current;

    //Constructor
    StackIterator(Stack<E> stack_object) {
        this.current = stack_object.root;
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
