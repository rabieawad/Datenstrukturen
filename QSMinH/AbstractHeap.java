package QSMinH;

public interface AbstractHeap<N>{

    // add element to the heap
    void insert(N n);

    // retrieve the root element of the heap
    N deleteMin();
    //return number of elements in the heap
    int size();
}
