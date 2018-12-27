import cola.Queue;
import pila.Stack;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> pila = new Queue<Integer>(); 
		
		pila.setEnqueue(2);
		pila.setEnqueue(4);
		pila.setEnqueue(6);
		
		System.out.println(pila.getSize());
		System.out.println(pila.getIsEmpty());
		System.out.println(pila.iterator().next());
		System.out.println(pila.iterator().hasNext());
		
	}

}
