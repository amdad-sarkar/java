import java.util.Scanner;
class  StudentData
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=input.nextLine();

		System.out.println("+Enter BatchCode");
		String batchcode = input.next();

		System.out.println("Enter Your Age");
		int age = input.nextInt();

		System.out.println("Enter SSC Marks");
	    double ssc = input.nextDouble();

		System.out.println("Enter Inter Marks");
		double inter = input.nextDouble();

		System.out.println("Enter Your Stream");
		String stream = input.next();

		System.out.println("Enter Your Degree Marks");
		double degree = input.nextDouble();

		System.out.println("Students details");
		System.out.println("*************************");
		System.out.println("Name: "+ name);
		System.out.println("batch code: "+ batchcode);
		System.out.println("age: "+ age);
		System.out.println("ssc marks: "+ ssc);
		System.out.println("inter marks: "+ inter);
		System.out.println("stream: "+ stream);
		System.out.println("degree marks: "+ degree);
	}
}
