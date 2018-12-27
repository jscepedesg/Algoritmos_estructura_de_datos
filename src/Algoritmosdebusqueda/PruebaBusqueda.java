package Algoritmosdebusqueda;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Algoritmos_de_ordenamiento.Quick_sort;

public class PruebaBusqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer vec[]= new Integer[500];
		int encontrado;
		int clave;
		setLlenar(vec);
		setImprimir(vec);
		Quick_sort.sort(vec);
		System.out.println("El arreglo ordenado es:");
		setImprimir(vec);
		clave= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
		encontrado=BusquedaLineal.buscar(vec,clave);
		
		if(encontrado>=0)
		{
			System.out.println("El Elemento: "+vec[encontrado]+" Esta en la posicion "+(encontrado+1));
		}
		else
		{
			System.out.println("El elmento no esta en la lista");
		}
	}

	public static void  setLlenar(Integer vec[])
	{
		for(int a=0;a<vec.length;a++)
		{
			vec[a]=(int)(Math.random()*10000+1);;
		}
	}
	
	public static void setImprimir(Integer vec[])
	{
		for(int a=0;a<vec.length;a++)
		{
			System.out.print(vec[a]+" ");
		}
		System.out.println();
	}
}
