import java.util.Scanner;
class Armstrongnumber1 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter Armstrongnumber" );
		int n= input.nextInt();
		int rem,res=0;
		int temp=n;
		while(n!=0)
		{
			rem = n%10;
			res = res+(rem*rem*rem);
			n=n/10;
		}
		if (temp==res)
		{
			System.out.println(temp+"is a  Armstrongnumber number" );
		}
		else
		{
			System.out.println(temp+"is not a  Armstrongnumber" );
		}
	}
}
