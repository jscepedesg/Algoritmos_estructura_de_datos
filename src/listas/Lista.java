package listas;

import java.util.Iterator;
import tipos_class.Paciente;

public class Lista<Item> implements Iterable<Item> {

	private Item[] array = (Item[]) new Object[1];
	private int n;
	
	public Lista()
	{
		n=0;
	}
	
	public void setAdd(Item item)
	{
		array[n++]= item;
		if(n==array.length)
		{
			resize(array.length*2);
		}
	}
	public boolean getIsEmpty(){return n==0;}
	public int getSize(){return n;}
	private void resize(int tam)
	{
		Item arrAux[]=(Item[]) new Object[1];
		
		for(int i=0;i<n;i++)
		{
			arrAux[i]=array[i];
		}
		
		array=arrAux;
	}

	
	public Iterator<Item> iterator() {
		
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>
	{

		private int i=n;
		public boolean hasNext() { return i>0;}
		public Item next() {return  array[--i];}
		
	}

}
