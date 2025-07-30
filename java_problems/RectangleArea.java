import java.util.Scanner;
public class RectangleArea {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of rectangle:");
		int x=sc.nextInt();
		System.out.println("Please enter the breadth of rectangle:");
		int y=sc.nextInt();
		int z=x*y;
		System.out.println("Area Of rectangle with "+x+" and "+y+" is "+z);
        sc.close();
	}
}

