package Arboles;

public class BinaryNode <Item>{

	private Item element;
	private BinaryNode<Item> left;
	private BinaryNode<Item> right;
	
	 public BinaryNode()
	 {
		 this(null,null,null);
	 }
	 
	 public BinaryNode(Item element,BinaryNode<Item> it,BinaryNode<Item> rt)
	 {
		 this.element=element;
		 left=it;
		 right = rt;
	 }

	public Item getElement() {
		return element;
	}

	public void setElement(Item element) {
		this.element = element;
	}

	public BinaryNode<Item> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<Item> left) {
		this.left = left;
	}

	public BinaryNode<Item> getRight() {
		return right;
	}

	public void setRight(BinaryNode<Item> right) {
		this.right = right;
	}

	public static <Item> int size(BinaryNode<Item> t)
	{
		if(t==null)
		{
			return 0;
		}
		else
		{
			return 1+size(t.left)+size(t.right);
		}
	}
	
	public static <Item> int height(BinaryNode<Item> t)
	{
		if(t==null)
		{
			return -1;
		}
		else
		{
			return 1+Math.max(height(t.left),height(t.right));
		}
	}
	
	public BinaryNode<Item> duplicate()
	{
		BinaryNode<Item> root= new BinaryNode<Item>(element,null,null);
		
		if(left != null)
		{
			root.left=left.duplicate();
		}
		if(right != null)
		{
			root.right=right.duplicate();
		}
		
		return root;
	}
	
	public void printPreOrden()
	{
		System.out.println(element);
		if(left!=null)
		{
			left.printPreOrden();
		}
		if(right != null)
		{
			right.printPreOrden();
		}
	}
	
	public void printPosOrden()
	{
		
		if(left!=null)
		{
			left.printPosOrden();
		}
		if(right != null)
		{
			right.printPosOrden();
		}
		System.out.println(element);
	}
	
	public void printInOrden()
	{
		if(left!=null)
		{
			left.printInOrden();
		}
		System.out.println(element);
		if(right != null)
		{
			right.printInOrden();
		}
		
	}
}
