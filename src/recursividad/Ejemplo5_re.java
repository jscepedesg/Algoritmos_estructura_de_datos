package recursividad;

public class Ejemplo5_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arreglo[] = new int [2000];
		
		setLlenar(arreglo);
		setImprimir(arreglo,arreglo.length);
		System.out.println();
		setImprimirinv(arreglo,0);
	}
	
	private static void setLlenar(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]= (int)(Math.random()*100+1);
		}
	}
	
	public static void setImprimir(int a[],int tam)
	{
		if(tam==1)
		{
			System.out.print(a[tam-1]+" ");
		}
		else
		{
			setImprimir(a,tam-1);
			System.out.print(a[tam-1]+" ");
		}
	}
	
	public static void setImprimirinv(int a[],int tam)
	{
		if(tam==a.length-1)
		{
			System.out.print(a[tam]+" ");
		}
		else
		{
			setImprimirinv(a,tam+1);
			System.out.print(a[tam]+" ");
		}
	}

}
