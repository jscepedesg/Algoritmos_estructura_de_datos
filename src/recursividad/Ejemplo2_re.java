package recursividad;

public class Ejemplo2_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("La potencia es: "+getPotencia(2,15));
	}
	
	public static int getPotencia(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		else
		{
			return a*getPotencia(a,b-1);
		}
		
	}

}
