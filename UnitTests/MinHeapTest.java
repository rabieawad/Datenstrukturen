import QSMinH.MinHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void insert() {
        MinHeap<Integer> min = new MinHeap<>();
        min.insert(3);
        assertEquals(min.getMin(),3);
        min.insert(2);
        assertEquals(min.getMin(),2);
        min.insert(1);
        assertEquals(min.getMin(),1);
        min.insert(-1);
        assertEquals(min.getMin(),-1);
        min.deleteMin();

    }

    @Test
    void deleteMin() {
        MinHeap<Integer> min = new MinHeap<>();
        min.insert(1);
        min.insert(2);
        min.insert(3);
        min.insert(-1);
        assertEquals(min.getMin(),-1);
        min.deleteMin();
        assertEquals(min.getMin(),1);
    }

    @Test
    void getMin() {
        MinHeap<Integer> min = new MinHeap<>();
        min.insert(1);
        min.insert(2);
        min.insert(3);
        min.insert(-1);
        assertEquals(min.getMin(),-1);
    }

    @Test
    void size() {
        MinHeap<Integer> min = new MinHeap<>();
        min.insert(1);
        min.insert(2);
        min.insert(3);
        assertEquals(min.size(),3);
    }
}