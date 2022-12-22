import java.io.*;
import java.util.*;
class evenodd
{
	public static void main(String args[])
	{
		int n;
		System.out.println("give some number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.print("given number is even");
		}
		else
		{
			System.out.print("given number is odd");
		}
	}
}
		