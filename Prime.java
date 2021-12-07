class  Prime
     {

	public static void main(String[] args) 
		{

		for (int i=2; i<=100 ;i++ )
			{
			int count=0;
		
		for (int j=i/2;j>=2 ;j-- )
			{
			if (i%j==0)
			{
				count++;
			}
		    }
		if (count==0)
		{
			System.out.println(i);
		}
	        }

        }
     }