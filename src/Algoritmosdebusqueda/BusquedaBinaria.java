package Algoritmosdebusqueda;

public class BusquedaBinaria {

	public static int buscar(Comparable a[],Comparable clave)
	{
		int lo=0;
		int hi =a.length-1;
		int mid;
		
		while(lo<=hi)
		{
			mid=(lo+hi)/2;
			if(a[mid].compareTo(clave)==0)
			{
				return mid;
			}
			else
			{
				if(a[mid].compareTo(clave)>0)
				{
					hi=mid-1;
				}
				else
				{
					lo=mid+1;
				}
			}
		}
		
		return -1;
	}
}
