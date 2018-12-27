package Arboles;


import java.util.NoSuchElementException;

abstract class TreeIterator<Item>{

	protected BinaryTree<Item> tree;
	protected BinaryNode<Item> current;
	
	public TreeIterator(BinaryTree<Item> tree)
	{
		this.tree=tree;
		current = null;
	}
	
	final public boolean inValid()
	{
		return current != null;
	}
	
	final public Item retrieve()
	{
		if(current == null)
		{
			throw new NoSuchElementException();
		}
		return current.getElement();
	}
	abstract public void first();
	abstract public void advance();
}
