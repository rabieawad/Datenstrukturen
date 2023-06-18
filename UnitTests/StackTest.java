import QSMinH.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void isEmpty() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    void pop() {
        Stack<Integer> stack = new Stack<>();
        assertNull(stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(stack.pop(),3);
        assertEquals(stack.pop(),2);
        assertEquals(stack.pop(),1);
        assertNull(stack.pop());
    }

    @Test
    void peek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(stack.peek(),3);

        Stack<String> string_stack = new Stack<>();
        string_stack.push("one");
        assertEquals(string_stack.peek(),"one");
    }

    @Test
    void push() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertEquals(stack.root.getData(),1);
        stack.push(2);
        assertEquals(stack.root.getData(),2);
    }

    @Test
    void size() {
        Stack<Integer> stack = new Stack<>();
        assertEquals(stack.size(),0);
        stack.push(1);
        assertEquals(stack.size(),1);
        stack.push(2);
        assertEquals(stack.size(),2);
        stack.push(3);
        assertEquals(stack.size(),3);
    }
}