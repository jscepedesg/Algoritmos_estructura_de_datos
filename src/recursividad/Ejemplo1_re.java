package recursividad;
//Factorial n!
public class Ejemplo1_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("El factorial es: "+getFactorial(5));
	}

	public static int getFactorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
		return n*getFactorial(n-1);
		}
	}
	
}
