package QSMinH;

public class Node<T>  implements  AbstractNode<T>{
    public T data;
    private Node<T> next;
    private Node<T> prev;
    // Constructor of the generic class QSMinH.Node<T>
    public Node(T input_data){
        this.data = input_data;
        this.next = null;
        this.prev = null;
    }

    // Implementation of the setData method
    @Override
    public void setData(T input_data) {
        this.data = input_data;
    }

    // Implementation of the getData method
    @Override
    public T getData(){
        return this.data;
    }

    // Implementation of the getNext method
    @Override
    public Node<T> getNext(){
        return this.next;
    }

    // Implementation of the setNext method
    @Override
    public void setNext(Node<T> nextNode){
        this.next = nextNode;
    }

    public Node<T> getPrev(){
        return this.prev;
    }

    public void setPrev(Node<T> nextNode){
        this.prev = nextNode;
    }
}
