package recursividad;

public class Ejemplo6_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFogo(50));
	}

	public static int getFogo(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		
		else
		{
			return getFogo(n-1)+getFogo(n-2);
		}		
	}
}
