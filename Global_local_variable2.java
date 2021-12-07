class  Global_local_variable2
{
	//global variable
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		//local variable
		int a=21;
		int b=22;
		System.out.println(a);
		System.out.println(b);
		System.out.println(nonprimitive.a);
		System.out.println(nonprimitive.b);
	}
}
