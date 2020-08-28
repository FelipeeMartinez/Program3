package recursividad;

public class Potencia 
{
	public static void main (String [] args) 
	{
		int x = potencia(2,3);
		System.out.print("resultado: " + x);
	}
	
	public static int potencia(int a , int b) 
	{
		if(b == 0) 
		{
			return 1 ;
		}
		else  
		{
			return a * potencia(a, b-1);
		}
	}

}
