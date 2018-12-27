import java.util.Iterator;
import java.util.Scanner;

import listas_enlazadas.Queue;
import listas_enlazadas.StackLis;

public class Postfija {
	
	
	private Queue<String> in = new Queue<String>();
	private Queue<String> out = new Queue<String>();
	private StackLis <String> pila = new StackLis<String>();
	Scanner datos = new Scanner (System.in);
	
	public void leer()
	{
		String elemento;
		String operando;
		
		do{
		System.out.println("Ingrese el elemento de la expresión: "+
							"\n<. Operador"+
							"\n+. Sumar"+
							"\n-. Resta"+
							"\n*. Multiplicar"+
							"\n/. Dividir"+
							"\n:. Converir");
		
		elemento = datos.nextLine();
		
		switch(elemento)
		{
			case "<":
				System.out.println("Ingrese el operando: ");
				operando = datos.nextLine();
				in.enqueue(operando);
				break;
			case "+":
			case "-":
			case "*":
			case "/":
				in.enqueue(elemento);
			case ":":
				//convertir();
				break;
				//Convertir
				default: System.out.println("El elemento ingresado no es valido");
			}
		}while(!elemento.equals(":"));
	}
	
	public void convertir()
	{
		Iterator colaIter = in.iterator();
		while(colaIter.hasNext())
		{
			String elemento = (String)colaIter.next();
			switch(elemento)
			{
				case "+":
				case "-":
				case "*":
				case "/":
					if(pila.isEmpty())
					{
						pila.push(elemento);
					}
					break;
				default: out.enqueue(elemento);
			}
			
			Iterator pilaIter = pila.iterator();
			
			while(pilaIter.hasNext())
			{
				out.enqueue((String)pilaIter.next());
			}
		}
	}
	public String printIn()
	{
		String salida="";
		
		Iterator colaIter = in.iterator();
		
		while(colaIter.hasNext())
		{
			salida += colaIter.next();
		}
		
		return salida;
	}
	
	public String printOut(Queue cola)
	{
		String salida="";
		Iterator colaIter = in.iterator();
		while(colaIter.hasNext())
		{
			salida += colaIter.next();
		}
		return salida;
		
	}
	
	
}
