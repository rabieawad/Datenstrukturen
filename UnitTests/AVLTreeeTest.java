import Tree.AVLTreee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLTreeeTest {

    @Test
    void insert() {
        var t = new AVLTreee<String>();
        t.insert("a");
        t.insert("b");
        t.insert("c");
        assertEquals(t.root.data, "b");
        assertEquals(t.root.left.data, "a");
        assertEquals(t.root.right.data, "c");
    }

    @Test
    void remove() {
        var t = new AVLTreee<String>();

        t.insert("a");
        t.insert("b");
        t.insert("c");
        t.remove("b");
        assertEquals("c",t.root.data);
        assertEquals(null,t.root.right);
        assertEquals("a",t.root.left.data);
        assertEquals(0,t.root.left.hight);
        assertEquals(1,t.root.hight);


    }
}