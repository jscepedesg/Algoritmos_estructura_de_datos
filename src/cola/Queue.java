package cola;

import java.util.Iterator;
import tipos_class.Paciente;

public class Queue<Item> implements Iterable<Item> {

	private Item[] array = (Item[]) new Object[1];
	private  int n=0;
	private int first=0;
	private int last=first;
	
	public void setEnqueue(Item item)
	{
		
		array[last++]=item;
		n++;
		
		if(n==array.length)
		{
			resize(array.length*2);
		}
	}
	public Item getDequeue()
	{
		//Por verificar
		Item elemento = null;
		if(!getIsEmpty())
		{
			 elemento =array[first++];
			 //Por verificar
			 array[first-1] = null;
			 n--;
		}
		
		
		if(n>0&&n<array.length/4)
		{
			resize(array.length/2);
		}
	    return elemento;
	}
	
	
	
	public boolean getIsEmpty(){return n==0;}
	
	public int getSize(){return n;}
	
	private void resize(int tam)
	{
		Item arrAux[]= (Item[]) new Object[tam];
		
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

		private int i=first;
		private int j=last;
		public boolean hasNext() { return i<j;}
		public Item next() {return  array[i++];}
		
	}
	
}
