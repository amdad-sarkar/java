class Fibnacci 
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		System.out.println(n1+""+n2);
		int n=2;
		int m=7;
		int sum=0;
		for (int i=n;i<=m ;i++ )
		{
			sum=n1+n2;
			System.out.println(""+sum);
			n1=n2;
			n2=sum;
		}
	}
}
