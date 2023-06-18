import Tree.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {
        var tree = new BinarySearchTree<String>();
        tree.insert("d");
        tree.insert("a");
        tree.insert("e");
        tree.insert("b");
        assertEquals(tree.root.data,"d");
        assertEquals(tree.root.left.data,"a");
        assertEquals(tree.root.left.right.data,"b");
        assertEquals(tree.root.right.data,"e");
    }

    @Test
    void iterator() {
    }

    @Test
    void search() {
        var tree = new BinarySearchTree<String>();

        tree.insert("d");
        tree.insert("a");
        tree.insert("e");
        tree.insert("b");
         assertTrue(tree.search("d"));
        assertTrue(tree.search("a"));
        assertTrue(tree.search("e"));
        assertTrue(tree.search("b"));

    }

    @Test
    void remove() {
        var tree = new BinarySearchTree<String>();

        tree.insert("d");
        tree.insert("a");
        tree.insert("e");
        tree.insert("b");
        tree.remove("e");
        assertEquals(tree.root.data,"d");
        assertEquals(tree.root.left.data,"a");
        assertEquals(tree.root.left.right.data,"b");
        assertEquals(tree.root.right,null);
        tree.remove("d");
        assertTrue((tree.root.data != "d"));

    }

    @Test
    void isempty() {
        var tree = new BinarySearchTree<String>();

        assertTrue(tree.root == null);
    }
}