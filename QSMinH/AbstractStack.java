package QSMinH;

public interface AbstractStack<E> extends Iterable<E>{
    /**
     * This method adds a given Element to the stack
     * @param  element  An element to be pushed onto the QSMinH.Stack
     */
    void push(E element);

    /**
     * Returns and removes the top element from the stack
     * @return the top element that is to be removed
     */
    E pop();


    /**
     * Returns the stacks top element without removing it
     * @return the top element
     */
    E peek();

    /**
     * Returns true when stack is empty and false otherwise
     * @return true/false depending on whether the stack is empty or not
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently stored in the stack
     * @return amount of elements stored in the stack
     */
    int size();
}
