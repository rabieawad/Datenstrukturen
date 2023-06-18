package QSMinH;

import java.util.Arrays;

public class MinHeap<N extends Comparable<N>> implements AbstractMinHeap<N>{

    int max_elements;
    int size;
    N[] heap;

    //Basic constructor for the class QSMinH.MinHeap
    public MinHeap(){
        this.max_elements = 8;
        this.size = 0;
        this.heap = (N[]) new Comparable[max_elements];
    }

    //Constructor for the class QSMinH.MinHeap that sets the heap's capacity to a given number
    public MinHeap(int n){
        this.max_elements = n;
        this.size = 0;
        this.heap = (N[]) new Comparable[max_elements];
    }

    @Override
    public void insert(N data) {
        // check whether minheap has reached its capacity, in which case extend heap capacity
        if(this.size >= this.heap.length-1){
            this.heap = this.resize();
        }
        // increase heap's size
        this.size++;
        // at the new leaf, add the data
        this.heap[size] = data;
        // maintain minheap structure by percolating upwards as far as possible
        this.bubbleUp();
    }

    @Override
    public N deleteMin() {
        if (this.isEmpty()){
            throw new IllegalStateException("The QSMinH.MinHeap is empty!");
        }
        N min = this.getMin();
        this.swap(1, this.size);
        this.heap[size] = null;
        this.size--;

        //maintain heap structure by percolating the smallest element (currently at position 1) through the minheap
        this.bubbleDown();
        return min;
    }

    @Override
    public N getMin() {
        if (this.isEmpty()){
            throw new IllegalStateException("The QSMinH.MinHeap is empty!");
        }
        return heap[1];
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    public void swap(){

    }

    @Override
    public int size(){
        return this.size;
    }

    private N[] resize(){
        // add a capacity of max_elements to the minheap
        return Arrays.copyOf(this.heap, this.heap.length + this.max_elements);
    }

    public void bubbleUp(){
        int index = this.size;
        while (this.hasParent(index) && (this.heap[this.getParentIndex(index)].compareTo(this.heap[index]) > 0)){
            swap(index, this.getParentIndex(index));
            index = this.getParentIndex(index);
        }
    }

    public void bubbleDown(){
        int index = 1;
        while (this.hasLeftChild(index)){
            // find smaller one of the children
            int smallerChild = leftChildIndex(index);
            if (hasRightChild(index) && heap[leftChildIndex(index)].compareTo(heap[rightChildIndex(index)]) > 0){
                smallerChild = rightChildIndex(index);
            }
            if (heap[index].compareTo(heap[smallerChild]) > 0){
                swap(index, smallerChild);
            } else {
                break;
            }
            index = smallerChild;
        }
    }

    // check whether node at index i is a child or the root node
    private boolean hasParent(int index)
    {
        return index > 1;
    }

    // returns the index of the node's (stored at index i) left child
    private int leftChildIndex(int index){
        return index * 2;
    }

    // returns the index of the node's (stored at index i) right child
    private int rightChildIndex(int index){
        return index * 2 + 1;
    }

    // Check whether the node at index "index" has a left child
    private boolean hasLeftChild(int index){
        return this.leftChildIndex(index) <= this.size;
    }

    // Check whether the node at index "index" has a right child
    private boolean hasRightChild(int index){
        return this.rightChildIndex(index) <= this.size;
    }

    // returns the index of a node's parent
    private int getParentIndex(int index){
        return index/2;
    }

    private void swap(int index1, int index2){
        N tmp = this.heap[index1];
        this.heap[index1] = this.heap[index2];
        this.heap[index2] = tmp;
    }

}

