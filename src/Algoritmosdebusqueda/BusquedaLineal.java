package Algoritmosdebusqueda;

public class BusquedaLineal {

	public static int buscar(Comparable[] vec,Comparable clave)
	{
		int i=0;
		while(i<vec.length)
		{
			if(vec[i]==clave){return i;}
			i++;
		}
		
		return -1;
	}
}
