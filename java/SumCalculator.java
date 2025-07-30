import java.util.Scanner;
public class SumCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value of X");
		int x=sc.nextInt();
		System.out.println("Please enter value of Y");
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("Sum Of "+x+" and "+y+" is "+z);
        sc.close();
	}
}