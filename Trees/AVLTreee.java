package Tree;

public class AVLTreee<T extends Comparable<T>> extends BinarySearchTree<T> implements AvlTree<T> {
	public static void main(String...args) {
		
		BinarySearchTree<String> t ;
		t = new AVLTreee<String>();

		 

		t.insert("ddd");
		t.insert("fff");
		t.insert("rabie");
        t.insert("bb");
        t.postorder();
	}   	

	/////////////////////////////////////////////////////////////////////////////

	/**
	 * Updates Node Hight during balancing prosses
	 * @param 1
	 */

    void updateHeight(Node<T> n) {
        n.hight = 1 + Math.max(height(n.left), height(n.right));
    }

	/**
	 * Getter for Node hight
	 * @param 1
	 * @return hight of inputed  Node
	 */
    int height(Node<T> n) {
        return n == null ? -1 : n.hight;
    }

    int getBalance(Node<T> n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }
    /////////////////////////////////////////////////////////////////////////////

	/**
	 * preforms right rotation during balancing process
	 * @param y
	 * @return
	 */
    private Node<T> rotateRight(Node<T> y) {
        Node<T>x = y.left;
        Node<T> z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }
	/**
	 * preforms left rotation during balancing process
	 * @param y
	 * @return
	 */
    Node<T> rotateLeft(Node<T> y) {
        Node<T> x = y.right;
        Node<T> z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    //////////////////////////////////////////////////////////////////////////

	/**
	 * inserts an element into the tree
	 * @param val
	 */

	@Override
	public void insert(T val) {
		root = insert( root,  val);
		
	}


	/**
	 * removes an element from the tree
	 * @param val
	 */

    @Override
    public void remove(Comparable val){
       this.root = delete(root,(T)val);
    }
 
	//////////////////////////////////////////////////////////////7

	/**
	 * balances the tree during inserting process
	 * @param z
	 * @return
	 */
	Node<T> rebalance(Node<T> z) {
	    updateHeight(z);
	    int balance = getBalance(z);
	    if (balance > 1) {
	        if (height(z.right.right) > height(z.right.left)) {
	            z = rotateLeft(z);
	        } else {
	            z.right = rotateRight(z.right);
	            z = rotateLeft(z);
	        }
	    } else if (balance < -1) {
	        if (height(z.left.left) > height(z.left.right))
	            z = rotateRight(z);
	        else {
	            z.left = rotateLeft(z.left);
	            z = rotateRight(z);
	        }
	    }
	    return z;
	}
	/////////////////////////////////////////////////////////////////

	/**
	 * inserts an element in a tree or a subtree
	 * @param node
	 * @param key
	 * @return
	 */
	Node insert(Node<T> node, T key) {
	    if (node == null) {
	        return new Node<T>(key);
	    } else if (node.data.compareTo(key) > 1) {
	        node.left = insert(node.left, key);
	    } else if (node.data.compareTo(key) < 0) {
	        node.right = insert(node.right, key);
	    } else {
	        throw new RuntimeException("duplicate Key!");
	    }
	    return rebalance(node);
	}
	//////////////////////////////////////////////////////////////

	/**
	 * removes an element from a tree or a subtree
	 * @param node
	 * @param key
	 * @return
	 */
	Node<T> delete(Node<T> node, T key) {
	    if (node == null) {
	        return node;
	    } else if (node.data.compareTo(key) == 1) {
	        node.left = delete(node.left, key);
	    } else if (node.data.compareTo(key) == -1) {
	        node.right = delete(node.right, key);
	    } else {
	        if (node.left == null || node.right == null) {
	            node = (node.left == null) ? node.right : node.left;
	        } else {
	            Node<T> mostLeftChild = mostLeftChild(node.right);
	            node.data = mostLeftChild.data;
	            node.right = delete(node.right, node.data);
	        }
	    }
	    if (node != null) {
	        node = rebalance(node);
	    }
	    return node;
	}
////////////////////////////////////////////////////////////////////

	/**
	 * returns the most left child
	 * @param n
	 * @return
	 */
	Node<T> mostLeftChild(Node<T> n){
		while(n.left != null)
			n = n.left;
	
	return n;
		
	}

	 
}
