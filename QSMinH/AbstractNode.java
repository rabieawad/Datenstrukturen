package QSMinH;

public interface AbstractNode<T> {

    /**
     * Sets the node's data to the given data
     * @param data data that the node shall contain
     */
    void setData(T data);

    /**
     * Returns the data currently stored in the node
     * @return node's data
     */
    T getData();

    /**
     * Returns the next QSMinH.Node
     * @return next node
     */
    Node<T> getNext();

    /**
     * Sets the node's next node to a given node
     * @param Node node that shall be the next node of this node
     */
    void setNext(Node<T> Node);
}
