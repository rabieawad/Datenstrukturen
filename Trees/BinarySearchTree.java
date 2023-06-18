package Tree;
import java.util.*;

import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<T>> implements AbstractSearchTree<T> {

	public Node<T> root;
public static void main(String...args) {
	BinarySearchTree<String> t ;
	t = new BinarySearchTree<String>();

	t.insert("ddd");
	t.insert("fff");
	t.insert("rabie");
	t.insert("aa");
	t.preorder();
}

	/**
	 * inserts an element into the  tree
	 * @param val
	 */
	@Override
	public void insert(T val) {
		 root = insert_Recursive(root, val); 

		
	}

	/**
	 * inserts an element into a tree or sub tree
	 * @param root
	 * @param key
	 * @return
	 */
    Node<T> insert_Recursive(Node<T> root, T key) { 
          //tree is empty
        if (root == null) { 
            root = new Node<T>(key); 
            return root; 
        } 
        //traverse the tree
        if (key.compareTo( root.data) < 0)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key.compareTo((T) root.data) > 0 )    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
         return root;
    }

	/**
	 * in order iterator
	 * @return
	 */
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new  treeitt(root);
	}
	public class treeitt  implements Iterator  {
		private Stack<Node> traversal;
		treeitt(Node root) {
			traversal = new Stack<Node>();
			moveLeft(root);
		}

		/**
		 * moves a node to the left
		 * @param current
		 */
		private void moveLeft(Node current)
		{
			while (current != null) {
				traversal.push(current);
				current = current.left;
			}
		}

		@Override
		public boolean hasNext()
		{
			return !traversal.isEmpty();
		}

		@Override
		public Node next()
		{
			if (!hasNext())
				throw new NoSuchElementException();

			Node current = traversal.pop();

			if (current.right != null)
				moveLeft(current.right);

			return current;
		}
	}

	@Override
	public boolean search(T val) {
		root = search_Recursive(root, val); 
        if (root!= null)
            return true;
        else
            return false;
	}

	/**
	 * searchs for an element in a tree or subtree
	 * @param root
	 * @param key
	 * @return
	 */
	Node<T> search_Recursive(Node<T> root, T key)  {
		//traverse the tree
		if (key.compareTo( root.data) < 0)     //insert in the left subtree
			root.left = search_Recursive(root.left, key);
		else if (key.compareTo((T) root.data) > 0 )    //insert in the right subtree
			root.right = search_Recursive(root.right, key);
		return root;
    }

	/**
	 * removes an element from the tree
	 * @param val
	 */
	@Override
	public void remove(Comparable val) {
		root = delete_Recursive(root,val);
	}
	
	 //recursive insert function


	/**
	 * removes an element from a tree or a subtree
 	 * @param root
	 * @param val
	 * @return
	 */
	private Node delete_Recursive(Node root, Comparable val)  {
        //tree is empty
        if (root == null)  return root; 
   
        //traverse the tree
        if (val.compareTo((T) root.data) < 0)     //traverse left subtree 
            root.left = delete_Recursive(root.left, val); 
        else if (val.compareTo((T) root.data) > 0)  //traverse right subtree
            root.right = delete_Recursive(root.right, val); 
        else  { 
            // node contains only one child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
            // node has two children; 
            //get inorder successor (min value in the right subtree) 
            root.data = minValue(root.right); 
   
            // Delete the inorder successor 
            root.right = delete_Recursive(root.right, val); 
        } 
        return root; 
    }

	/**
	 * preorder trvarsal
	 */
	@Override
	public void preorder() {
		preOrder(root);
	}

	/**
	 * preorder trvarsal
	 * @param node
	 */
	private void preOrder(Node<T> node) {
	if (node == null) return;
	System.out.printf("%s ", node.data);
	preOrder(node.left);
	preOrder(node.right); }

 	@Override
	public void inorder() { 
	        inorder_Recursive(root); 
	    } 
	   
	    // recursively traverse the BST  
	    void inorder_Recursive(Node root) { 
	        if (root != null) { 
	            inorder_Recursive(root.left); 
	            System.out.print(root.data + " "); 
	            inorder_Recursive(root.right); 
	        } 
	    } 

	@Override
	public void postorder() {
		// TODO Auto-generated method stub
		postOrder(root);
		
	}
	private void postOrder(Node<T> node) { 
		if (node == null) { return; } 
		postOrder(node.left);
		postOrder(node.right); 
		System.out.printf("%s ", node.data); }

	/**
	 * if the tree is empty
	 * @return
	 */
	@Override
	public boolean isempty() {
		if(root == null)
			return true;
		return false;
	}

	/**
	 * returns the minimum value
	 * @param root
	 * @return
	 */
	   T minValue(Node root)  { 
	        //initially minval = root
	        T minval = (T) root.data; 
	        //find minval
	        while (root.left != null)  { 
	            minval = (T) root.left.data; 
	            root = root.left; 
	        } 
	        return minval; 
	    }



	   
	   
	   
	   ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   

	
}
