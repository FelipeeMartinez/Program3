package recursividad;

public class Division 
{
	public static void main (String [] args) 
	{
		int x = resta(60 , 15);
		System.out.print("resultado: " + x);
	}
	
	public static int resta(int a, int b) 
	{
		if(a < b) 
		{
			return a;
		}
		else 
		{
			return 1 + resta(a-b, b);
		}
	}

}
