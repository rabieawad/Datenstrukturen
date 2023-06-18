package QSMinH;

public interface AbstractMinHeap<N> extends AbstractHeap<N> {
    /**
     * Ensure to remain min-heap structure after adding a heap element
     */
    void bubbleUp();

    /**
     * Ensure to remain min-heap structure after removing a heap element
     */
    void bubbleDown();

    /**
     * Add a new element to the min-heap and maintain min-heap structure
     * @param n new number value to be added to the heap
     */
    void insert(N n);

    /**
     * Remove root element from the heap and return its value
     * @return the removed elements value
     */
    N deleteMin();

    /**
     * Return the minimal element of the heap
     * @return heap's smallest value
     */
    N getMin();


    /**
     * Return the number of elements in the heap
     * @return amount of elements in the heap
     */
    int size();

    /**
     * Return true when heap is empty and false when heap is not empty but contains elements
     * @return true/false
     */
    boolean isEmpty();
}
