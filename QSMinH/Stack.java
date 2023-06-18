package QSMinH;

import java.util.Iterator;

public class Stack<E extends Comparable<E>> implements AbstractStack<E>{

    // root element represents the stacks top element
    public Node<E> root;

    // Constructor of class stack
    public Stack(){
        this.root = null;
    }

    // implements isEmpty() function of interface QSMinH.AbstractStack
    @Override
    public boolean isEmpty(){
        return root == null;
    }

    // implements pop() function of interface QSMinH.AbstractStack
    @Override
    public E pop(){
        if(this.isEmpty()){
            return null;
        } else {
            E tmp = this.root.getData();
            this.root = this.root.getNext();
            return tmp;
        }
    }

    // implements peek() function of interface QSMinH.AbstractStack
    @Override
    public E peek(){
        if(this.isEmpty()){
            return null;
        } else {
            return this.root.getData();
        }
    }

    // implements push() function of interface QSMinH.AbstractStack
    @Override
    public void push(E input_data){
        Node<E> node = new Node<>(input_data);
        node.setNext(this.root);
        this.root = node;
    }

    // implements size() function of interface QSMinH.AbstractStack
    @Override
    public int size(){
        Node<E> node = root;
        int i = 0;
        if(node == null){
            return i;
        }
        i = 1;
        while(node.getNext() != null){
           i++;
           node = node.getNext();
        }
        return i;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator<E>(this);
    }
}
