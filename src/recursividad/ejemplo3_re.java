package recursividad;

public class ejemplo3_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("La multiplicacion es: "+getMul(4,5));
	}
	
	public static int getMul(int a,int b)
	{
		if(b==0)
		{
			return 0;
		}
		else
		{
			return a+getMul(a,b-1);
		}
		
	}

}
