package Tree;

public interface AbstractSearchTree<T extends Comparable<T>> extends AbstractBinaryTree, Iterable{
	/**
	 * generic Node
	 * @param <T>
	 */
	public class Node<T>{
		 
		public T data;
		public int hight;
		public Node left;
		public Node right;
		public Node(T data){
			this.data = data;
			
		}
	}

	/**
	 * searches for an element in the tree
	 * @param val
	 * @return
	 */
  public boolean search(T val) ;

	/**
	 * removes an element from the tree
	 * @param val
	 */
  public void remove(T val);

	/**
	 * inserts an element into the tree
	 * @param val
	 */
  public void insert(T val);

	/**
	 * preforms preorder trevarsal
	 */
	public void preorder();
	/**
	 * preforms inorder trevarsal
	 */
  public void inorder();
	/**
	 * preforms postorder trevarsal
	 */
  public void postorder();

	/**
	 * wether the tree is empty
	 * @return
	 */
  boolean isempty();
	

}
