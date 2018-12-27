package recursividad;

public class Ejemplo4_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSuman(9));
	}
	
	public static int getSuman(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+getSuman(n-1);
		}		
	}

}
