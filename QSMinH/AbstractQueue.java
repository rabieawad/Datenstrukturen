package QSMinH;

public interface AbstractQueue<E> extends Iterable<E>{
    /**
     * Adds an element to the queue (FiFo)
     * @param element Element to be added to the QSMinH.Queue
     */
    void enqueue(E element);

    /**
     * Removes an element from the queue and also returns the removed element (FiFo)
     * @return the removed element
     */
    E dequeue();

    /**
     * Returns the first element in the queue
     * @return queue's first element
     */
    E peek();

    /**
     * Checks whether the queue is empty
     * @return true/false depending on whether the queue is empty or not
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the queue
     * @return amount of elements  currently stored in queue
     */
    int size();
}
