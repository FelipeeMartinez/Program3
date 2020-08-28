package recursividad;

public class ArregloSuma 
{
	public static void main (String [] args) 
	{
		int [] arre = new int[] {1,3,4};
		System.out.print("resultado: " + sumar(arre, 0));
		
	}
	
	public static int sumar(int arre [] , int posicion) 
	{ 
		if(posicion < arre.length) 
		{
			return arre[posicion] + sumar(arre, posicion + 1);
		}
		else  
		{
			return 0;
		}
	}

}
