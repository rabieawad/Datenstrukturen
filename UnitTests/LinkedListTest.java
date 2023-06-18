import Listen.LinkedList;
import Listen.SList;
import Listen.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {


    @org.junit.jupiter.api.Test

    void isempty() {
        LinkedList list = new LinkedList<String>();

        assertEquals( true,list.isempty() );




    }
    @org.junit.jupiter.api.Test

    void add(){
        LinkedList list = new LinkedList<String>();
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
        LinkedList list = new LinkedList<String>();
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
        LinkedList list = new LinkedList<String>();
        assertEquals(true,list.isempty() );

        list.add("Rabie");
        list.add("linus");
        list.add("ali");
        list.clear();
        assertEquals(null, list.head);

    }

}