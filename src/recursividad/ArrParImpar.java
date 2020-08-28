package recursividad;

public class ArrParImpar 
{
	public static void main (String [] args) 
	{
		int [] arre = new int[] {2,7,9,13,8};
		System.out.print("Numeros Pares  " + par(arre, 0) + "    ");
		System.out.print("Numeros Pares  " + impar(arre, 0));
		
	}
	
	public static int par(int arre [] , int posicion) 
	{ 
		if(posicion < arre.length) 
		{
			if (arre[posicion]%2 == 0) 
			{
				
				return arre[posicion];
			}
			posicion++;
			return arre[posicion];
		}
		else 
		{
			return 0;
		}
	}
	
	public static int impar(int arre [] , int posicion) 
	{ 
		if(posicion < arre.length) 
		{
			if (arre[posicion]%2 != 0) 
			{
				
				return arre[posicion];
			}
			posicion++;
			return arre[posicion];
		}
		else 
		{
			return 0;
		}
	}
}	
	
