package recursividad;

public class Factorial
{
	public static void main (String [] args) 
	{
		int x = factorial(5);
		System.out.print("resultado: " + x);
	}
	
	public static int factorial(int a ) 
	{
		if(a == 0) 
		{
			return 1 ;
		}
		else  
		{
			return  a* factorial( a - 1);
		}
	}


}
