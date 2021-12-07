class Largest_value
//using if_else
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=32;
		int c=43;
		int d=34;
		int e=54;
		if (a>b && a>c && a>d && a>e)
		{
			System.out.println(a);
		}
		else if (b>c && b>d && b>e)
		{
			System.out.println(b);
		}
		else if (c>d && c>e)
		{
			System.out.println(c);
		}
		else if (d>e)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println(e);
		}
		
	}
}
