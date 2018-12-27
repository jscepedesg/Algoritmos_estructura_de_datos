package Principal;

import Algoritmos_de_ordenamiento.Merge_sort;
import Algoritmos_de_ordenamiento.Quick_sort;
import Algoritmos_de_ordenamiento.Selection_sort;

public class Principal_ordenamineto {

	private void llenarArray(Integer[] a)
	{
		for(int i =0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10000000+1);
		}
	}
	
	private void imprimirArray(Integer[] a)
	{
		for(int dato:a)
		{
			System.out.print(dato+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =300;
		Integer a [] = new Integer[num];
		Integer b[] = new Integer[num];
		
		
		System.out.println("Selection: ");
		Principal_ordenamineto p = new Principal_ordenamineto();
		p.llenarArray(a);
		System.out.println("El arreglo original: ");
		p.imprimirArray(a);
		Quick_sort.sort(a);
		System.out.println("El arreglo ordenado: ");
		p.imprimirArray(a);
		
		
	}

}
