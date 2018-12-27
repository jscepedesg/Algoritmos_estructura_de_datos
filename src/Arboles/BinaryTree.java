package Arboles;

public class BinaryTree<Item> {

	private BinaryNode<Item> root;
	
	public BinaryTree()
	{
		root=null; //o(1)
	}
	
	public BinaryTree(Item rootItem)
	{
		root = new BinaryNode<Item>(rootItem,null,null);
	}

	public BinaryNode<Item> getRoot() {
		return root;
	}

	public int size()
	{
		return BinaryNode.size(root);
	}
	
	public int height()
	{
		return BinaryNode.height(root);
	}
	
	public void printPreOrden()
	{
		if(root!=null)
		{
			root.printPreOrden();
		}
	}
	public void printPosOrden()
	{
		if(root!=null)
		{
			root.printPosOrden();
		}
	}
	public void printInOrden()
	{
		if(root!=null)
		{
			root.printInOrden();
		}
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void makeEmpty()
	{
		root=null;
	}
	
	public void merge(Item rootItem,BinaryTree<Item> t1,BinaryTree<Item> t2)
	{
		if(t1.root==t2.root&&t1.root!=null)
		{
			throw new IllegalArgumentException();
		}
		root = new BinaryNode<Item>(rootItem,t1.root,t2.root);
		
		if(this != t1)
		{
			t1.root=null;
		}
		if(this != t2)
		{
			t2.root=null;
		}
	}
	
}
