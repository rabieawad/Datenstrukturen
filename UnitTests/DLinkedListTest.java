import Listen.DLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkedListTest {


    @org.junit.jupiter.api.Test

    void isempty() {
        DLinkedList list = new DLinkedList<String>();

        assertEquals( true,list.isempty());




    }
    @org.junit.jupiter.api.Test

    void add(){
        DLinkedList list = new DLinkedList<String>();
        assertEquals(true,list.isempty() );

        list.add("Rabie");
        list.add("linus");
        list.add("ali");
        assertEquals("ali",list.head.data);
        assertEquals("linus",list.head.next.data);
        assertEquals("Rabie",list.head.next.next.data);







    }
    @org.junit.jupiter.api.Test

    void remove(){
        DLinkedList list = new DLinkedList<String>();
        assertEquals(true,list.isempty() );

        list.add("Rabie");
        list.add("linus");
        list.add("ali");
        assertEquals("ali",list.head.data);
        assertEquals("linus",list.head.next.data);
        assertEquals("Rabie",list.head.next.next.data);
        list.remove("Rabie");
        assertEquals(list.head.data, "ali");
        assertEquals(list.head.next.data, "linus");

        assertEquals(null,list.head.next.next);

    }
    @org.junit.jupiter.api.Test
    void clear(){
        DLinkedList list = new DLinkedList<String>();
        assertEquals(true,list.isempty() );

        list.add("Rabie");
        list.add("linus");
        list.add("ali");
        list.clear();
        assertEquals(null, list.head);

    }
}