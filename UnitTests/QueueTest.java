import QSMinH.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        assertEquals(queue.peek(),1);
        assertEquals(queue.last.getData(),1);
        queue.enqueue(2);
        assertEquals(queue.peek(),1);
        assertEquals(queue.last.getData(),2);
    }

    @Test
    void dequeue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(queue.peek(),2);
        assertEquals(queue.last.getData(),2);
    }

    @Test
    void peek() {
        Queue<Integer> queue = new Queue<>();
        assertNull(queue.peek());
        queue.enqueue(1);
        assertEquals(queue.peek(),1);
        queue.enqueue(2);
        assertEquals(queue.peek(),1);
        queue.dequeue();
        assertEquals(queue.peek(),2);


        Queue<String> string_queue = new Queue<>();
        string_queue.enqueue("one");
        assertEquals(string_queue.peek(),"one");
    }

    @Test
    void isEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertNull(queue.peek());
        assertNull(queue.last);
    }

    @Test
    void size() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(queue.size(),4);
        queue.dequeue();
        assertEquals(queue.size(),3);
    }
}