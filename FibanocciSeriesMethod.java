


public class FibanocciSeriesMethod 
	{
	public static void printFibanocciSeries(int number) 
		{
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		for(int i = 1; i<=number; i++) 
			{
			int sum = a + b;
			System.out.print(" " +sum+ " ");
			a = b;
			b = sum;
		    }
	    }
	public static void main(String[] args) 
		{
		int n = 5; 
		printFibanocciSeries(n);
	    }
}

