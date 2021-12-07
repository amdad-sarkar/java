import java.util.Scanner;

public class ArmStrongMethod 
	{
	public static void armStrong(int number) 
		{
		int temp = number;
    	int results = 0;
    	while(number != 0) 
			{
    		int remainder = number % 10;
    		 results = (int) (results + Math.pow(remainder, 3));
    		number = number / 10;
    	    }
    	if( results == temp) 
			{
    		System.out.println(temp+ " is a Armstrong!");
    	    }
    	else 
			{
    		System.out.println(temp+ " Not an Armstrong!");
    	    }
	    }
	public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number: ");
    	int number  = sc.nextInt();
    	armStrong(number);

	    }

}